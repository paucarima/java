package com.krakedev.persistencia.entidades;

public class Profesor {
	private int codigo;
	private String nombre;
	
	
	public Profesor(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	

	public Profesor(int codigo) {
		super();
		this.codigo = codigo;
	
	}
	
	
	
	public Profesor() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		//return "Profesor [codigo=" + codigo + ", nombre=" + nombre + "]";
		return "Profesor [codigo=" + codigo + "]";
	}
	
	
}
