package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Estudiantes {

	
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private Date fecha_nacimiento;
	private Profesor codigo_profesor;
	private BigDecimal mensual;
	
	public Estudiantes() {
		super();
	}

	public Estudiantes(String cedula, String nombre, String apellido, String email, 
			Profesor codigo_profesor) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;

		this.codigo_profesor = codigo_profesor;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Profesor getCodigo_profesor() {
		return codigo_profesor;
	}

	public void setCodigo_profesor(Profesor codigo_profesor) {
		this.codigo_profesor = codigo_profesor;
	}

	public BigDecimal getMensual() {
		return mensual;
	}

	public void setMensual(BigDecimal mensual) {
		this.mensual = mensual;
	}

	@Override
	public String toString() {
		return "Estudiantes [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", codigo_profesor=" + codigo_profesor + ", mensual="
				+ mensual + "]";
	}
	
	
	
	
	
	
}
