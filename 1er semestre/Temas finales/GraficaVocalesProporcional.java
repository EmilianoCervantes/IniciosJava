/*
Modificar GraficaVocales para graficar el mayor con 10* y los dem�s proporcionales.
La idea podr�a ser hacer una regla de 3, � que se calcule para que salgan proporcionales.
Y utilizar math.round para las respuestas que salgan en decimal.
*/
public class GraficaVocalesProporcional {
	public static void main(String[] args) {
		String[] texto = new String[10];
		int[] grafica = new int[10];
		char letra;
		int i, j, k, n, mayor=0;

		for(i=0;i<texto.length;i++){
			System.out.print("Dame la frase "+(i+1)+": ");
			texto[i]=System.console().readLine();
			texto[i].toLowerCase();
		}

		for(i=0;i<10;i++){
			k=0;
			for(j=0;j<texto[i].length();j++){
				switch(texto[i].charAt(j)){
					case 'a':
					case '�':
					case '�':
					case '�':
						k++;
						break;
					case 'e':
					case '�':
					case '�':
					case '�':
						k++;
						break;
					case 'i':
					case '�':
					case '�':
					case '�':
						k++;
						break;
					case 'o':
					case '�':
					case '�':
					case '�':
						k++;
						break;
					case 'u':
					case '�':
					case '�':
					case '�':
						k++;
						break;
				}
			}
			grafica[i]=k;
		}

		for(i=0;i<grafica.length;i++){
			if(grafica[i]>mayor){
				mayor=grafica[i];
			}
		}
		/*
		10 - mayor
		n  - grafica[i]
		*/

		System.out.println("El histograma de vocales es:");
		for(i=0;i<grafica.length;i++){
			for(n=0;n<(10*grafica[i]/mayor);n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
