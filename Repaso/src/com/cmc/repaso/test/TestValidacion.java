package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion valor=new Validacion();
		boolean respuesta=valor.validarMonto(5);
		
		System.out.println("Repuesta: "+respuesta);

	}

}
