public class Cadenas2 {
	public static void main(String[] args) {
		String texto;
		System.out.print("Dame un texto: ");
		texto=System.console().readLine();

		System.out.println(texto.length());
		System.out.println(texto.charAt(3));
		System.out.println(texto.replace('a', 'e'));
		System.out.println(texto.toUpperCase ());
		splitCadena(texto);
	}

	public static String splitCadena (String texto) {

		String[] partes = texto.split(" ");
		for (int i= 0; i<partes.length; i++){
			System.out.println(partes[i]);
		}
		return texto;
	}
}