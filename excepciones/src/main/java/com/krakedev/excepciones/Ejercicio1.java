package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a="VGDG";
		try {
			System.out.println("Abre la conexion BDD");
			a.substring(3);
			System.out.println("fin");
		} catch (Exception e) {
			System.out.println("entra al catch");
		}finally {
			System.out.println("ingresa al finally");
			System.out.println("cIERRA la conexion BDD");
		}
		System.out.println("fuera del catch");
	}

}
