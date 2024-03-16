package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
	Producto pro = new Producto("Pan",0.20);

	double respuesta=pro.calcularPrecioPromo(15);
	
	System.out.println("Nombre: "+pro.getNombre());
	System.out.println("Precio: "+pro.getPrecio());
	System.out.println("Descuent: "+respuesta);
	
	

	}
}
