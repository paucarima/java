package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cua1 = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		Cuadrado cua3 = new Cuadrado();


		cua1.setLado(10);
		cua1.calcularArea();
		cua1.calcularPerimetro();
		
		cua2.setLado(4);
		cua2.calcularArea();
		cua2.calcularPerimetro();
		
		cua3.setLado(8);
		cua3.calcularArea();
		cua3.calcularPerimetro();
		

		System.out.println("Area de cuadrado 1: " + cua1.getArea());
		System.out.println("Perimetro: " + cua1.getPerimetro());
		
		System.out.println("Area de cuadrado 2: " + cua2.getArea());
		System.out.println("Perimetro: " + cua2.getPerimetro());
		
		System.out.println("Area de cuadrado 3: " + cua3.getArea());
		System.out.println("Perimetro: " + cua3.getPerimetro());

	}
	

}
