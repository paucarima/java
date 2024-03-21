package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {

	private ArrayList<Persona> personas;

	//constructor
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}
//esta funcion  recibe atributo de tipo persona donde recibe todos las variables
	public void agregar(Persona persona) {
		//personas se llama el array donde ingresa los datos con add
		personas.add(persona);
	}

	public void imprimir() {
		//creo una varaible tipo persona llama elementoPerona
		Persona elementoPersona;
		//ingreso al al for para mirar el array
		for (int i = 0; i < personas.size(); i++) {
			//en elementoPersona guarda tomar datos de personas que esta en el array con get apoyado con i
			elementoPersona = personas.get(i);
			//como tenemos elementoPersona podemos acceder a los metodos de Personas
			System.out.println("Personas: " + elementoPersona.getApellido() + "-" + elementoPersona.getNombre());
		}
	}

	public Persona buscarPorNombre(String nombre) {
		//Creo una variable tipo persona elementoPersona donde inicio con null para retonar  
		//tambien para guarda el elemento a buscar
		
		Persona elementoPersona = null;
		Persona personaEncontrada = null;
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			if (nombre.equals(elementoPersona.getNombre())) {
				//CREO EL if para evaluar el elemento a buscar donde recibe nombre como coparacion
				personaEncontrada = elementoPersona;
				//personaEncontrada se crea esta varible para guardar elementoPersona y poder retonar y no me de javainput null
			}			
		}
		return personaEncontrada; 
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		//Realiza buscadorMayes de edad
		//Se crea otro array mayores porque toca devolver una array por declaracion del metodo
		//ademas si se encuentra vacio devuelve lo mismo sin problemas de tipos
		ArrayList<Persona> mayores=new ArrayList<Persona>();
		Persona elementoPersona=null;
		//creo esta variable para guardar
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getEdad() >edad) {
				//comienzo la comparacion getEdad y edad
				mayores.add(elementoPersona); 
				//se añade
			}
		}
		return mayores;
		//devuelve el resultado
	}
}
