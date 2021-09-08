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



	@Override
	public double solesToDolares(double soles) {
		double importe;
		importe = soles / Data.TC_DOLARES;
		return importe;
	}

	@Override
	public double solesToEuros(double soles) {
		double importe;
		importe = soles / Data.TC_EUROS;
		return importe;
	}

	@Override
	public double dolaresToSoles(double dolares) {
		double importe;
		importe = dolares * Data.TC_DOLARES;
		return importe;
	}

	@Override
	public double eurosToSoles(double euros) {
		double importe;
		importe = euros * Data.TC_EUROS;
		return importe;
	}

	@Override
	public int obtenerSaldo() {
		return Data.saldo;
	}

}
