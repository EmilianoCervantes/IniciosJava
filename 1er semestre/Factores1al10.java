/* Vamos a pedir el número y con módulo (%) vamos a ver si
son factores o no */

public class Factores1al10 {
	public static void main (String[] args) {
	int numero;

	System.out.println("Vamos a sacar los factores del número que quieras");

	System.out.print("Dame el número: ");
	numero = Integer.parseInt(System.console().readLine());

	//Si el if es sólo una instrucción, puede no llevar llave.

		System.out.println("El número es factor de 1");

		if(numero%2==0)
			System.out.println("El número es factor de 2");

		if(numero%3==0) {
			System.out.println("El número es factor de 3");
		}
		if(numero%4==0) {
			System.out.println("El número es factor de 4");
		}
		if(numero%5==0) {
			System.out.println("El número es factor de 5");
		}
		if(numero%6==0) {
			System.out.println("El número es factor de 6");
		}
		if(numero%7==0) {
			System.out.println("El número es factor de 7");
		}
		if(numero%8==0) {
			System.out.println("El número es factor de 8");
		}
		if(numero%9==0) {
			System.out.println("El número es factor de 9");
		}
		if(numero%10==0) {
			System.out.println("El número es factor de 10");
		}

	}

}