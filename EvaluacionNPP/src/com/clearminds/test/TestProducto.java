package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto=new Producto("KE34","Papitas",0.85);
		System.out.println("Código:"+producto.getCodigo());
		System.out.println("Nombre:"+producto.getNombre());
		System.out.println("Precio:"+producto.getPrecio());
		System.out.println("*************************************");
		producto.setPrecio(0.90);
		System.out.println("Nuevo Precio:"+producto.getPrecio());
		
		double incrementar=producto.incrementarPrecio(50);
		producto.setPrecio(incrementar);
		System.out.println("Precio incrementado:"+producto.getPrecio());
		
		double descuento=producto.disminuirPrecio(0.35);
		producto.setPrecio(descuento);
		System.out.println("Precio descuento :"+producto.getPrecio());
		producto.getPrecio();
		
	}
}
	