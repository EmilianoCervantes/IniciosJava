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
				case 'á':
				case 'A':
				case 'Á':
				case 'â':
				case 'Â':
				case 'ä':
				case 'Ä':
					contador[0]++;
					break;
				case 'e':
				case 'é':
				case 'E':
				case 'É':
				case 'ê':
				case 'Ê':
				case 'ë':
				case 'Ë':
					contador[1]++;
					break;
				case 'i':
				case 'í':
				case 'I':
				case 'Í':
				case 'î':
				case 'Î':
				case 'ï':
				case 'Ï':
					contador[2]++;
					break;
				case 'o':
				case 'O':
				case 'ó':
				case 'Ó':
				case 'ô':
				case 'Ô':
				case 'ö':
				case 'Ö':
					contador[3]++;
					break;
				case 'u':
				case 'U':
				case 'ú':
				case 'Ú':
				case 'û':
				case 'Û':
				case 'ü':
				case 'Ü':
					contador[4]++;
					break;
			}
		}
		for(int i=0;i<contador.length;i++){
		//arriba sólo contamos las vocales
		//aquí vamos diciendo qué vocal es y el número de vocales que hay almacenado
			System.out.println(vocales [i]+ ": "+contador[i]);
		}
	}
}