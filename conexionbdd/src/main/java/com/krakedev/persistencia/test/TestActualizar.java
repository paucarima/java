package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persitencia.servicios.AdminEstudiantes;
import com.krakedev.persitencia.util.Convertidor;

public class TestActualizar {
	public static void main(String[] args) {
	Profesor p=new Profesor(2, "Carlos");
		
		Estudiantes e =new Estudiantes("1756309967", "Valeriad", "Carrera", "valerias@gmail.com", p);
		try {
			Date fechaNac=Convertidor.convertirFecha("2001/12/23");
			e.setFecha_nacimiento(fechaNac);
			e.setMensual(new BigDecimal(2030.45));
			AdminEstudiantes.actualizar(e);
		} catch (Exception e1) {
	
			e1.printStackTrace();
			System.out.println("error en el sistema"+e1.getMessage());
		}
	}
}
