package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	public  void ingresarProducto(Producto pro, int stock) {
		this.producto=pro;
		this.stock=stock;
	}

	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	public Celda() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stockc) {
		this.stock = stockc;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	
}
