package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	/*	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp=false;*/

	public static void main(String[] args) {
		Telefono tel1=new Telefono("movi","0984739272",20);
		tel1.setTieneWhatsapp(true);  
		
		Contacto c1 = new Contacto("Roberto", "Torres", tel1, 6.75);
		
		
		AdminContactos activo = new AdminContactos();
		activo.activarUsuario(c1);
		
		
		
		System.out.println("Operadora: "+tel1.getOperadora());
		System.out.println("Numero: "+tel1.getNumero());
		System.out.println("Codigo: "+tel1.getCodigo());
		System.out.println("Tiene Whatsapp: "+tel1.isTieneWhatsapp());
		System.out.println("Estado: "+c1.isActivo());
		

	}

}
