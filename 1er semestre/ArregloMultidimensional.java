import java.util.Scanner;

public class ArregloMultidimensional {
	public static void main(String[] args){
		int renglon, columna, i, j;
		int[][] tabla;
		Scanner sc = new Scanner(System.in);

		System.out.println("Hola");
		System.out.print("Dame el número de renglones: ");
		renglon = sc.nextInt();
		//sc nos sirve como System.console.readLine
		System.out.println();
		System.out.print("Dame el número de columnas que desees :");
		columna = sc.nextInt();

		tabla = new int[renglon][columna];

		for(i=0; i<renglon; i++){
			for(j=0;j<columna;j++){
				System.out.print("Valor "+i+", "+j+" : ");
				tabla[i][j] = sc.nextInt();
			}
		}

		for(i=0; i<renglon; i++){
			for(j=0;j<columna;j++){
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}
}