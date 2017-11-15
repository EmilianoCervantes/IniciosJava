public class MiClase2Promedio {
	public static void main (String [] args) {
		int numero1, numero2, numero3, numero4;
		int a;
		double promedio;
		String texto;

		System.out.println("Dame 4 números");

		System.out.println("Dame el primero");
		texto = System.console().readLine();
		//Convertir texto a número:
		numero1 = Integer.parseInt(texto);

		System.out.println("Dame el segundo");
		texto = System.console().readLine();
		numero2 = Integer.parseInt(texto);

		System.out.println("Dame el tercero");
		texto = System.console().readLine();
		numero3 = Integer.parseInt(texto);

		System.out.println("Dame el cuarto");
		texto = System.console().readLine();
		numero4 = Integer.parseInt(texto);

		a=(numero1+numero2+numero3+numero4)/4;

		System.out.print("El promedio de tus 4 números es: ");
		System.out.println(a);
	}
}