package pe.uc.miproductoacademico.prueba;

import pe.uc.miproductoacademico.service.PA3Grupo20Service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		// Datos
		int idproducto = 1001;
		int idcliente = 1002;
		int cant = 5;
		// Proceso
		PA3Grupo20Service service = new PA3Grupo20Service();
		int code = service.regVenta(idcliente, idproducto, cant);
		String mensaje = service.getMensaje();
		// Reporte
		if(code == 1){
			System.out.println("Proceso ok.");
		} else {
			System.err.println(mensaje);
		}
	}

}
