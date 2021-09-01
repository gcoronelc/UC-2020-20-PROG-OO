package pe.moneyexchange.prueba;

import pe.moneyexchange.service.MoneyService;
import pe.moneyexchange.service.impl.MoneyServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		// Variables
		double soles, dolares;
		// Datos
		dolares = 1000.0;
		// Proceso
		MoneyService service = new MoneyServiceImpl();
		soles = service.dolaresToSoles(dolares);
		// Reporte
		System.out.println("Dolares: " + dolares);
		System.out.println("Soles: " + soles);

	}

}
