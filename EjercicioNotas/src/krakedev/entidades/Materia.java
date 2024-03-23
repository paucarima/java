package krakedev.entidades;

public class Materia {
	private String credito;
	private String nombre;
	
	public Materia(String credito, String nombre) {
		this.credito = credito;
		this.nombre = nombre;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
