package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;


import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	
	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemana.LUNES,5,45);
		Alarma a2=new Alarma(DiasSemana.MARTES,6,50);
		Alarma a3=new Alarma(DiasSemana.MIERCOLES,7,55);
		Alarma a4=new Alarma(DiasSemana.JUEVES,8,05);
		Alarma a5=new Alarma(DiasSemana.VIERNES,9,10);
		Alarma a6=new Alarma(DiasSemana.SABADO,10,15);
		Alarma a7 =new Alarma(DiasSemana.DOMINGO,11,20);
		//recuperar lista alarma
		//1.instaciar al obj admin
		//2.Crear un array para llamar
		AdminAlarmas admin=new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		admin.agregarAlarma(a5);
		admin.agregarAlarma(a6);
		admin.agregarAlarma(a7);
		
		ArrayList<Alarma>alarmasActuales=admin.getAlarmas();
		
		for (int i = 0; i < alarmasActuales.size(); i++) {
			System.out.println(alarmasActuales.get(i));
		}
	
		
	}
}
