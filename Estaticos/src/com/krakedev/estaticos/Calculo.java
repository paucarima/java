package com.krakedev.estaticos;

public class Calculo {
	//final hace que el valor no se puede cambiar, es decir convierte la variable en constante
	private final double iva=12;
	
	public double calcularIva(double monto) {
		return monto*iva/100;
	}
}
