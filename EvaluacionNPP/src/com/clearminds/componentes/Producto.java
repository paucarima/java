package com.clearminds.componentes;

public class Producto {

	private String codigo;
	private String nombre;
	private double precio;

	public double incrementarPrecio(double porcentajeDeIncremento) {
		double incremento;
		double total;
		incremento = precio * (porcentajeDeIncremento / 100);
		total = precio + incremento;
		return total;
	}

	public double disminuirPrecio(double descuento) {
		double decremento;
		decremento = precio * (descuento / 100);
		double total = precio - decremento;
		return Math.round(total);
		
	}

	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;

	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
