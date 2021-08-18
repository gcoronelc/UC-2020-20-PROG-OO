package pe.ucont.appdemo01.prueba;

import pe.ucont.appdemo01.service.MateService;

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
		int num1 = 9;
		int num2 = 10;
		// Proceso
		MateService service = new MateService();
		int producto = service.producto(num1, num2);
		// Reporte
		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		System.out.println("Producto: " + producto);
	}

}
