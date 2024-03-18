package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {

		
		 
		Telefono tel1=new Telefono("movi", "0984739642", 23);
		Telefono tel2=new Telefono("claro", "0984129642", 50);
		Telefono tel3=new Telefono("movi", "0994739641", 54);
		
		AdminTelefono contar =  new AdminTelefono();  
		contar.contarMovi(tel1, tel2, tel3);
		int contarm=contar.contarMovi(tel1, tel2, tel3);
		
		System.out.println("Cuantos movistar hay: "+contarm);

	}

}
