package pe.uc.miproductoacademico.prueba;

import java.sql.Connection;
import pe.uc.miproductoacademico.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		try {
			Connection cn = AccesoDB.getConnection();
			System.out.println("Conexion ok");
			cn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
