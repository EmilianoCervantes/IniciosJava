/* Condicional escribir dígito. Se va  pedir el dígito y dependiendo el dígito
se imprimirá el dígito en texto. */

public class DigitoTexto {
	public static void main (String[] arg) {
		int digito;

		System.out.print("Dame un dígito: ");
		digito = Integer.parseInt(System.console().readLine());

		if(digito==0) {
			System.out.println("Cero");
		}
		else if(digito==1) {
			System.out.println("Uno");
		}
		else if(digito==2) {
			System.out.println("Dos");
		}
		else if(digito==3) {
			System.out.println("Tres");
		}
		else if(digito==4) {
			System.out.println("Cuatro");
		}
		else if(digito==5) {
			System.out.println("Cinco");
		}
		else if(digito==6) {
			System.out.println("Seis");
		}
		else if(digito==7) {
			System.out.println("Siete");
		}
		else if(digito==8) {
			System.out.println("Ocho");
		}
		else if(digito==9) {
			System.out.println("Nueve");
		}
		else {
			System.out.println("¡No es un dígito!");
		}
	}
}