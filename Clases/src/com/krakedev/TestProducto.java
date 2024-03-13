package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		/*4. Crear una clase TestProducto con un
	 * main, dentro del mismo: Crear 3 variables de tipo Producto, llamadas
	 * productoA, productoB, productoC Instanciar 3 objetos producto y referenciar
	 * cada uno con una de las variables del paso anterior Modificar los atributos
	 * de cada producto, con productos que hay en una farmacia Mostrar en pantalla
	 * los valores de los atributos de los 3 objetos*/
		
		Producto  productoA = new Producto();
		Producto  productoB = new Producto();
		Producto  productoC = new Producto();

		productoA.nombre="Paracetamol";
		productoA.descripcion="fiebre";
		productoA.precio=1.5;
		productoA.stockActual=5;
		
		productoB.nombre="Ibuprofeno";
		productoB.descripcion="dolor muscular";
		productoB.precio=0.45;
		productoB.stockActual=12;
		
		productoC.nombre="Femen";
		productoC.descripcion="dolor de abdomen";
		productoC.precio=0.50;
		productoC.stockActual=120;
		
		
		System.out.println("Producto A-----------------");
		System.out.println("Nombre:  "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		
		System.out.println("Producto B-----------------");
		System.out.println("Nombre:  "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		
		System.out.println("Producto C-----------------");
		System.out.println("Nombre:  "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		

	}

}
