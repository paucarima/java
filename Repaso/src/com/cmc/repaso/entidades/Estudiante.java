package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota) {
		 if(nota<8) {
			 setResultado("F");
		
		 }else if(nota>=8){
			 setResultado("A");
		 }
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
