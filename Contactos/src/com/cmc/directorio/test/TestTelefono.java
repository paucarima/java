   package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
			
		Telefono tel =new Telefono("movi","09941234123",10);
		System.out.println("OPERADORA: "+tel.getOperadora());
		System.out.println("NUMERO: "+tel.getNumero());
		System.out.println("CODIGO: "+tel.getCodigo());

	}

}
