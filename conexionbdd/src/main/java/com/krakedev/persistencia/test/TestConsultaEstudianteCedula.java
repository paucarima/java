package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persitencia.servicios.AdminEstudiantes;

public class TestConsultaEstudianteCedula {

	public static void main(String[] args) {
		try {
			ArrayList<Estudiantes>personas=AdminEstudiantes.buscarPorCedula("1156309970");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
