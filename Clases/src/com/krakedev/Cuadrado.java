package com.krakedev;
/**/
public class Cuadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double calcularArea() {
	
		area=Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {

		perimetro=lado*4;
		return perimetro;
	}
	

}
