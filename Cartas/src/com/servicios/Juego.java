package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Jugadores;
import com.entidades.Naipes;

public class Juego {
	private Naipes naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private Jugadores jugadores;

	public Juego(ArrayList<String> idsJugadores) {
		this.naipeBarajado = new ArrayList<Carta>();
		this.jugadores = new Jugadores();
		this.jugadores.setJugadores(idsJugadores);
		this.cartasJugadores = new ArrayList<ArrayList<Carta>>();
		this.naipe = new Naipes();
		this.naipeBarajado = naipe.barajar();
		
		for (int i = 0; i < idsJugadores.size(); i++) {
			ArrayList<Carta> cartasJugador = new ArrayList<Carta>();
			cartasJugadores.add(cartasJugador);
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int posicion = 0;
		for (int i = 0; i < cartasJugadores.size(); i++) {
			ArrayList<Carta> cartasJugador = cartasJugadores.get(i);
			for (int j = 0; j < cartasPorJugador; j++) {
				if (posicion < naipeBarajado.size()) {
					cartasJugador.add(naipeBarajado.get(posicion));
					posicion++;
				} else {
					break;
				}
			}
		}
	}

	public int devolverTotal(int id) {
		ArrayList<Carta> cartasJugador = cartasJugadores.get(id);
		int total = 0;
		for (Carta carta : cartasJugador) {
			total += carta.getNumero().getValor();
		}
		return total;
	}

	public String determinarGanador() {
		String idGanador = jugadores.getJugadores().get(0);
		int sumaGanador = devolverTotal(0);

		for (int i = 1; i < cartasJugadores.size(); i++) {
			String idConcursante = jugadores.getJugadores().get(i);
			int total = devolverTotal(i);

			if (total >= sumaGanador) {
				idGanador = idConcursante;
				sumaGanador = total;
			}
		}
		return idGanador;
	}
}