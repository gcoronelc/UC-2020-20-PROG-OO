package pe.uc.efgrupo20.controller;

import java.util.List;
import pe.uc.efgrupo20.model.MovimientoModel;
import pe.uc.efgrupo20.service.EurekaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class EurekaController {
	
	private EurekaService eurekaService;

	public EurekaController() {
		eurekaService = new EurekaService();
	}

	public List<MovimientoModel> consultaMovimientos(String cuenta){
		return eurekaService.consultaMovimientos(cuenta);
	}

}
