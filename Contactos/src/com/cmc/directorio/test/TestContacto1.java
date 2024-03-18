package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono();
		telef.setNumero("0987439372");
		telef.setOperadora("movi");
		
		Contacto c = new Contacto("Camila","Salcedo",telef,1.75);
		
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Numero: "+telef.getNumero());
		System.out.println("Operadora: "+telef.getOperadora());
		
		

	}

}
