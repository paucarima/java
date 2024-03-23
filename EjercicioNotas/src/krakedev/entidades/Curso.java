package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Nota> notas;

	public Curso() {
		this.estudiantes = new ArrayList<Estudiante>();
		this.notas = new ArrayList<Nota>();

	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void matricularEstudiante(Estudiante estudiante) {

		Estudiante buscarEstudiante = buscarEstudiantePorCedula(estudiante);

		if (buscarEstudiante != null) {
			System.out.println("Estudiante Existente ");

		} else {
			estudiantes.add(estudiante);
			System.out.println("Estudiante Resgistrado ");
		}

	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {

		Estudiante estudianteEcontrado = null;
		// Estudiante elementoEstudiante=null;

		for (int i = 0; i < estudiantes.size(); i++) {
			// elementoEstudiante=estudiantes.get(i);
			if (estudiantes.get(i).getCedula().equals(estudiante.getCedula())) {

				estudianteEcontrado = estudiantes.get(i);

				break;
			}
		}

		if (estudianteEcontrado != null) {
			// System.out.println("Estudiante Econtrado: "+estudianteEcontrado.getCedula());
			return estudianteEcontrado;
		} else {
			// System.out.println("Estudiante No Econtrado: ");
			return estudianteEcontrado;
		}

	}

	/**/
	/*
	 * calcularPromedioCurso Calcula el promedio del curso, sumando todos los
	 * promedios individuales de cada estudiante.
	 */

	public double calcularPromedioCurso() {
		Estudiante estudiante = null;
		double cursoNota = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiante = estudiantes.get(i);
			cursoNota += estudiante.calcularPromedioNotasEstudiante();
		}
		double promedio = cursoNota / estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("****************************************");
		Nota notasMostrar=null;
		Estudiante estudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			
			estudiante = estudiantes.get(i);
			System.out.print("Estudiante [ nombre: " + estudiante.getNombre() + 
					         ", Apellido: "+ estudiante.getApellido()+ 
					         ", Cedula: " + estudiante.getCedula() +" ");
			for (int j = 0; j < estudiante.getNotas().size(); j++){
				notasMostrar=estudiante.getNotas().get(j);
				System.out.println( 
				         ", Materia: "+ notasMostrar.getMateria().getNombre() + 
				         ", Notas: " + notasMostrar.getNotas());
			}
			System.out.println(" ]");
		}
		 

		System.out.println("[Promedio Curso: "+this.calcularPromedioCurso()+" ]");

	}

}