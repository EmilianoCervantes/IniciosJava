/*Aquí se piden n palabras, luego se pide que se elija una palabra del arreglo
y después la letra que quiera de esa palabra*/

public class PosicionLetrasArreglo {
	public static void main(String[] args){
		int i, n, m;
		String[] pal;

		System.out.print("Bienvenido, ¿cuántas palabras vas a ingresar?: ");
		n=Integer.parseInt(System.console().readLine());

		pal = new String [n];


		for(i=0;i<n;i++){
			System.out.print("Dame una palabra: ");
			pal[0+i]=System.console().readLine();
		}
		System.out.print("¿Qué numero de palabra del arreglo quiere?: ");
		m=Integer.parseInt(System.console().readLine());
		System.out.println(pal[m-1]);

		System.out.print("¿Qué numero de letra quieres?: ");
		i=Integer.parseInt(System.console().readLine());
		System.out.println(pal[m-1].charAt(i)); //charAt() es el caracter(n)
		//String es un arreglo de Chars, por lo tanto en la palabra x="hola", la posición x[0] es "h"
	}
}