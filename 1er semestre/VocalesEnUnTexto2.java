public class VocalesEnUnTexto2 {
	public static void main(String[] args){
		String texto;
		char[] letras;
		int[] contador;
		char[] vocales = {'a','e','i','o','u'};
		contador = new int[5];

		System.out.println("Bienvenido");

		System.out.print("Escribe un texto: ");
		texto = System.console().readLine();
		letras = texto.toCharArray();

		for(int i=0;i<letras.length;i++){
			//usar swuith en vez de if
			switch(letras[i]){
	//si se escriben los casos seguidos, aplica para todos lo mismo.
				case 'a':
				case '�':
				case 'A':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					contador[0]++;
					break;
				case 'e':
				case '�':
				case 'E':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					contador[1]++;
					break;
				case 'i':
				case '�':
				case 'I':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					contador[2]++;
					break;
				case 'o':
				case 'O':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					contador[3]++;
					break;
				case 'u':
				case 'U':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
				case '�':
					contador[4]++;
					break;
			}
		}
		for(int i=0;i<contador.length;i++){
		//arriba s�lo contamos las vocales
		//aqu� vamos diciendo qu� vocal es y el n�mero de vocales que hay almacenado
			System.out.println(vocales [i]+ ": "+contador[i]);
		}
	}
}