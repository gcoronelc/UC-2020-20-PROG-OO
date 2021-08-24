package pe.ec.viaexitos.prueba;

import pe.ec.viaexitos.dto.PagoDto;
import pe.ec.viaexitos.service.PagoService;

public class Prueba01 {

	public static void main(String[] args) {

		// Variable
		PagoDto dto = new PagoDto();
		
		// Datos
		dto.setDias(25);
		dto.setHorasDia(6);
		dto.setPagoHora(180.0);
		
		// Proceso
		PagoService service = new PagoService();
		dto = service.procSalario(dto);

		// Reporte
		System.out.println("Ingresos: " + dto.getIngreso());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Neto: " + dto.getNeto());


	}

}
