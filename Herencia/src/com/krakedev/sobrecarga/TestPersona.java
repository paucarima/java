package com.krakedev.sobrecarga;

import com.krakedev.herencia.Cuenta;

public class TestPersona {

	public static void main(String[] args) {
		/*Persona p=new Persona("1756309965","Psadj");
		System.out.println("Hola");
		System.out.println(p);//p.tostring
		System.out.println(p.toString());*/
		
		Cuenta c=new Cuenta("17563",500);

		System.out.println("Hola: "+c);
	}

}
