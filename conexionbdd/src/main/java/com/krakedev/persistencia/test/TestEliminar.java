package com.krakedev.persistencia.test;



import com.krakedev.persistencia.entidades.Estudiantes;

import com.krakedev.persitencia.servicios.AdminEstudiantes;


public class TestEliminar {

	public static void main(String[] args) {

		
		Estudiantes e =new Estudiantes();
		try {
			e.setCedula("1234567890");
			AdminEstudiantes.eliminar(e);;
		} catch (Exception e1) {
	
			e1.printStackTrace();
			System.out.println("error en el sistema"+e1.getMessage());
		}

	}

}
