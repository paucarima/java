package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		Persona p; //1.Declaro una varable p de tipo persona
		p=new Persona();//2.Instaciar un objeto Persona, referneciar
		Persona p2=new Persona();
		//3.acceder a los atributos
		System.out.println("nombre:"+p.nombre);
		System.out.println("edad:"+p.edad);
		System.out.println("estatura:"+p.estatura);
		
		p.nombre="Mario";
		p2.nombre="Angelina";
		
		
		System.out.println("*******************");
		System.out.println("p.nombre: "+p.nombre);
		System.out.println("p2.nombre: "+p2.nombre);
	
		//4.Modificar los atributos
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		System.out.println("-----------------------");
		//5.Accedo a los atributos
		System.out.println("nombre: "+p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		

	}

}
