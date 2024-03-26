package com.entidades;

import java.util.ArrayList;

public class Naipes {
	/*
	 * Crear una clase Naipe con los atributos: numerosPosibles: ArrayList de Numero
	 * cartas: ArrayList de Carta Solo agregar getCartas, ningún otro getter ni
	 * setter
	 */
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipes() {

		numerosPosibles = new ArrayList<Numero>();

		this.numerosPosibles.add(new Numero("A", 11));
		this.numerosPosibles.add(new Numero("2", 2));
		this.numerosPosibles.add(new Numero("3", 3));
		this.numerosPosibles.add(new Numero("4", 4));
		this.numerosPosibles.add(new Numero("5", 5));
		this.numerosPosibles.add(new Numero("6", 6));
		this.numerosPosibles.add(new Numero("7", 7));
		this.numerosPosibles.add(new Numero("8", 8));
		this.numerosPosibles.add(new Numero("9", 9));
		this.numerosPosibles.add(new Numero("10", 10));
		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));

		cartas = new ArrayList<Carta>();
		Palos palos = new Palos();
		Numero numero = null;

		for (int i = 0; i < numerosPosibles.size(); i++) {
			numero = numerosPosibles.get(i);

			String palocn = palos.getCorazonNegro();
			String palocr = palos.getCorazonRojo();
			String palod = palos.getDiamante();
			String palot = palos.getTrebol();

			cartas.add(new Carta(numero, palocn));
			cartas.add(new Carta(numero, palocr));
			cartas.add(new Carta(numero, palod));
			cartas.add(new Carta(numero, palot));

		}

		// this.auxiliar = new ArrayList<Carta>();
	}

	public ArrayList<Carta> getCartas() {

		return cartas;
	}

	/*
	 * En naipe crear un método llamado barajar, no recibe nada, retorna un
	 * ArrayList de Carta. Su objetivo va a ser copiar las cartas de un ArrayList a
	 * otro, en un orden aleatorio y retomarlo, con la siguiente lógica: Agregar un
	 * atributo estado de tipo String a carta. Este atributo tiene un valor inicial
	 * N, que significa no barajado. Crea un ArrayList de Carta llamado auxiliar
	 * 
	 * Hacer un for del 1 al 100, en cada iteración: Hacer un for del 1 al 100, en
	 * cada iteración: Invocar al método obtenerPosicion y guardar lo que retorna en
	 * una variable. Obtener la carta en la posicion que indica la variable, validar
	 * el estado: Si el estado es N, agregar esta carta al arreglo auxiliar y
	 * cambiar su estado a C. Por otro lado, si el estado es C, no hacer nada ya que
	 * significa que esta carta ya fue agregada al arreglo auxiliar. Luego de las
	 * 100 iteraciones es probable que algunas cartas no se agregaron a auxiliar, es
	 * decir siguen en estado N. Barrerse el arreglo e ir agregando una por una las
	 * cartas hacia auxilar. Al final auxiliar debe tener las 52 cartas en orden
	 * aleatorio. Retornar auxiliar.
	 * 
	 */
	public ArrayList<Carta> barajar() {

		for (int i = 0; i < cartas.size(); i++) {
			cartas.get(i).setEstado("N");
		}
		//sirve para poner las cartas
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();

		for (int i = 0; i < 100; i++) {
			int posicion = Random.obtenerPosicion();
			Carta carta = cartas.get(posicion);
			if (carta != null) {
				if (carta.getEstado().equals("N")) {

					auxiliar.add(carta);
					carta.setEstado("C");
				}

			}

		}

		// agregar las cartas faltantes
		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);
			if (carta != null) {
				if (carta.getEstado().equals("N")) {
					auxiliar.add(carta);
				}
			}
		}

		return auxiliar;

	}

}
