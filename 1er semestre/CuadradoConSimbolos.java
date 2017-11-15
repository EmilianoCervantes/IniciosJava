/*Primero a pedir el lado del cuadrado, con eso sacar la distancia.
luego pedir el simbolo. */
public class CuadradoConSimbolos{
	public static void main(String[] args){
		int ancho, largo;
		char simbolo;

		System.out.println("Hola, vamos a imprimir un cuadril�tero.");
		System.out.print("�Qu� tan ancho lo quieres? ");
		ancho = Integer.parseInt(System.console().readLine());
		System.out.print("�Qu� tan largo lo quieres? ");
		largo = Integer.parseInt(System.console().readLine());
		System.out.print("�Con qu� letra lo quieres rellenar? ");
		simbolo = System.console().readLine().charAt(0);
		//Llamo a la primer funcion
		Cuadrado(simbolo, ancho);

		//ancho - altura; largo - base
	}
	public static void Cuadrado(char simbolo, int ancho){
		for(int i=0;i<ancho;i++){
			for(int j=0;j<ancho; j++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
	}
}