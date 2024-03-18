package com.cmc.directorio.entidades;

public class AdminContactos {
	public double buscarMasPesado(Contacto con1, Contacto con2) {
		
		if(con1.getPeso()>con2.getPeso()) {
			return con1.getPeso();
		}else if(con2.getPeso()>con1.getPeso()) {
			return con2.getPeso();
		}else {
			return 0;
		}  
	}
	
	public boolean compararOperadoras(Contacto con1, Contacto con2) {
		Telefono telf1;
		telf1=con1.getTelefono();
		
		Telefono telf2;
		telf2=con2.getTelefono();
		
		if(telf1.getOperadora()== telf2.getOperadora()) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	public void activarUsuario(Contacto con) {
		Telefono telf;
		telf=con.getTelefono();
		if(telf.isTieneWhatsapp()==true) {
			con.setActivo(true);
		} 
	}
}
