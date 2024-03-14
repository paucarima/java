package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		Persona p; //1.Declaro una varable p de tipo persona
		p=new Persona();//2.Instaciar un objeto Persona, referneciar
		Persona p2=new Persona();
		
		p.setNombre("Mario");
		p2.setNombre("Angelina");
		
		//3.acceder a los atributos
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
	
		
		
		System.out.println("*******************");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
	
		//4.Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("-----------------------");
		//5.Accedo a los atributos
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		

	}

}
