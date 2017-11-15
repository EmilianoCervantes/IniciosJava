/*Imprima una letra o simbolo varias veces en forma de triangulo.
Primero pedir� la altura del tri�ngulo y luego el s�mbolo a imprimir.
*/
//import java.util.Scanner;
public class PiramideConSimbolos{
	//private static Scanner sc;
	public static void main(String[] args){
		int pisos;
		char simbolo;
		//Voy a llamar a mi scanner sc (hasta que sepa como usarlo, lo pondr�
		//Scanner sc = new Scanner(System.in);

		System.out.println("Hola, vamos a imprimir una pir�mide.");
		System.out.print("�De cu�ntos pisos quieres tu pir�mide? ");
		pisos = Integer.parseInt(System.console().readLine()); //sc.nextInt();
		System.out.print("�Con qu� letra lo quieres rellenar? ");
		simbolo = System.console().readLine().charAt(0);
		//Llamo a la primer funcion
		Altura(simbolo, pisos);
	}
	public static void Altura(char simbolo, int pisos){
		for(int i=0;i<pisos;i++){
		//Llamo a la segunda funcion.
			Linea(simbolo, i+1);
			System.out.println();
			}
	}
	public static void Linea(char simbolo, int elementos){
		for(int i=0;i<elementos; i++) {
			System.out.print(simbolo);
		}
	}
}