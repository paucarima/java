package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDividir;
		double resultadoPromedio;
	
		
		calcu=new Calculadora();
		
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(10, 3);
		resultadoMulti=calcu.multiplicar(10, 5);
		resultadoDividir=calcu.dividir(10, 2);
		resultadoPromedio=calcu.promediar(8, 9, 10);
		
		
		
		System.out.println("Resultado SUMA: "+resultadoSuma);
		System.out.println("Resultado RESTA: "+resultadoResta);
		System.out.println("Resultado MULTIPLICAR: "+resultadoMulti);
		System.out.println("Resultado DIVIDIR: "+resultadoDividir);
		System.out.println("Resultado PROMEDIO: "+resultadoPromedio);
		System.out.println("Resultado MENSAJE: ");
		calcu.mostrarResultados();

	}

}
