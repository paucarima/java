package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		//lama la clase con el constructor
		AdminPersonas  admin= new AdminPersonas();
		//llama la funcion agregar de admin para  llenar datos
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Mario","Benedetti",25));
		admin.agregar(new Persona("Bruno","Diaz",50));
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("jOSE");
		//otra variable de persona para guardar resultado del nombre
		if(p1!=null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre Jose");
		}
		// creo una varialbe de tipo string para buscar mayores
		ArrayList<Persona>personasMayores=admin.buscarMayores(25);
		//imprimo esto,y listo
		System.out.println("mayores: "+personasMayores.size());
	}

}
