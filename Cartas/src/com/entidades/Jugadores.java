package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	/*
	 * Comience creando la clase Jugadores en un archivo llamado Jugadores java.
	 * Esta clase contendrá un ArrayList de tipo String para almacenar los nombres
	 * de los jugadores y algunos métodos para interactuar con ellos. 
	 * -Agregar
	 * Getters y Setters: A continuación, agregue los métodos getJugadores y
	 * setJugadores para acceder y modificar la lista de jugadores.
	 *  -
	 */
	
	ArrayList<String> jugadores = new ArrayList<String>();

	public Jugadores() {
		
		this.jugadores = new ArrayList<String>();
		
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	/*Agregue el
	 * método jugar primero haga un ArrayList de tipo String de jugadores que
	 * agregará tres jugadores, crea un objeto de la clase Juego con un parametro
	 * jugadores y pasarle el metodo entregar cartas con un valor de 5, luego
	 * muestra los resultados a traves de un for que recorra por el tamano de los
	 * jugadores y devuelva el total del recorrido imprimirlo mostrando el número
	 * del jugador y el total Y luego cree una variable ganador y llame al método
	 * determinar Ganador e imprima el ganador*/
	
	public void jugarPrimero() {
	
		ArrayList<String>jugadores=new ArrayList<>();
		jugadores.add("jugar 1");
		jugadores.add("jugar 2");
		jugadores.add("jugar 3");
		Juego juego=new Juego(jugadores);
		juego.entregarCartas(5);
		int total=0;
		
		for (int i = 0; i < jugadores.size(); i++) {
			ArrayList<Carta>cartasJugador=juego.getCartasJugadores().get(i);
			//System.out.println(jugadores.get(i));
			for (int j = 0; j < cartasJugador.size(); j++) {
				 total+=1;
				 
			}
			System.out.println("El jugador: "+jugadores.get(i)+""+total);
		}
	
		
		
	}
	
}
