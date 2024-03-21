package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celdas codigo: " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		/**/
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}
	/*
	 * • Método cargarProducto: recibe un atributo de tipo Producto, un código de
	 * celda y la cantidad de items a colocar inicialmente de dicho producto. Invoca
	 * al método buscarCelda, guarda el retorno de este método en una variable
	 * celdaRecuperada de tipo celda. En la celdaRecuperada, agrega el producto y el
	 * stock inicial usando el método ingresarProducto de la celda. Este método no
	 * tiene retorno •
	 * 
	 */

	public void cargarProducto(Producto pro, String codigo, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(pro, stock);
		}

	}
	/*
	 * Método mostrarProductos: Método que no recibe parámetros y no tiene retorno.
	 * imprime de cada celda: el código de la celda, el stock actual, el nombre y
	 * precio del Producto de la celda.
	 */

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celdaRecogida = celdas.get(i);
			System.out.println("CELDA: " + celdaRecogida.getCodigo() + " STOCK: " + celdaRecogida.getStock());
			if (celdaRecogida.getProducto() != null) {
				System.out.println("PRODUCTO: " + celdaRecogida.getProducto().getNombre() + " PRECIO: "
						+ celdaRecogida.getProducto().getPrecio() + " CODIGO PRO:"
						+ celdaRecogida.getProducto().getCodigo());
			} else {
				System.out.println("Sin Producto asignado");
			}
			System.out.println("Saldo: " + this.saldo);
		}
	}

	/*
	 * Método buscarProductoEnCelda: recibe el código de la celda y retorna el
	 * Producto guardado en esa celda, si no existe la celda, retorna null.
	 */

	public Producto buscarProductoEnCelda(String codigo) {
		Celda encontrada = this.buscarCelda(codigo);
		if (encontrada != null) {
			return encontrada.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Celda entradaPrecio = this.buscarCelda(codigo);
		if (entradaPrecio != null) {
			return entradaPrecio.getProducto().getPrecio();
		} else {
			return 0;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {

		Celda elementosCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementosCelda = celdas.get(i);
			if (elementosCelda.getProducto() != null && elementosCelda.getProducto().getCodigo().equals(codigo)) {
				return elementosCelda;
			}

		}

		return null;

	}

	public void incrementarProductos(String codigo, int stock) {
		/*
		 * •Método incrementarProductos: recibe el código del producto y la cantidad de
		 * items a incrementar, no retorna nada. Invoca al método buscarCeldaProducto
		 * usando el código del producto que recibe. Guarda el retorno de
		 * buscarCeldaProducto en una variable llamada celdaEncontrada. En la
		 * celdaEncontrada, agrega el número de items al stock actual de productos en
		 * dicha celda.
		 */

		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);

		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() + stock);
		}

	}

	/*
	 * Método vender: recibe el código de celda, no retorna nada. Busca la celda y
	 * disminuye en 1 el stock. Obtiene el precio del producto y sumar este valor al
	 * *saldo actual de la máquina.
	 * 
	 * el método mostrarProductos para que también imprima el saldo de la máquina
	 * 
	 */

	public void vender(String codigo) {
		Celda celdaEncontrada = this.buscarCelda(codigo);

		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo += celdaEncontrada.getProducto().getPrecio();
			mostrarProductos();
		}

	}

	public double venderConCambio(String celda, double valor) {
		Celda buscar = this.buscarCelda(celda);
		if (buscar != null) {
			buscar.setStock(buscar.getStock() - 1);
			this.saldo = buscar.getProducto().getPrecio() + this.saldo + valor;
			double vuelto = valor - buscar.getProducto().getPrecio();
			return vuelto;
		}

		return 0;

	}
	/*
	 * En MaquinaDulces, agregar un nuevo método llamado buscarMenores, recibe un
	 * double llamado limite y retorna un ArrayList<Producto> con todos los
	 * productos cuyo precio es menor o igual que limite.
	 */

	public ArrayList<Celda> buscarMenores(double limite) {

		ArrayList<Celda> menores = new ArrayList<Celda>();

		Celda elementoProductos = null;
		int contar = 0;
		for (int i = 0; i < celdas.size(); i++) {
			elementoProductos = celdas.get(i);
			if (elementoProductos.getProducto().getPrecio() <= limite) {

				menores.add(elementoProductos);
				contar++;

			}

		}

		System.out.println("Productos menores: " + contar);
	
		for (int i = 0; i < menores.size(); i++) {
			elementoProductos = celdas.get(i);
			System.out.println("Nombre: " + elementoProductos.getProducto().getNombre() + " Precio: "
					+ elementoProductos.getProducto().getPrecio());
		}

		return menores;
	}

}
