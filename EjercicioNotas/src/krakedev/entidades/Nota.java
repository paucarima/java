package krakedev.entidades;



public class Nota {
	private double notas;
	private Materia materia;
	

	public Nota(Materia materia, double notas) {
		
		this.notas = notas;
		this.materia = materia;
	
	}
	


	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	

	public void mostrar() {
		System.out.print("Notas [ notas: "+notas+ ", Materia: "+materia.getNombre()+", Codigo:"+materia.getCredito()+" ]");
		
	}

}
