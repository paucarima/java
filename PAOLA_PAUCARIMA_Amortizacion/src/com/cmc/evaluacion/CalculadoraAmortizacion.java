package com.cmc.evaluacion;

//import java.util.Iterator;

public class CalculadoraAmortizacion {
	/*
	 * Dentro del proyecto, crear una clase CalculadoraAmortizacion con un método
	 * calcularCuota, que recibe un Préstamo y retorna el valor de la cuota, basados
	 * en la explicación inicial del cálculo de la cuota en una tabla de
	 * amortización francesa. Para elevar un número a un exponente en java, puede
	 * usar el método pow de la clase Math. Recomendación: utilizar paréntesis en la
	 * fórmula de java para agrupar los cálculos.
	 */

	public static double calcularCuota(Prestamo prestamo) {
		double monto = prestamo.getMonto();
		double interes = prestamo.getInteres() / 100.0;
		double plazo = prestamo.getPlazo();
		double dividiendo = (1 - ((Math.pow((1 + interes), -plazo))));
		double cuota = (monto * interes) / (dividiendo);
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuotaCons = calcularCuota(prestamo);
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota nuevaCuota = new Cuota(i + 1);
			// asignar el valor de cuota
			nuevaCuota.setCuota(cuotaCons);
			// cargar este objeto a cuota
			prestamo.getCuotas().add(nuevaCuota);

		}

		// Establecer Valor al Inicio del Período en la Primera Cuota: 
		//En la primera
		// cuota del arreglo,
		// asignar el valor al inicio del período, 
		//que es igual al monto total del
		// préstamo.
		prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());
		
		//Invocar calcularValoresCuota sobre todas las cuotas
		
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			calcularValoresCuota(prestamo, i);
		}
		//Ajusta la ultima cuota
		Cuota ultimaCuota=prestamo.getCuotas().get(prestamo.getPlazo()-1);
		double saldoFalta=ultimaCuota.getSaldo();
		ultimaCuota.setCuota(ultimaCuota.getCuota()+saldoFalta);
		ultimaCuota.setSaldo(0);
		
		
	}
	
	public static double calcularValoresCuota(Prestamo prestamo, int cuotaInd) {
		Cuota cuotaInicio=prestamo.getCuotas().get(cuotaInd);
		double interes=cuotaInicio.getInicio()*(prestamo.getInteres()/100.0);
		double abonoCapital=cuotaInicio.getCuota()-interes;
		double saldo=cuotaInicio.getInicio()-abonoCapital;

		
		cuotaInicio.setInteres(Utilitario.redondear(interes));
		cuotaInicio.setAbonoCapital(Utilitario.redondear(abonoCapital));
		cuotaInicio.setSaldo(Utilitario.redondear(saldo));

		
		if (cuotaInd<prestamo.getPlazo()-1) {
			Cuota nextCuota=prestamo.getCuotas().get(cuotaInd+1);
			nextCuota.setInicio(Utilitario.redondear(saldo));
		}
		
		return cuotaInd;
		
	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo");
		for (Cuota cuota : prestamo.getCuotas()) {
			System.out.println(cuota.getNumero()+"      |"+
							   Utilitario.redondear(cuota.getCuota())+" | "+
						        cuota.getInicio()+"|  "+
							     cuota.getInteres()+"    |"+cuota.getAbonoCapital()
							     +"|   "+cuota.getSaldo());
		}
	}

}
