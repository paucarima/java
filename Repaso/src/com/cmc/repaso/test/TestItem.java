 package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
	/* Desde un Test, instanciar un objeto y setear
		 * productosActuales con el valor 20, invocar a imprimir, ver los valores
		 * iniciales. Probar todos los métodos. Crear otro producto y probar los mismos
		 * métodos
		 */
		
		Item item1=new Item(20);
		Item item2=new Item(30);
		
		item1.setNombre("Mayonesa");

		item1.imprimir();
		System.out.println("*******VENTAS**********");
		item1.vender(2);
		item1.imprimir();
		System.out.println("********DEVOLUCION*********");
		item1.devolver(4);
		item1.imprimir();
		
		System.out.println("********OTRO PRODUCTO*********");
		item2.setNombre("Salsa de Tomate");
		item2.vender(6);
		item2.devolver(2);
		item2.imprimir();
		
		
	
		 

	}

}
