package pe.uc.miproductoacademico.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	 * Simulación con la tabla producto.
	 * cuenta = idproducto
	 * nit = precio
	 * Este proceso se debe hacer contra la tabla cuenta;
	 */
	public int validar(int cuenta, int nit){
		String sql = "select count(1) cant from producto "
				  + "where idproducto = ? and precio = ?";
		Connection cn = null;
		this.code = 1;
		this.mensaje = "";
		try {
			cn  = AccesoDB.getConnection();
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cuenta);
			pstm.setInt(2, nit);
			ResultSet rs = pstm.executeQuery();
			rs.next(); // Trae la primera fila, si no la encuentra retorna false.
			int cant = rs.getInt("CANT");
			if(cant == 0){
				this.code = -1;
				this.mensaje = "Datos incorrectos.";
			}
			rs.close();
			pstm.close();
		} catch (Exception e) {
			this.code = -1;
			this.mensaje = "Error en el proceso, intentelo mas tarde.";
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return this.code;
	}
	

}
