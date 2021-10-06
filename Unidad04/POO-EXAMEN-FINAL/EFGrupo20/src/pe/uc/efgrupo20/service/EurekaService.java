package pe.uc.efgrupo20.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.uc.efgrupo20.db.AccesoDB;
import pe.uc.efgrupo20.model.MovimientoModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class EurekaService {
	
	public List<MovimientoModel> consultaMovimientos(String cuenta){
		List<MovimientoModel> lista = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "";
		MovimientoModel model = null;
		try {
			cn = AccesoDB.getConnection();
			sql = "select cuenCodigo, moviNumero, "
				  + "to_char(moviFecha,'DD-MON-YYYY HH24:MI:SS') moviFecha, "
				  + "tipoNombre, moviImporte from v_movimientos "
				  + "where cuenCodigo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			rs = pstm.executeQuery();
			while(rs.next()){
				model = new MovimientoModel();
				model.setCuenCodigo(rs.getString("cuenCodigo"));
				model.setMoviNumero(rs.getInt("moviNumero"));
				model.setMoviFecha(rs.getString("moviFecha"));
				model.setTipoNombre(rs.getString("tipoNombre"));
				model.setMoviImporte(rs.getDouble("moviImporte"));
				lista.add(model);
			}
			rs.close();
			pstm.close();
		} catch (Exception e) {
			throw new RuntimeException("Error en la consulta de movimientos.");
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

}
