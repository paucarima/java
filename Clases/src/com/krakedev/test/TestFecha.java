package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha(2000,12,12);
		/*fecha1.setAnio(2000);
		fecha1.setDia(12);
		fecha1.setMes(12);*/
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getDia());
		System.out.println(fecha1.getMes());
	}

}
