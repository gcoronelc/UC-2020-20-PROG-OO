package pe.uc.miproductoacademico.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.uc.miproductoacademico.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class PA3Grupo20Service {

	// Control de estado de un proceso y mensaje al usuario
	private int code;
	private String mensaje;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Simulación con la tabla producto. cuenta = idproducto nit = precio Este proceso se debe hacer contra la tabla cuenta;
	 */
	public int validar(int cuenta, int nit) {
		String sql = "select count(1) cant from producto "
				  + "where idproducto = ? and precio = ?";
		Connection cn = null;
		this.code = 1;
		this.mensaje = "";
		try {
			cn = AccesoDB.getConnection();
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cuenta);
			pstm.setInt(2, nit);
			ResultSet rs = pstm.executeQuery();
			rs.next(); // Trae la primera fila, si no la encuentra retorna false.
			int cant = rs.getInt("CANT");
			if (cant == 0) {
				this.code = -1;
				this.mensaje = "Datos incorrectos.";
			}
			rs.close();
			pstm.close();
		} catch (Exception e) {
			this.code = -1;
			this.mensaje = "Error en el proceso, intentelo mas tarde.";
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return this.code;
	}

	public int regVenta(int idcliente, int idproducto, int cantidad) {
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		this.code = 1;
		this.mensaje = "";
		try {
			cn = AccesoDB.getConnection();
			// Inicia la Tx
			cn.setAutoCommit(false);
			// Leer datos del producto
			sql = "select precio, stock from producto where idproducto = ? for update";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idproducto);;
			rs = pstm.executeQuery();
			if (!rs.next()) {
				throw new SQLException("Producto no existe.");
			}
			double precio = rs.getDouble("PRECIO");
			int stock = rs.getInt("STOCK");
			rs.close();
			pstm.close();
			if (stock <= 0) {
				throw new SQLException("No hay stock.");
			}
			if (stock < cantidad) {
				throw new SQLException("No hay stock suficiente.");
			}
			// Calculos
			double total = precio * cantidad;
			double subtotal = total / 1.18;
			double impuesto = total - subtotal;
			// Registrar venta
			sql = "INSERT INTO VENTA(IDVENTA,IDPRODUCTO,IDCLIENTE,"
					  + "FECHA,PRECIO,CANTIDAD,SUBTOTAL,IMPUESTO,TOTAL) "
					  + "VALUES(SQ_VENTA.NEXTVAL,?,?,SYSDATE,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, idproducto);
			pstm.setInt(2, idcliente);
			pstm.setDouble(3, precio);
			pstm.setInt(4, cantidad);
			pstm.setDouble(5, subtotal);
			pstm.setDouble(6, impuesto);
			pstm.setDouble(7, total);
			pstm.executeUpdate();
			pstm.close();
			// Actualizar stock
			stock = stock - cantidad;
			sql = "UPDATE producto SET stock = ? where idproducto = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, stock);
			pstm.setInt(2, idproducto);
			pstm.executeUpdate();
			pstm.close();
			// Confirmar Tx
			cn.commit();
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			this.code = -1;
			this.mensaje = e.getMessage();
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			this.code = -1;
			this.mensaje = "Error en el proceso, intentelo mas tarde.";
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return this.code;
	}

}
