/* Denpendiendo de un texto, se tienen que buscar el número de vocales en un texto
Para ello primero se pide el texto,
y luego se va a buscar comparar las vocales contra el texto */
public class VocalesEnUnTexto {
	public static void main(String[] args){
		int y, letras, n;
		String texto;
		texto= " ";

		System.out.println("Bienvenido");

		System.out.print("Escribe un texto: ");
		texto = System.console().readLine();
		letras = texto.length();
		y=0;
		int a=0, e=0, i=0, u=0, o=0;
		for(n=0;n<letras;n++){
			if(texto.charAt(n)=='A'|texto.charAt(n)=='E'|texto.charAt(n)=='I'|texto.charAt(n)=='O'|
			texto.charAt(n)=='U'|texto.charAt(n)=='a'|texto.charAt(n)=='e'|texto.charAt(n)=='i'|
			texto.charAt(n)=='o'|texto.charAt(n)=='u'|texto.charAt(n)=='Á'|texto.charAt(n)=='É'|
			texto.charAt(n)=='Í'|texto.charAt(n)=='Ó'|texto.charAt(n)=='Ú'|texto.charAt(n)=='á'|
			texto.charAt(n)=='é'|texto.charAt(n)=='í'|texto.charAt(n)=='ó'|texto.charAt(n)=='ú'){
				y++;
			}
			if(texto.charAt(n)=='A'|texto.charAt(n)=='a'|texto.charAt(n)=='Á'|texto.charAt(n)=='á'){
				a++;
			}
			if(texto.charAt(n)=='I'|texto.charAt(n)=='i'|texto.charAt(n)=='Í'|texto.charAt(n)=='í'){
				i++;

			}
			if(texto.charAt(n)=='U'|texto.charAt(n)=='u'|texto.charAt(n)=='Ú'|texto.charAt(n)=='ú'){
				u++;

			}
			if(texto.charAt(n)=='O'|texto.charAt(n)=='o'|texto.charAt(n)=='Ó'|texto.charAt(n)=='ó'){
				e++;

			}
			if(texto.charAt(n)=='E'|texto.charAt(n)=='e'|texto.charAt(n)=='É'|texto.charAt(n)=='é'){
				o++;

			}
		}
		System.out.println("El número de a's es: "+a);
		System.out.println("El número de i's es: "+i);
		System.out.println("El número de u's es: "+u);
		System.out.println("El número de o's es: "+e);
		System.out.println("El número de e's es: "+o);
		System.out.println("El número de vocales en: "+texto+"; es de: "+y);

	}
}

