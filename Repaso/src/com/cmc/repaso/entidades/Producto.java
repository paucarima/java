package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
	
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
		
		if(precio>0) {
			precio=precio*-1;
			this.precio = precio;
		}
	}
	
	public double calcularPrecioPromo(double descuento) {
		
		double reduccion=getPrecio()*(descuento/100);
		double resultado=getPrecio()-reduccion;
		return resultado;
		
	}
	
	
	
	
	
	
}
