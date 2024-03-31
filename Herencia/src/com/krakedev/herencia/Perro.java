package com.krakedev.herencia;

public class Perro extends Animal{
	public Perro() {
		System.out.println("Ejecuta contructor vacio de perro");
	}
	
	public void ladrar() {
		System.out.println("Perro ladra");
	}
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmiendo");
	}
}
