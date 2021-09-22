package pe.uc.miproductoacademico.prueba;

import java.sql.Connection;
import pe.uc.miproductoacademico.db.AccesoDB;
import pe.uc.miproductoacademico.service.PA3Grupo20Service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		int usuario = 1001;
		int nip = 450;
		// Proceso
		PA3Grupo20Service service = new PA3Grupo20Service();
		int code = service.validar(usuario, nip);
		String mensaje = service.getMensaje();
		// Reporte
		if(code == 1){
			System.out.println("Proceso ok.");
		} else {
			System.err.println(mensaje);
		}
	}

}
