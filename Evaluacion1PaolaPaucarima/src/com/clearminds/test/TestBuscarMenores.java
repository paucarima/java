package com.clearminds.test;



import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
		
		Producto producto=new Producto("KE34","Papitas",0.15);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("DE34","Doritos",0.5);
		maquina.cargarProducto(producto2, "A2", 10);
		
		Producto producto3=new Producto("TE34","DeTodito",0.6);
		maquina.cargarProducto(producto3, "B1", 4);
		
		Producto producto4=new Producto("DE34","Nacjo",0.7);
		maquina.cargarProducto(producto4, "B2", 20);
		
		Producto producto5=new Producto("CE34","Cachito",0.35);
		maquina.cargarProducto(producto5, "C1", 4);
		
		Producto producto6=new Producto("RE34","Rufles",0.95);
		maquina.cargarProducto(producto6, "C2", 3);
		 
	
		maquina.buscarMenores(0.7);

		
		


	}

}
