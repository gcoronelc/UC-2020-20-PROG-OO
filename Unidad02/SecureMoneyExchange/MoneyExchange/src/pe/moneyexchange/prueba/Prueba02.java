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
public class Prueba02 {
	
	public static void main(String[] args) {
		// Variables
		double soles, euros;
		// Datos
		soles = 1000.0;
		// Proceso
		MoneyService service = new MoneyServiceImpl();
		euros = service.solesToEuros(soles);
		// Reporte
		System.out.println("Soles: " + soles);
		System.out.println("Euros: " + euros);
		
	}

}
