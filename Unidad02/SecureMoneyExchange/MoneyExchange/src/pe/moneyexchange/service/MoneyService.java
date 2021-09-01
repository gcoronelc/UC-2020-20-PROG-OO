package pe.moneyexchange.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public interface MoneyService {

	/**
	 * Convierte soles a dolares.
	 *
	 * @param soles Importe en soles.
	 * @return Retorna el importe equivalente en dolares.
	 */
	public double solesToDolares(double soles);

	public double solesToEuros(double soles);

	public double dolaresToSoles(double dolares);

	public double eurosToSoles(double euros);

}
