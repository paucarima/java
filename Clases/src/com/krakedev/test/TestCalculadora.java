package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
	
	
		
		calcu=new Calculadora();
		
		calcu.sumar(5, 3); 
		calcu.restar(10, 3);
		calcu.multiplicar(10, 5);
		calcu.dividir(10, 2);
		calcu.promediar(8, 9, 10);
		
		
		
		System.out.println("Resultado SUMA: "+calcu.getResultadoSuma());
		System.out.println("Resultado RESTA: "+calcu.getResultadoResta());
		System.out.println("Resultado MULTIPLICAR: "+calcu.getResultadoMulti());
		System.out.println("Resultado DIVIDIR: "+calcu.getResultadoDivi());
		System.out.println("Resultado PROMEDIO: "+calcu.getResultadoPro());
		System.out.println("Resultado MENSAJE: ");
		calcu.mostrarResultados();

	}

}
