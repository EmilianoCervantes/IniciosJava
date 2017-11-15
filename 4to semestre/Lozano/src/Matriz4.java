import java.util.Scanner;
public class Matriz4 {
	int uno[][];
	int dos[][];
	int valores[];
	
	public void main( String[] args){
		Scanner sc = new Scanner(System.in);
		//num de matrices que se van a multiplicar
		int numMatrices = sc.nextInt();
		for(int i = 0; i < numMatrices; i++) {
			String matrizEnInt = sc.nextLine();
			String [] dimensiones = matrizEnInt.split(" ");
			int renglon = Integer.parseInt(dimensiones[1]);
			int columna = Integer.parseInt(dimensiones[2]);
			valores = new int[renglon*columna];
			matrixMultip(valores);
		}
	}
	
	//M[i,j] = 0 if i=j
	//M[i,j] = min i<k<j {M[i,k] + M[k+1,j] + p[i-1]p[k]p[j]}
	public void matrixMultip(int[] valores){
		//siguiendo la fórmula y la multiplicacion de matrices:
		int tamano=valores.length;
		int numDeVeces=0;
		uno = new int[tamano-1][tamano-1];
		dos = new int[tamano-1][tamano-1];
		for(int a=1;a<tamano-1; a++) {
            for(int i = 0; i < tamano-(a+1); i++) {
                int j = i + a;
                uno[i][j]=0;
                for(int k = i; k < j; k++) {
                    int formula = uno[i][k] + uno[k+1][j] + valores[i-1]*valores[k]*valores[j];
                    if (formula < uno[i][j]) {
                        uno[i][j] = formula;
                        dos[i][j] = k;
                        numDeVeces++;
                    }
                }
            }
        }
		System.out.println(numDeVeces);
	}
}