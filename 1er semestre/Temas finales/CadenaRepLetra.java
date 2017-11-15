/* El programa debe leer diez frases y una letra dadas por el usuario.
	Después se verá el número de veces que la letra se repite en el texto.
	1. Pedir texto y letra.
	2. Ver repeticiones.
	*/

public class CadenaRepLetra {
	public static void main(String[] args) {
		String[] texto = new String[10];
		char letra;
		int i, j, k=0;

		for(i=0;i<texto.length;i++){
			System.out.print("Dame la frase "+(i+1)+": ");
			texto[i]=System.console().readLine();
		}

		System.out.print("Dame una letra: ");
		letra=System.console().readLine().charAt(0);

		for(i=0;i<10; i++){
			k=0;
			for(j=0;j<texto[i].length(); j++){
				if(texto[i].charAt(j)==letra){
					k++;
				}
			}
		System.out.println("La letra "+letra+" se repite "+k+" veces en el texto "+(i+1)+".");
		}
	}
}