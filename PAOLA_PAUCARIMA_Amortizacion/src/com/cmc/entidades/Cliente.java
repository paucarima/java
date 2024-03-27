package com.cmc.entidades;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public Cliente(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void mostrarCliente() {
		System.out.println(
				"Nombre: "+this.nombre
				+" Apellido: "+this.apellido
				+" Cedula: "+this.cedula);
	}
	
	
	
}
