package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	ArrayList<Telefono> telefonos;

	

	public Contacto(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos=new ArrayList<Telefono>();
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void imprimir() {
		if (direccion != null) {
			Direccion nuevaDireccion = new Direccion("Av.Calle Siempre Viva", "Calle 4");
			System.out.println("Cedula: " + this.cedula + "\nNombre: " + this.nombre + "\nApellido:" + this.apellido
					+ "\nDireccion : " + "        " + "\nCalle principal: " + nuevaDireccion.getCallePrincipal()
					+ "\nCalle Secuandaria: " + nuevaDireccion.getCalleSecundaria());

			System.out.println("-------------------------------------");
			System.out.println("Informacion actualizada: ");
			Contacto nuevoContacto = new Contacto("987543210", "Ana", "Gomez");

			System.out.println(
					"Cedula: " + nuevoContacto.getCedula() + "\nNombre: " + nuevoContacto.getNombre() + "\nApellido:"
							+ nuevoContacto.getApellido() + "\nDireccion : " + "        " + "\nCalle principal: "
							+ direccion.getCallePrincipal() + "\nCalle Secuandaria: " + direccion.getCalleSecundaria());

			System.out.println("-------------------------------------");
			System.out.println("Informacion actualizada Contacto 2: ");

			System.out.println("********" + this.getNombre());
			if (this.cedula.equals("1234567890")) {
				System.out.println("Direccion: " + this.getDireccion().getCallePrincipal() + " "
						+ getDireccion().getCalleSecundaria());
			} else {
				System.out.println("*****" + this.getNombre() + "**" + "No tiene asociada una direccion");
			}

		} else {
			System.out.println("*****" + this.getNombre() + "**" + "\nNo tiene asociada una direccion");
		}

	}
	/*
	 * Crear un método agregarTelefono, que no retorna nada, recibe un Telefono y lo
	 * agrega a la lista de teléfonos.
	 * 
	 * Crear un método mostrarTelefonos, que no retorna nada, no recibe nada y
	 * muestra en consola todos los teléfonos ingresados con el formato que se
	 * indica en resultado esperado. IMPORTANTE: El método mostrarTelefonos solo
	 * muestra los que tengan estado C TEST: TestMostrarTelefonos RESULTADO
	 * ESPERADO:
	 */
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {

		Telefono telefono=null;
		System.out.println("Telefonos con estado 'C'");
		for (int i = 0; i < telefonos.size(); i++) {
			telefono=telefonos.get(i);
			if (telefono.getNumero()!=null) {
				if(telefono.getEstado()!=null && telefono.getEstado().equals("C")) {
					System.out.println("Numero buscado: "+telefono.getNumero()+", Tipo: "+telefono.getTipo());
				}
				
				
			}
		} 
		
		 
	}
	
	public ArrayList<Telefono> recuperarInconrrectos() {
		Telefono telefonoEncontrado=null;
		//Creo un arraylist para recibir solo los con E
		ArrayList<Telefono>telefonoE=new ArrayList<Telefono>();
		//reviso el array telefonos
		for (int i = 0; i <telefonos.size() ; i++) {
			//muestros los array
			telefonoEncontrado=telefonos.get(i);
			//valido el null
			if (telefonoEncontrado.getNumero()!=null) {
				//compara si hay E
				if(telefonoEncontrado.getEstado().equals("E")) {
					//si hay E   guardo
					telefonoE.add(telefonoEncontrado);
					break;
				}
								
			}
		}
		//retorno el array
		return telefonoE;
		
	}

}
