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
		//2.1.Modificar los atributos
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
				
				
		
		

	}

}
