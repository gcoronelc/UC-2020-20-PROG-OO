package pe.edu.continental.practicadirigida.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public abstract class Docente extends Personal{

	private String grado;
	private boolean investiga;

	public Docente() {
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public boolean isInvestiga() {
		return investiga;
	}

	public void setInvestiga(boolean investiga) {
		this.investiga = investiga;
	}
	
	
	
}
