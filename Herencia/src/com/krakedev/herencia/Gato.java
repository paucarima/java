package com.krakedev.herencia;

public class Gato extends Animal{
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Gato durmiendo");
	}
	
	public void maullar() {
		System.out.println("MIAUUUU!");
	}
	
	public void maullar(String adj) {
		System.out.println("GATO Maullando "+adj);
	}
}
