package clearminds.cuentas;

public class Cuenta {
	private String id="00000";
	private char tipo='A';
	private double saldo;
	
	
	public Cuenta(String id, char tipo, double saldo) {
	
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public Cuenta(String id) {
		
		this.id = id;
		
	}
	

	
	
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	
	public void imprimirConEstilo() {
		System.out.println("*********************");
		System.out.println("       CUENTA        ");
		System.out.println("*********************");
		System.out.println("Numero de cuenta: "+getId());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Saldo: "+getSaldo());
	}
	
	
	
}
