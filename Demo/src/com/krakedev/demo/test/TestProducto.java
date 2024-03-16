package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto pro=new Producto(01,"Leche");
		
		pro.setDescripcion("3 litros");
		pro.setPeso(1.2);
		
		System.out.println("Codigo: "+pro.getCodigo());
		System.out.println("Nombre: "+pro.getNombre());
		System.out.println("Descripcion: "+pro.getDescripcion());
		System.out.println("Peso: "+pro.getPeso());
		
		

	}

}
