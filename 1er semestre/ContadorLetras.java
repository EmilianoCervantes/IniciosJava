/* Vamos a contar el n�mero de letras por palabra, hasta que nos dejen de arrojar palabras.
Al final vamos a poner la palabra que tenga m�s letras*/
// String palabra = "fundamentos",
// int longitud = palabra.length();
public class ContadorLetras {
	public static void main (String[] args){
		int m;
		String palabra, fin=""; //Para inicializar palabras poner: " " y listo
		m=0;
		System.out.println("Bienvendio, aqu� le diremos cu�l palabra tiene m�s letras");
		System.out.println("Ingrese palabras hasta que ya no quiera");

		do{
			System.out.println("Ingrese su palabra: ");
			palabra = System.console().readLine();
			if(palabra.length() > m) {
				m=palabra.length();
				fin=palabra;
			}
		} while(palabra.length()!=0);
		System.out.println("La longitud es: "+m);
		System.out.println("La palabra es: "+fin);

		/*do {
			System.out.println("Ingrese su palabra: ");
			palabra = System.console().readLine();

			System.out.println("�Quieres seguir ingresando palabraa?: Y/N");

		}while(i==1);
		System.out.println("La palabra m�s larga es: "+m);*/
	}
}
