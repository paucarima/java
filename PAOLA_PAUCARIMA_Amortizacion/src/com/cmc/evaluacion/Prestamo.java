package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	/*
	 * Dentro del Proyecto, crear una clase Préstamo con los atributos
	 *  • Monto
	 * (double)
	 *  • Interes (double) 
	 *  • Plazo (int)| 
	 *  Crear un constructor que reciba
	 * los 3 parámetros y los asigne a los atributos correspondientes 
	 * Crear getters
	 * y setters para cada atributo 
	 * 

	 */
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota>cuotas;
	private String cedulaCliente;
	
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas=new ArrayList<Cuota>();
	}

	
	
	public String getCedulaCliente() {
		return cedulaCliente;
	}



	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}


	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	public void mostrarPrestamo() {
		System.out.println("[ monto= "+this.monto
							+", interes= "+this.interes
							+", plazo= "+this.plazo+" ]");
	}
	
	
	
}
