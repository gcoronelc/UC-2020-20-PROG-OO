package pe.uc.efgrupo20.controller;

import pe.uc.efgrupo20.model.EmpleadoModel;
import pe.uc.efgrupo20.service.LogonService;
import pe.uc.efgrupo20.view.Session;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonController {

	public void validar(String usuario, String clave) {
		LogonService service = new LogonService();
		EmpleadoModel bean = service.validar(usuario, clave);
		Session.put("usuario", bean);
	}

}
