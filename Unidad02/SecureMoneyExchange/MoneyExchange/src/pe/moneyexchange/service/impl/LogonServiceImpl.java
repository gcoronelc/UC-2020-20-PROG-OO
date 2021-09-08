package pe.moneyexchange.service.impl;

import pe.moneyexchange.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonServiceImpl extends MensajeAbstract implements LogonService {

	@Override
	public boolean validar(String usuario, String clave) {
		boolean estado;
		this.setCode(1);
		estado = (usuario.equals("123456") && clave.equals("7890"));
		if (!estado) {
			this.setCode(-1);
			this.setMensaje("Datos incorrectos");
		}
		return estado;
	}

}
