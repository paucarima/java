package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	
	
	public Item(int productosActuales) {
	
		this.productosActuales = productosActuales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Producto nombre: " + getNombre());
		System.out.println("Productos Actuales: " + getProductosActuales());
		System.out.println("Productos Devueltos: " + getProductosDevueltos());
		System.out.println("Productos Vendidos: " + getProductosVendidos());
	}

	public void vender(int cantidad) {

		productosActuales -= cantidad;
		productosVendidos += cantidad;
	}

	public void devolver(int cantidad) {

		productosActuales += cantidad;

		productosVendidos -= cantidad;

		productosDevueltos += cantidad;
	}

}
