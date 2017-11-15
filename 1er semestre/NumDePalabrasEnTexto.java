/*Pedir un texto y mostrar como resultado el número de palabras contenidas en el texto
Primero se pedirá el texto, y después se irá contando cada palabra como un elemento.
Podemos tratar de contar las palabras verificando los espacios ' '*/

public class NumDePalabrasEnTexto{
	public static void main(String[] args){
		int i, palabras=1;
		String texto;
		char[] letras;

		System.out.println("Bienvenido");
		System.out.print("Escribe un texto: ");
		texto = System.console().readLine();

		letras = texto.toCharArray();

		for(i=0;i<letras.length;i++){
			if(letras[i]!=' '){
				//caracteres se escriben con comillas simples
				System.out.print(letras[i]+"-");
			}
			else { palabras++; }

		}
		System.out.println();
		System.out.println("Escribiste "+ palabras + "palabras");
	}
}