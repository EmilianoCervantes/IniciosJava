/*
Modificar CadenaRepLetra para contar el n�mero de vocales en c/frase.
*/
public class NumeroVocales {
	public static void main(String[] args) {
		String[] texto = new String[10];
		char letra;
		int i, j, k;

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
		System.out.println("El n�mero de vocales en el texto "+(i+1)+" es de: "+k);
		}
	}
}