package demojdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;

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
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			String url = "jdbc:oracle:thin:@192.168.1.50:1521/XE";
			Connection cn = DriverManager.getConnection(url, "demo", "admin");
			System.out.println("Conexion ok");
			cn.close();
		} catch (Exception e) {
			System.err.println("Error loading driver: " + e.getMessage());
		}
	}

}
