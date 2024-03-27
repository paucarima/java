package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	// Cliente cliente=null;

	public Banco() {

		this.prestamos = new ArrayList<Prestamo>();
		this.clientes = new ArrayList<Cliente>();
		// this.registrarCliente(cliente);
		//System.out.println(prestamos);
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {

		for (Cliente cliente : clientes) {
			if (cliente != null) {
				if (cliente.getCedula().equals(cedula)) {
					return cliente;
				}
			}
		}

		return null;

	}

	public void registrarCliente(Cliente cliente) {
		Cliente encontrarCliente = buscarCliente(cliente.getCedula());

		if (encontrarCliente != null) {
			System.out.println("Ya registrado");

		} else {
			clientes.add(cliente);
		}

	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente validar = buscarCliente(cedula);
		if (validar != null) {
			prestamos.add(prestamo);
			//System.out.println("ingresado");
		} else {
			System.out.println("no es cliente del banco");
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {

		ArrayList<Prestamo> prestamoCliente = new ArrayList<Prestamo>();
		Prestamo prestamo = null;
		Cliente cliente = null;
		for (int i = 0; i < prestamos.size(); i++) {
			prestamo = prestamos.get(i);

			for (int j = 0; j < clientes.size(); j++) {
				cliente = clientes.get(j);


			}
			

			if (prestamo != null && cliente != null) {

				if (cliente.getCedula().equals(cedula)) {
					//System.out.println("Ya exite");
				}else {
					prestamoCliente.add(prestamo);
				}
			}

		}

		return prestamoCliente;

	}

}