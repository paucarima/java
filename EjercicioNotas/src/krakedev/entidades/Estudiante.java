package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String cedula;
	private String nombre;
	private String apellido;

	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = new ArrayList<Nota>();
	}

	/*
	 * Este método tiene por objetivo agregar una nueva calificación, verificando
	 * que la nueva nota no tenga un codigo de materia repetido dentro del ArrayList
	 * notas, también verifica que sea una nota mayor igual 0 y menor igual a 10.
	 */
	
	

	public void agregarNota(Nota nuevaNota) {

		Nota elementoDuplicado = null;

		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i).getNotas() >= 0 && notas.get(i).getNotas() <= 10) {
				if (notas.get(i).getMateria().getCredito().equals(nuevaNota.getMateria().getCredito())) {
					// notas.add(nuevaNota);

					elementoDuplicado = notas.get(i);

					break;
				}
			}
		}

		if (elementoDuplicado != null) {
			// System.out.println("Nota duplicada");
		} else {
			this.notas.add(nuevaNota);
			// System.out.println("Nota Ingresada");
		}

	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	/*
	 * Este método tiene por objetivo, modificar la calificación de una materia a
	 * través de su código, de no encontrarse con el codigo muestra un mensaje de
	 * que no encontró el codigo, además con la verificación de que sea mayor igual
	 * a O y menor igual a 10. codigo (String), nuevaNota (double). No retorna nada.
	 */
	public void modificarNota(String codigo, double nuevaNota) {
		Nota elemenoEncontrada = null;

		for (int i = 0; i < notas.size(); i++) {
			if (nuevaNota >= 0 && nuevaNota <= 10) {
				if (notas.get(i).getMateria().getCredito().equals(codigo)) {
					// notas.add(nuevaNota);

					elemenoEncontrada = notas.get(i);
					elemenoEncontrada.setNotas(nuevaNota);
					break;
				}
			}
		}

		if (elemenoEncontrada != null) {

			System.out.println("Codigo: " + elemenoEncontrada.getMateria().getCredito());
			System.out.println("Nota modificada: " + elemenoEncontrada.getNotas());

		} else {

			System.out.println("No modificado");
		}

	}
	
	

	/*
	 * calcularPromedioNotasEstudiante Este método tiene por objetivo calcular el
	 * promedio de un estudiante, se debe barrir el arraylist y sumar todas las
	 * notas que el estudiante tenga y luego dividirlo por el total de materias. No
	 * recibe parámetros. ¾. Retorna el promedio del estudiante (double).
	 */
	
	public double calcularPromedioNotasEstudiante() {
		
		double promedio=0;
		for (int i = 0; i < notas.size(); i++) {
			promedio+=(notas.get(i).getNotas());
		}
		
		double total=promedio/notas.size();
		return total;
	}
	
	public void mostrar() {
		System.out.println("****************************************");
		for (int i = 0; i < notas.size(); i++) {
			System.out.print("Estudiante [ nombre: "+this.nombre
					                   + ", apellido: "+this.apellido
		                               + ", cedula: "+this.cedula
		                               + ", Materia: "+notas.get(i).getMateria().getNombre()
		                               + ", Notas: "+notas.get(i).getNotas()+
		                               " ]");
		} 
		
	}
	
	/*msotrar curso*/
	
	

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

}
