package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persitencia.servicios.AdminEstudiantes;

public class TestConsultaEstudiante {
	public static void main(String[] args) {
		
		try {
			ArrayList<Estudiantes>personas=AdminEstudiantes.buscarPorNombre("Valeria");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
