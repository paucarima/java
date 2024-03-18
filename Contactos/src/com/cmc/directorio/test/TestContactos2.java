package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("claro", "0974736212", 20);
		tel1.setTieneWhatsapp(true);

		Telefono tel2 = new Telefono("movi", "0994456213", 15);
		tel2.setTieneWhatsapp(true);

		Contacto c1 = new Contacto("Roberto", "Torres", tel1, 3.75);
		Contacto c2 = new Contacto("Marcela", "Lopez", tel2, 2.50);
		
		AdminContactos buscar = new AdminContactos();
		AdminContactos comparar = new AdminContactos();

		double respuesta = buscar.buscarMasPesado(c1, c2);

		if (respuesta == c1.getPeso()) {
			System.out.println("*****Pesa mas con: " + c1.getPeso());
			System.out.println("Nombre: " + c1.getNombre());
			System.out.println("Apellido: " + c1.getApellido());
			System.out.println("Telefono: " + tel1.getNumero());
		} else if (respuesta == c2.getPeso()) {
			System.out.println("*****Pesa mas con: " + c2.getPeso());
			System.out.println("Nombre: " + c2.getNombre());
			System.out.println("Apellido: " + c2.getApellido());
			System.out.println("Telefono: " + tel2.getNumero());
		} else if (respuesta == 0) {
			System.out.println("*****Ninguno");
		}

		System.out.println("*************************");
		boolean respuestac = comparar.compararOperadoras(c1, c2);
		if (respuestac == true) {
			System.out.println("Son iguales: ");
			System.out.println("Operadora: " + tel1.getOperadora());
			System.out.println("Nombre: " + c1.getNombre());
			System.out.println("Apellido: " + c1.getApellido());
			System.out.println("Telefono: " + tel1.getNumero());
			System.out.println("Pesa mas con: " + c1.getPeso());

			System.out.println("Operadora: " + tel2.getOperadora());
			System.out.println("Nombre: " + c2.getNombre());
			System.out.println("Apellido: " + c2.getApellido());
			System.out.println("Telefono: " + tel2.getNumero());
			System.out.println("Pesa mas con: " + c2.getPeso());

		} else if (respuestac == false) {
			System.out.println("No son iguales");
		}

	}

}
