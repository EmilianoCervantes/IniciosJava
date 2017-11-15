public class Arreglo {
	public static void main(String[] args) {
		int[] numeros;
		numeros = new int [3];

		System.out.print("Dame un número: ");
		numeros[0]=Integer.parseInt(System.console().readLine());
		System.out.print("Dame un número: ");
		numeros[1]=Integer.parseInt(System.console().readLine());
		System.out.print("Dame un número: ");
		numeros[2]=Integer.parseInt(System.console().readLine());

		System.out.println("Los valores son: "+numeros[0]+", "+numeros[1]+", "+numeros[2]);
	}
}