public class AlgoritmoMago {
	public static void main (String [] args) {
		int resultado;
		int a;
		int b;
		String texto;

		System.out.println("Piensa en dos n�meros del 1 al 9");
		System.out.println("El primero multipl�calo por 5");
		System.out.println("Al resultado s�male 7");
		System.out.println("Este nuevo resultado multipl�calo por 2");
		System.out.println("Al final, s�male el segundo n�mero al resultado que obtuviste");
		System.out.println("Tu resultado fue:");
				texto = System.console().readLine();
		resultado = Integer.parseInt(texto);

		b=(resultado-14)%10;
		//mi algoritmo original no serv�a del todo bien porque deb�a seleccionar el o los primeros dos n�meros y aqu� no s� todav�a c�mo hacerlo
		//entonces me fui con 2(5x+7)+y=n�mero, que es la f�rmula del problema; 10x+14+y=num --> 10x+y=num-14

		a=(resultado-14)/10;

		System.out.print("Los dos n�meros en que pensaste son: ");
		System.out.print(a);
		System.out.print(" y ");
		System.out.println(b);

	}
}