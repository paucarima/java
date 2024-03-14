package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		/*
		 * 2. Crear una clase TestAuto con un main, dentro del main: Instanciar dos
		 * autos y referenciarlos con las variables autol y auto2 Modificar los valores
		 * de los atributos de cada auto Mostrar los valores de los atributos de los dos
		 * autos en consola Si todo funciona ok hacer un commit 
		 */
		Auto auto1=new Auto("Mercedes Benz",2010,35000.80);
		Auto auto2=new Auto("Toyota",2000,45000.80);
		//2.1.Modificar los atributos
				/*auto1.setMarca("Mercedes Benz");
				auto1.setAnio(2010);
				auto1.setPrecio(35000.80);
				
				auto2.setMarca("Toyota");
				auto2.setAnio(2000);
				auto2.setPrecio(45000.80);*/
				
			
				
				System.out.println("Auto 1 ----------------");
				System.out.println("Nombre: "+auto1.getMarca());
				System.out.println("Año: "+auto1.getAnio());
				System.out.println("Precio: "+auto1.getPrecio());
				System.out.println("Auto 2 ----------------");
				System.out.println("Nombre: "+auto2.getMarca());
				System.out.println("Año: "+auto2.getAnio());
				System.out.println("Precio: "+auto2.getAnio());
				
				
		
		

	}

}
