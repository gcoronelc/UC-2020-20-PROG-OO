package pe.edu.continental.practicadirigida.service;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import pe.edu.continental.practicadirigida.model.Administrativo;
import pe.edu.continental.practicadirigida.model.DocenteTiempoCompleto;
import pe.edu.continental.practicadirigida.model.DocenteTiempoParcial;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class UniversidadService {
	
	private List<Administrativo> administrativos;
	private List<DocenteTiempoCompleto> docentesTiempoCompleto;
	private List<DocenteTiempoParcial> docentesTiempoParcial;

	public UniversidadService() {
		administrativos = new ArrayList<>();
		docentesTiempoCompleto = new ArrayList<>();
		docentesTiempoParcial = new ArrayList<>();
	}

	public List<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public List<DocenteTiempoCompleto> getDocentesTiempoCompleto() {
		return docentesTiempoCompleto;
	}

	public List<DocenteTiempoParcial> getDocentesTiempoParcial() {
		return docentesTiempoParcial;
	}
	
	public void registrarAdministrativo(Administrativo bean){
		administrativos.add(bean);
	}

}
