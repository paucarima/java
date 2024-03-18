package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}else {
			telefono.setTieneWhatsapp(false);
		}
	}
	
	public  int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contador=1;
		if(telf1.getOperadora()=="movi") {			
			contador++;
		}else if(telf2.getOperadora()=="movi") {
			contador++;
		}else if(telf3.getOperadora()=="movi") {
		    contador++;
		}else {
			contador=0;  
			
		}
		return contador;
	}
	
	public  int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int contador=1;
		if(telf1.getOperadora()=="claro") {			
			contador++;
		}else if(telf2.getOperadora()=="claro") {
			contador++;
		}else if(telf3.getOperadora()=="claro") {
		    contador++;
		}else if(telf4.getOperadora()=="claro"){
			contador++;
		}else {
			contador=0;  
			
		}
		return contador;
	}
}
