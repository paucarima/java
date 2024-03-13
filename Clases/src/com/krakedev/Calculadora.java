package com.krakedev;

public class Calculadora {

	public int sumar(int valor1, int valor2) {
		int resultado;// declarara la variable
		resultado = valor1 + valor2;
		return resultado;
	}

	public int restar(int valor1, int valor2) {
		int resultado;// declarara la variable
		resultado = valor1 - valor2;
		return resultado;
	}

	/*
	 * Función multiplicar Descripción Calcular el producto de una multiplicación de
	 * 2 números. Ejemplo: Recibimos 2 números: 10 y 5. Por lo cual al
	 * multiplicarlos el producto que debemos retornar seria 50 Parámetros
	 * valor1(double): 1er número a multiplicar valor2(double): 2do número a
	 * multiplicar Retorno El producto de la multiplicación (double)
	 */

	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}

	/*
	 * Función dividir Descripción Calcular el cociente de una división de 2
	 * números. Ejemplo: Recibimos el dividendo que es igual a 10 y el divisor que
	 * es igual a 2, por lo cual nuestro cociente es igual a 5. Parámetros dividendo
	 * (double): Es la cantidad que queremos repartir y por la cual realizamos la
	 * división. divisor (double): es el número por el cual dividiremos la cantidad
	 * indicada en el dividendo. Retorno El cociente de la división (double)
	 */

	public double dividir(double valor1, double valor2) {
		double resultado;
		resultado = valor1 / valor2;
		return resultado;
	}

	/*
	 * Función promediar Descripción Calcular el promedio de 3 números. Ejemplo:
	 * Recibimos el primer número que es igual a 10, el segundo que es igual a 8 y
	 * el tercero que es igual a 9. Ahora dividimos el total de la suma de los
	 * numero por el total de números que en este caso son 3, por lo tanto, el total
	 * del promedio seria 9. Parámetros valor1(double): 1er número a promediar
	 * valor2(double): 2do número a promediar valor3(double): 3er número a promediar
	 * Retorno El total del promedio (double).
	 */

	public double promediar(double valor1, double valor2, double valor3) {
		double resultado;
		resultado = (valor1 + valor2+ valor3)/3;
		return resultado;
	}
	
	public void  mostrarResultados() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en\r\n"
				+ "15 minutos");
	}
	 
}
