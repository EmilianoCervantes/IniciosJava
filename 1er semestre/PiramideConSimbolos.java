/*Imprima una letra o simbolo varias veces en forma de triangulo.
Primero pediré la altura del triángulo y luego el símbolo a imprimir.
*/
//import java.util.Scanner;
public class PiramideConSimbolos{
	//private static Scanner sc;
	public static void main(String[] args){
		int pisos;
		char simbolo;
		//Voy a llamar a mi scanner sc (hasta que sepa como usarlo, lo pondré
		//Scanner sc = new Scanner(System.in);

		System.out.println("Hola, vamos a imprimir una pirámide.");
		System.out.print("¿De cuántos pisos quieres tu pirámide? ");
		pisos = Integer.parseInt(System.console().readLine()); //sc.nextInt();
		System.out.print("¿Con qué letra lo quieres rellenar? ");
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