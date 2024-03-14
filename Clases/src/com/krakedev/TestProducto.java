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

		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("fiebre");
		productoA.setPrecio(1.5);
		productoA.setStockActual(5);
		
		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("dolor muscular");
		productoB.setPrecio(0.45);
		productoB.setStockActual(12);
		
		productoC.setNombre("Femen");
		productoC.setDescripcion("dolor de abdomen");
		productoC.setPrecio(0.50);
		productoC.setStockActual(120);
		
		
		System.out.println("Producto A-----------------");
		System.out.println("Nombre:  "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		
		System.out.println("Producto B-----------------");
		System.out.println("Nombre:  "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		
		System.out.println("Producto C-----------------");
		System.out.println("Nombre:  "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		

	}

}
