package pe.edu.continental.practicadirigida.prueba;

import java.util.List;
import pe.edu.continental.practicadirigida.model.Administrativo;
import pe.edu.continental.practicadirigida.service.UniversidadService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		UniversidadService service = new UniversidadService();
		Administrativo bean;
		
		// Administrativo 1
		bean = new Administrativo();
		bean.setCodigo(1);
		bean.setNombre("Gustavo");
		bean.setCargo("Gerente");
		bean.setHorasExtras(0);
		service.registrarAdministrativo(bean);
		
		// Administrativo 2
		bean = new Administrativo();
		bean.setCodigo(2);
		bean.setNombre("Karla");
		bean.setCargo("Jefe");
		bean.setHorasExtras(0);
		service.registrarAdministrativo(bean);
		
		// Administrativo 3
		bean = new Administrativo();
		bean.setCodigo(3);
		bean.setNombre("Ricardo");
		bean.setCargo("Coordinador");
		bean.setHorasExtras(0);
		service.registrarAdministrativo(bean);
		
		// Listado
		List<Administrativo> lista = service.getAdministrativos();
		String fila;
		for (Administrativo rec : lista) {
			fila = rec.getNombre() + " - ";
			fila += rec.getCargo() + " - ";
			fila += rec.getSueldo();
			System.out.println(fila);
		}
	}

}
