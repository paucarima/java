package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);

		Cuenta cuenta2 = new Cuenta("03476", 'C', 98);

		Cuenta cuenta3 = new Cuenta("03476");

		// Modifico el tipo de cuenta
		cuenta3.setTipo('C');

		// Imprimir

		cuenta1.imprimirConEstilo();
		cuenta2.imprimirConEstilo();
		cuenta3.imprimirConEstilo();

		System.out.println("-----Valores Modificados----------");

		// Modifico datos
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo('D');

		cuenta1.imprimirConEstilo();
		cuenta2.imprimirConEstilo();
		cuenta3.imprimirConEstilo();

		System.out.println("-----Valores Modificados 2----------");
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo('A');
		cuenta4.setSaldo(10);

		Cuenta cuenta5 = new Cuenta("0557", 'C', 10);
		Cuenta cuenta6 = new Cuenta("0666", 'A', 0);
		
		cuenta4.imprimirConEstilo();
		cuenta5.imprimirConEstilo();
		cuenta6.imprimirConEstilo();
		

	}

}
