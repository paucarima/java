package com.cmc.evaluacion;

public class Utilitario {
	public static double redondear(double datoNum) {
		double redondeado=Math.round(datoNum*100.0)/100.0;
		return redondeado;
	}
}
