package pe.uc.efgrupo20.prueba;

import pe.uc.efgrupo20.model.EmpleadoModel;
import pe.uc.efgrupo20.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		String usuario = "aramos";
		String clave = "china";
		// Proceso
		try {
			LogonService service = new LogonService();
			EmpleadoModel model = service.validar(usuario, clave);
			System.out.println("Hola: " + model.getNombre());
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}
