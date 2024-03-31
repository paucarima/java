package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearDia(int dia) {
		if (dia==0) {
			return "Lunes";
		}else if(dia==1) {
			return "Martes";
		}else if(dia==2) {
			return "Miercoles";
		}else if(dia==3) {
			return "Jueves";
		}else if(dia==4) {
			return "Viernes";
		}else if(dia==5) {
			return "Sábado";
		}else if(dia==6) {
			return "Domingo";
		}
		return null;
	}
	
	public static String formatearHora(int hora) {
		String valor="0"+hora;
		 return valor;
	}
}
