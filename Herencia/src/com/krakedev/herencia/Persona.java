package com.krakedev.herencia;

public class Persona {
	private String cedula;
	private String nombre;

	public Persona(String cedula, String nombre) {
		// super();
		this.cedula = cedula;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", getCedula()=" + getCedula() + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	/*public String toString() {
		return "nombre: "+nombre+" cedula: "+cedula;
	}*/
	
	

}
