package com.krakedev;

public class Producto {

	 /* 3. Crear una clase
	 * Producto con los atributos nombre - String descripcion - String precio -
	 * punto flotante stockActual - entero 
	 */
	
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	
	
}
