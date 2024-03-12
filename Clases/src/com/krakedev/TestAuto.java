package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		/*
		 * 2. Crear una clase TestAuto con un main, dentro del main: Instanciar dos
		 * autos y referenciarlos con las variables autol y auto2 Modificar los valores
		 * de los atributos de cada auto Mostrar los valores de los atributos de los dos
		 * autos en consola Si todo funciona ok hacer un commit 
		 */
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//3.Modificar los atributos
				auto1.marca="Mercedes Benz";
				auto1.anio=2010;
				auto1.precio=35000.80;
				
				auto2.marca="Toyota";
				auto2.anio=2000;
				auto2.precio=45000.80;
				
				System.out.println("Auto 1 ----------------");
				System.out.println("Nombre: "+auto1.marca);
				System.out.println("Año: "+auto1.anio);
				System.out.println("Precio: "+auto1.precio);
				System.out.println("Auto 2 ----------------");
				System.out.println("Nombre: "+auto2.marca);
				System.out.println("Año: "+auto2.anio);
				System.out.println("Precio: "+auto2.precio);
				
				
		
		
		 /* 3. Crear una clase
		 * Producto con los atributos nombre - String descripcion - String precio -
		 * punto flotante stockActual - entero 4. Crear una clase TestProducto con un
		 * main, dentro del mismo: Crear 3 variables de tipo Producto, llamadas
		 * productoA, productoB, productoC Instanciar 3 objetos producto y referenciar
		 * cada uno con una de las variables del paso anterior Modificar los atributos
		 * de cada producto, con productos que hay en una farmacia Mostrar en pantalla
		 * los valores de los atributos de los 3 objetos
		 */

	}

}
