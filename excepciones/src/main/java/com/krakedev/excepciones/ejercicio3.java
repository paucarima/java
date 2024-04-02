package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ejercicio3 {
	private static final Logger LOGGER=LogManager.getLogger(ejercicio3.class);
	public void metodo1() {
		//File f=new File("archivo1.txt");
		String a=null;
		try {
			//f.createNewFile();
			a.substring(0);
			
		} catch (Exception io) {
			System.out.println("ERROR");
			LOGGER.error("Error al obtner la subcadena",io);
		}
	}
	
	public static void main(String[] args) {
		ejercicio3 eje3=new ejercicio3();
		eje3.metodo1();
	}
}
