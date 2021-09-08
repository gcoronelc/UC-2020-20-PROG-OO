package pe.moneyexchange.prueba;

import pe.moneyexchange.service.LogonService;
import pe.moneyexchange.service.impl.LogonServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba05 {
	
	public static void main(String[] args) {
		// Variables
		String usuario = "1234563";
		String clave = "7890";
		// Proceso
		LogonService service = new LogonServiceImpl();
		boolean estado = service.validar(usuario, clave);
		// Reporte
		System.out.println("Estado: " + estado);

	}

}
