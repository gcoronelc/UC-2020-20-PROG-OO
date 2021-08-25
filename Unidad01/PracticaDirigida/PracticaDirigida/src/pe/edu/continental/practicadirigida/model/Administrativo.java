package pe.edu.continental.practicadirigida.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Administrativo extends Personal {

	private String cargo;
	private int horasExtras;

	public Administrativo() {
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double getSueldo() {
		double sueldo = 0.0;
		switch (cargo.toUpperCase()) {
			case "GERENTE":
				sueldo = 12000.00;
				break;
			case "JEFE":
				sueldo = 8000.00;
				break;
			case "COORDINADOR":
				sueldo = 6000.00;
				break;
			case "EMPLEADO":
				sueldo = 4500.00;
				break;
			case "ASISTENTE":
				sueldo = 3500.00;
				break;
		}
		return sueldo;
	}

}
