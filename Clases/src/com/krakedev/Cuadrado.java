package com.krakedev;
/**/
public class Cuadrado {
	public double lado;
	
	
	public double calcularArea() {
		double respuesta;
		respuesta=Math.pow(lado, 2);
		return respuesta;
	}
	
	public double calcularPerimetro() {
		double respuesta;
		respuesta=lado*4;
		return respuesta;
	}
	

}
