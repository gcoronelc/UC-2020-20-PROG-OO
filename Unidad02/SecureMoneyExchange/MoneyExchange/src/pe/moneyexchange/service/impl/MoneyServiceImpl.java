package pe.moneyexchange.service.impl;

import pe.moneyexchange.service.MoneyService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class MoneyServiceImpl implements MoneyService {

	private final double TC_DOLARES = 4.15;
	private final double TC_EUROS = 4.83;

	@Override
	public double solesToDolares(double soles) {
		double importe;
		importe = soles / TC_DOLARES;
		return importe;
	}

	@Override
	public double solesToEuros(double soles) {
		double importe;
		importe = soles / TC_EUROS;
		return importe;
	}

	@Override
	public double dolaresToSoles(double dolares) {
		double importe;
		importe = dolares * TC_DOLARES;
		return importe;
	}

	@Override
	public double eurosToSoles(double euros) {
		double importe;
		importe = euros * TC_EUROS;
		return importe;
	}

}
