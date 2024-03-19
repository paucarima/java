package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	/*
	 * • Método configurarMaquina: recibe 4 códigos de celda de tipo String, no
	 * retorna nada y los asigna a cada una de las celdas de la máquina
	 * 
	 * • •
	 */

	public void configurarMaquina(String celda1, String celda2, String celda3, String celda4) {

		// arriba
		this.celda1 = new Celda(celda1);
		this.celda2 = new Celda(celda2);
		this.celda3 = new Celda(celda3);
		this.celda4 = new Celda(celda4);
	}

	public void mostrarConfiguracion() {
		/*
		 * Método mostrarConfiguracion: método que no recibe parámetros y no tiene
		 * retorno, imprime en consola los códigos de las 4 celdas •
		 */
		System.out.println("Codigo 1: " + this.celda1.getCodigo());
		System.out.println("Codigo 2: " + this.celda2.getCodigo());
		System.out.println("Codigo 3: " + this.celda3.getCodigo());
		System.out.println("Codigo 4: " + this.celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		/*
		 * Método buscarCelda: recibe un código de celda y retorna la Celda
		 * correspondiente a dicho código, si no existe retorna null.
		 */

		if (this.celda1.getCodigo().equals(codigo)) {
			return this.celda1;
		} else if (this.celda2.getCodigo().equals(codigo)) {
			return this.celda2;
		} else if (this.celda3.getCodigo().equals(codigo)) {
			return this.celda3;
		} else if (this.celda4.getCodigo().equals(codigo)) {
			return this.celda4;
		} else {
			return null;
		}

	}

	public void cargarProducto(Producto pro, String codigo, int stock) {
		/*
		 * • Método cargarProducto: recibe un atributo de tipo Producto, un código de
		 * celda y la cantidad de items a colocar inicialmente de dicho producto. Invoca
		 * al metodo buscarCelda, guarda el retorno de este método en una variable
		 * celdaRecuperada de tipo celda. En la celdaRecuperada, agrega el producto y el
		 * stock inicial usando el método ingresarProducto de la celda. Este método no
		 * tiene retorno
		 */

		Celda celdaRecuperada = this.buscarCelda(codigo); 
		if(celdaRecuperada!=null) {
		
			celdaRecuperada.ingresarProducto(pro, stock);		
			
		}
		

	}

	public void mostrarProductos() {
		/*
		 * Método mostrarProductos: Método que no recibe parámetros y no tiene retorno.
		 * imprime de cada celda: el código de la celda, el stock actual, el nombre y
		 * precio del Producto de la celda
		 */
		System.out.println("*********CELDA 1*************");
		System.out.println("Codigo celda: " + this.celda1.getCodigo());
		System.out.println("Stock: " + this.celda1.getStock());
		if (this.celda1.getProducto() != null) {
		System.out.println("Nombre: " + this.celda1.getProducto().getNombre());
		System.out.println("Precio: " + this.celda1.getProducto().getPrecio());
		System.out.println("Codigo Producto: " + this.celda1.getProducto().getCodigo());
		} else {
	        System.out.println("No hay producto en esta celda.");
	    }
		System.out.println("*********CELDA 2*************");
		System.out.println("Codigo celda: " + this.celda2.getCodigo());
		System.out.println("Stock: " + this.celda2.getStock());
		if (this.celda2.getProducto() != null) {
		System.out.println("Nombre: " + this.celda2.getProducto().getNombre());
		System.out.println("Precio: " + this.celda2.getProducto().getPrecio());
		System.out.println("Codigo Producto: " + this.celda2.getProducto().getCodigo());
		} else {
	        System.out.println("No hay producto en esta celda.");
	    }
		
		System.out.println("*********CELDA 3*************");
		System.out.println("Codigo celda: " + this.celda3.getCodigo());
		System.out.println("Stock: " + this.celda3.getStock());
		if (this.celda3.getProducto() != null) {
		System.out.println("Nombre: " + this.celda3.getProducto().getNombre());
		System.out.println("Precio: " + this.celda3.getProducto().getPrecio());
		System.out.println("Codigo Producto: " + this.celda3.getProducto().getCodigo());
		} else {
	        System.out.println("No hay producto en esta celda.");
	    }
		
		System.out.println("*********CELDA 4*************");
		System.out.println("Codigo celda: " + this.celda4.getCodigo());
		System.out.println("Stock: " + this.celda4.getStock());
		if (this.celda4.getProducto() != null) {
		System.out.println("Nombre: " + this.celda4.getProducto().getNombre());
		System.out.println("Precio: " + this.celda4.getProducto().getPrecio());
		System.out.println("Codigo Producto: " + this.celda4.getProducto().getCodigo());
		} else {
	        System.out.println("No hay producto en esta celda.");
	    }
		System.out.println("Saldo: "+this.saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		/*
		 * Método buscarProductoEnCelda: recibe el código de la celda y retorna el
		 * Producto guardado en esa celda, si no existe la celda, retorna null.
		 * 
		 * 
		 */

		Celda encontrada = this.buscarCelda(codigo);
		if (encontrada != null) {
			return encontrada.getProducto();
		} else {
			return null;
		}

	}

	public double consultarPrecio(String codigo) {

		/*
		 * Método consultarPrecio:recibe el código de la celda, retorna el precio del
		 * Producto guardado en dicha celda. •
		 */
		Celda entradaPrecio = this.buscarCelda(codigo);
		if (entradaPrecio != null) {
			return entradaPrecio.getProducto().getPrecio();
		} else {
			return 0;
		}

	}

	/*
	 * • Método buscarCeldaProducto: recibe el código de producto y retorna la celda
	 * que lo contiene, si no encuentra retorna null.
	 */

	public Celda buscarCeldaProducto(String codigo) {
		
		if (this.celda1.getProducto()!=null && this.celda1.getProducto().getCodigo().equals(codigo)) {
			return this.celda1;
		} else if (this.celda2.getProducto()!=null && this.celda2.getProducto().getCodigo().equals(codigo)) {
			return this.celda2;
		} else if (this.celda3.getProducto()!=null && this.celda3.getProducto().getCodigo().equals(codigo)) {
			return this.celda3;
		} else if (this.celda4.getProducto()!=null && this.celda4.getProducto().getCodigo().equals(codigo)) {
			return this.celda4;
		} else {
			return null;
		}
	}

	/*
	 * Método buscarCeldaProducto: recibe el código de producto y retorna la celda
	 * que lo contiene, si no encuentra retorna null.
	 */

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
	 * 
	 * Método vender: recibe el código de celda, no retorna nada. Busca la celda y
	 * disminuye en 1 el stock. Obtiene el precio del producto y sumar este valor al
	 * *saldo actual de la máquina.
	 * 
	 * el método mostrarProductos para que también imprima el saldo de la máquina
	 * 
	 */

	public void vender(String codigo) {
		Celda celdaEncontrada = this.buscarCelda(codigo);
		
		if (celdaEncontrada!=null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			this.saldo+=celdaEncontrada.getProducto().getPrecio();
			
		} 

	}
	/*Método venderConCambio: recibe el código de la celda y el valor ingresado por
	 * el cliente en la máquina, retorna el cambio que debe dar la máquina. Busca la
	 * celda, resta 1 al stock del producto, modifica el saldo, retorna el vuelto
	 * que le debe entregar al cliente.*/
	
		public double venderConCambio(String celda, double valor) {
			Celda buscar=this.buscarCelda(celda);
			if (buscar!=null) {
				buscar.setStock(buscar.getStock()-1);
				this.saldo=buscar.getProducto().getPrecio()+this.saldo+valor;
				double vuelto=valor-buscar.getProducto().getPrecio();
				return vuelto;
			} 
			
			return 0;
				
		}
	

}
