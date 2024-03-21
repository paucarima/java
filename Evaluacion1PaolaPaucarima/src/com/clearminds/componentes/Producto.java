package com.clearminds.componentes;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;

	/*
	 * • Método incrementarPrecio: recibe como parámetro un porcentaje de incremento
	 * de tipo entero, no tiene retorno. Calcula el porcentaje de incremento y le
	 * suma al precio actual. Ejemplo: si el precio actual es 0.50 y se invoca a
	 * incrementar Precio(10), debe incrementar el 10% al precio actual, es decir el
	 * nuevo precio debe ser 0,55 • Método disminuirPrecio: recibe un valor de
	 * descuento de tipo double, no retorna nada. Resta el valor de descuento al
	 * precio actual. 
	 */
	public void incrementarPrecio(double porcentajeDeIncremento) {
		double incremento;
		double total;
		incremento = precio * (porcentajeDeIncremento / 100);
		total = precio + incremento;
		this.setPrecio(total);  
		
	}
	
	public void disminuirPrecio(double descuento) {
		double decremento;
		decremento = precio * (descuento / 100);
		double total = Math.round( precio - decremento);
		this.setPrecio(total);
	}
	
	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

}
