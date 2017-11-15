/*El cuadro m�gico consta de de n�meros del 1 al 9, todos deben dar el mismo
resultado. Se le pedir� al usuario que ingrese n�meros del 1 a 9 en cierto
orden y decirle si cre� o no un cuadro m�gico.
*/
import java.util.Scanner;

public class CuadroMagico {
	public static void main(String[] args){
		int x, y, i=0;
		boolean exito;
		int[][]cuadro;
		cuadro = new int [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, vamos a jugar al Cuadro M�gico de 3x3");
		System.out.println("En �l jugaremos con base en el sistema de cordenadas");
		System.out.println();
		System.out.println("El Cuadro M�gico se va llenando con los n�meros del 1 al 9");
		//Como es una tabla de 3x3 hay que seguir un sistema de cordenadas.

		//Empezamos con los renglones y luego vamos columna por columna
		for(x=0; x<3; x++){
			for(y=0;y<3;y++){
				System.out.print("Valor "+x+", "+y+" : ");
				cuadro[x][y] = sc.nextInt();
			}
		}

		for(x=0; x<3; x++){
			for(y=0;y<3;y++){
				System.out.print(cuadro[x][y] + "\t");
			}
			System.out.println();
		}
		//primero vas a revisar si las filas dan 15
		for(x=0;x<3;x++){
			y=0;
			if(cuadro[x][y]+cuadro[x][y+1]+cuadro[x][y+2]==15){
				i+=1;
			}
		}
		//Despu�s revisaremos si las columnas dan 15
		for(y=0;y<3;y++){
			x=0;
			if(cuadro[x][y]+cuadro[x+1][y]+cuadro[x+2][y]==15){
				i+=1;
			}
		}
		//Decimos si lo logr� o no
		if(i==6){
			System.out.println("�Lo lograste completar! :D");
		}
		else{
			System.out.println("NO LO LOGRASTE!!! Buuuuu :(");
		}
	}
}
