package pe.moneyexchange.prueba;

import pe.moneyexchange.service.LogonService;
import pe.moneyexchange.service.MoneyService;
import pe.moneyexchange.service.impl.LogonServiceImpl;
import pe.moneyexchange.service.impl.MoneyServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba06 {
	
	public static void main(String[] args) {
		// Variables

		// Proceso
		MoneyService service = new MoneyServiceImpl();
		int saldo = service.obtenerSaldo();
		// Reporte
		System.out.println("Saldo: " + saldo);

	}

}
