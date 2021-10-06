package pe.uc.efgrupo20.prueba;

import java.util.List;
import pe.uc.efgrupo20.model.EmpleadoModel;
import pe.uc.efgrupo20.model.MovimientoModel;
import pe.uc.efgrupo20.service.EurekaService;
import pe.uc.efgrupo20.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		String cuenta = "00100001";
		// Proceso
		List<MovimientoModel> lista = null;
		try {
			// Proceso
			EurekaService service = new EurekaService();
			lista = service.consultaMovimientos(cuenta);
			// Reporte
			for (MovimientoModel model : lista) {
				System.out.println(model.getMoviNumero() + " - " + 
						  model.getMoviFecha() + " - " + model.getMoviImporte());
			}
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}

	}

}
