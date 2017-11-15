public class SeprarLetrasEnArreglo{
	public static void main(String[] args){
		int i;
		String texto;
		char[] letras;

		System.out.println("Bienvenido");
		System.out.print("Escribe un texto: ");
		texto = System.console().readLine();

		letras = texto.toCharArray();
		for(i=0;i<letras.length;i++){
		//toCharArray sirve para contar cada letra del arreglo (del texto que metimos.
			//if(letras[i]!=' '){
			System.out.print(letras[i]+"-");
		}
		System.out.println();
	}
}