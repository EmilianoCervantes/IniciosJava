public class InversionCadenaRecursivo{
	public static void main(String[] args){
		String cadena, cadenaInvertida;
		System.out.print("Dame tu palabra o cadena: ");
		cadena = System.console().readLine();
		cadenaInvertida = invertir(cadena);
		System.out.println(cadenaInvertida);
	}

	private static String invertir(String cadena){
		String ultimoCaracter;
		int numCaracteres = cadena.length() -1;
		if(numCaracteres == 0){
			return cadena;
		}else{
			ultimoCaracter = cadena.charAt(numCaracteres);
			String cadenaAcortada = ultimoCaracter;
			ultimoCaracter += invertir(cadenaAcortada);
		}
	}
}