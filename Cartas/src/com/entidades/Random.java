package com.entidades;

public class Random {
	/*
	 * Crear una clase llamada Random, con un método estático obtenerPosicion, este
	 * método no recibe nada y retorna un número randómico entre 0 y 51 incluidos.
	 * Puede usar el método estático random de la clase Math que devuelve valores
	 * entre ((incluido) y 1 (excluido) y multiplicarlo por los valores necesarios.
	 * En el test (Crear TestRandom) se validará que el random arroje alguna vez 0 o
	 * 1.
	 */
	
	public static int obtenerPosicion() {
		return (int)(Math.random()*52);
	}
}
 