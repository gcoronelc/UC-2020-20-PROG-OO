package pe.uc.miproductoacademico.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class AccesoDB {

	private AccesoDB() {
	}

	public static Connection getConnection() throws Exception {
		Connection cn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			String url = "jdbc:oracle:thin:@192.168.1.50:1521/XE";
			cn = DriverManager.getConnection(url, "UCPA2", "admin");
		} catch (Exception e) {
			throw e;
		}
		return cn;
	}
	
}
