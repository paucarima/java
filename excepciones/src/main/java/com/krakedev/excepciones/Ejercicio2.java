package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a=null;
		a.substring(0);
		//npe unchecked
	}
	
	public void metodo2() {
		File f=new File("archivo1.txt");
		try {
			f.createNewFile();
		} catch (IOException IO) {
			System.out.println("ERROR");
		}
		
		//ioException checked
	}
	
	
	public void metodo3() throws IOException{
		File f=new File("archivo1.txt");
		f.createNewFile();
		//ioException checked
	}
	
	public void metodo4() {
	//metodo3();
	}
	
	
}
