package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Pablo");
		Estudiante est2=new Estudiante("Pedro");
		
		est1.calificar(9);
		est2.calificar(7);
		
		System.out.println(est1.getNombre());
		System.out.println("-----Respuestas-1----"+	est1.getResultado());
		System.out.println(est2.getNombre());
		System.out.println("-----Respuestas-2----"+	est2.getResultado());
		
	


	}

}
