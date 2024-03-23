package com.krakedev.evaluacion;

public class Telefono {
	private String numero = null;
	private String tipo = null;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	/*
	 * Asigna los valores de número y tipo a los atributos respectivos. Dependiendo
	 * de las validaciones que realice, colocará el valor de estado: C: Si es
	 * correcto E : Si tiene error Para determinar si es correcto o no el teléfono,
	 * se debe cumplir las siguientes condiciones:
	 * 
	 * Tanto el teléfono como el tipo deben ser diferentes de null, si alguno es
	 * null, se considera con error Los tipos pueden ser Movil o Convencional, si es
	 * un tipo diferente, se considera con error. Si el tipo es Movil, el teléfono
	 * debe tener 10 caracteres, si es convencional, debe tener 7 caracteres.
	 * Validar únicamente la longitud, no el contenido de la cadena. La longitud de
	 * un String se obtiene con el método length()
	 */

	public String getNumero() {
		if (this.numero != null && this.tipo != null) {
			this.estado = "C";
			if (this.numero.length() == 10 && this.tipo.equals("Movil")) {
				this.estado = "C";
			}else if (this.numero.length() == 7 && this.tipo.equals("Convencional")) {
				this.estado = "C";
			}else {
				this.estado = "E";
				return numero;
			}
			return numero;
		} else {
			this.estado = "E";
			return numero;
		}

	}

	public String getTipo() {
		if (this.tipo != null && this.tipo != null) {
			this.estado = "C";
			
			if (this.tipo.equals("Movil") || this.tipo.equals("Convencional")) {
				this.estado = "C";			
			}else {
				this.estado = "E";
				return tipo;
			} 
			return tipo;
		}else {
			this.estado = "E";
			return tipo;
		}

	}

	public String getEstado() {
		return estado;
	}

}
