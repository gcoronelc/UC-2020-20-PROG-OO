package pe.uc.efgrupo20.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class MovimientoModel {

	private String cuenCodigo;
	private Integer moviNumero;
	private String moviFecha;
	private String tipoNombre;
	private Double moviImporte;

	public MovimientoModel() {
	}

	public String getCuenCodigo() {
		return cuenCodigo;
	}

	public void setCuenCodigo(String cuenCodigo) {
		this.cuenCodigo = cuenCodigo;
	}

	public Integer getMoviNumero() {
		return moviNumero;
	}

	public void setMoviNumero(Integer moviNumero) {
		this.moviNumero = moviNumero;
	}

	public String getMoviFecha() {
		return moviFecha;
	}

	public void setMoviFecha(String moviFecha) {
		this.moviFecha = moviFecha;
	}

	public String getTipoNombre() {
		return tipoNombre;
	}

	public void setTipoNombre(String tipoNombre) {
		this.tipoNombre = tipoNombre;
	}

	public Double getMoviImporte() {
		return moviImporte;
	}

	public void setMoviImporte(Double moviImporte) {
		this.moviImporte = moviImporte;
	}

}
