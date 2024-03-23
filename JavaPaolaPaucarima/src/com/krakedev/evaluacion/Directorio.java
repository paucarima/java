package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	// private ArrayList<Telefono> telefonos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {

		this.contactos = new ArrayList<Contacto>();
		this.fechaModificacion = new Date();
		// this.telefonos = new ArrayList<Telefono>();
		this.correctos = new ArrayList<Contacto>();
		this.incorrectos = new ArrayList<Contacto>();
	}

	
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}


	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}


	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContacto(Contacto contacato) {

		if (buscarPorCedula(contacato.getCedula()) == null) {
			contactos.add(contacato);
			// fechaModificacion=new Date();
			return true;
		} else {
			// fechaModificacion=new Date();
			return false;
		}

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto != null) {
				if (elementoContacto.getCedula().equals(cedula)) {
					contactoEncontrado = elementoContacto;
				}
			}

		}
		return contactoEncontrado;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat uf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return uf.format(fechaModificacion);

	}

	public int contarPerdidos() {
		Contacto elementoContacto = null;
		Contacto contactoSinDir = null;
		int contar = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				contactoSinDir = elementoContacto;
				contar++;
				// break;
			}

		}
		if (contactoSinDir == null) {
			System.out.println("Sin rumbo: " + contar);
		}
		return contar;
	}

	public int contarFijos() {
		Contacto contacto = null;
		Telefono elementoTel = null;
		int contar = 0;
		for (int i = 0; i < contactos.size(); i++) {
			contacto = contactos.get(i);
			for (int j = 0; j < contacto.getTelefonos().size(); j++) {
				elementoTel = contacto.getTelefonos().get(j);

				if (contacto != null && elementoTel != null) {
					if (elementoTel.getTipo().equals("Convencional") && elementoTel.getEstado().equals("C")) {
						contar++;
					}

				}
			}

		}

		return contar;

	}

	/*
	 * Coloca los contactos que tienen dirección asignada en la lista correctos y
	 * los que dirección en incorrectos.
	 * 
	 * Luego de repartirlos, vaciar la lista de contactos
	 */
	public void depurar() {
		Contacto contacto = null;
		
		
		for (int i = 0; i < contactos.size(); i++) {
			contacto = contactos.get(i);
		
				if (contacto.getDireccion()!=null) {
			
						correctos.add(contacto);

				}else {
					incorrectos.add(contacto);
				}
			

		}
		contactos.clear();

	}

}
