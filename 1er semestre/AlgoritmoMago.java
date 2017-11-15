public class AlgoritmoMago {
	public static void main (String [] args) {
		int resultado;
		int a;
		int b;
		String texto;

		System.out.println("Piensa en dos números del 1 al 9");
		System.out.println("El primero multiplícalo por 5");
		System.out.println("Al resultado súmale 7");
		System.out.println("Este nuevo resultado multiplícalo por 2");
		System.out.println("Al final, súmale el segundo número al resultado que obtuviste");
		System.out.println("Tu resultado fue:");
				texto = System.console().readLine();
		resultado = Integer.parseInt(texto);

		b=(resultado-14)%10;
		//mi algoritmo original no servía del todo bien porque debía seleccionar el o los primeros dos números y aquí no sé todavía cómo hacerlo
		//entonces me fui con 2(5x+7)+y=número, que es la fórmula del problema; 10x+14+y=num --> 10x+y=num-14

		a=(resultado-14)/10;

		System.out.print("Los dos números en que pensaste son: ");
		System.out.print(a);
		System.out.print(" y ");
		System.out.println(b);

	}
}