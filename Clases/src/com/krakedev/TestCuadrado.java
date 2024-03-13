package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cua1 = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		Cuadrado cua3 = new Cuadrado();

		double area1;
		double perimetro1;
		double area2;
		double perimetro2;
		double area3;
		double perimetro3;

		cua1.lado = 10;
		cua2.lado = 4;
		cua3.lado = 8;

		area1 = cua1.calcularArea();
		perimetro1 = cua1.calcularPerimetro();
		area2 = cua2.calcularArea();
		perimetro2 = cua2.calcularPerimetro();
		area3 = cua3.calcularArea();
		perimetro3 = cua3.calcularPerimetro();
		

		System.out.println("Area de cuadrado 1: " + area1);
		System.out.println("Perimetro: " + perimetro1);
		
		System.out.println("Area de cuadrado 2: " + area2);
		System.out.println("Perimetro: " + perimetro2);
		
		System.out.println("Area de cuadrado 3: " + area3);
		System.out.println("Perimetro: " + perimetro3);

	}

}
