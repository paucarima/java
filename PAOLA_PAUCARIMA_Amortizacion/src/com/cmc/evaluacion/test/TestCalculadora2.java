package com.cmc.evaluacion.test;

import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.CalculadoraAmortizacion;

public class TestCalculadora2 {
																																																																																			
	    public static void main(String[] args) {
	        Prestamo prestamo = new Prestamo(5000, 1, 15);

	        CalculadoraAmortizacion.generarTabla(prestamo);
	        CalculadoraAmortizacion.mostrarTabla(prestamo);
	    }
	}