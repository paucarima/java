package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persitencia.servicios.AdminEstudiantes;
import com.krakedev.persitencia.util.Convertidor;

public class TestAdminEstudiante {

	public static void main(String[] args) {
		Profesor p=new Profesor(1, "Francisco");
		
		Estudiantes e =new Estudiantes("1156309970", "Valeria", "Domenico", "domenic@gmail.com", p);
		try {
			Date fechaNac=Convertidor.convertirFecha("2000/12/23");
			e.setFecha_nacimiento(fechaNac);
			e.setMensual(new BigDecimal(1230.45));
			AdminEstudiantes.insertar(e);
		} catch (Exception e1) {
	
			e1.printStackTrace();
			System.out.println("error en el sistema"+e1.getMessage());
		}
		
		
	}

}
