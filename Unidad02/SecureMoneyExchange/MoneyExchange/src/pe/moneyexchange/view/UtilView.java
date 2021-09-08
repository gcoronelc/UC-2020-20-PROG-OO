package pe.moneyexchange.view;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class UtilView {
	
	
	
	static String textProceso( int op){
		String texto = "";
		switch(op){
			case 1:
				texto = "Bienvenido a CASA DE CAMBIO";
				texto += "\nUsuario: ";
				break;
			case 3:
				texto = "\nClave: ";
				break;
		}
		return texto;
	}

}
