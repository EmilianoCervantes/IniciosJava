public class SumatoriaNumeros {
	public static void main (String[] args){
		int i, a;
		double m, n;

		System.out.println("Bienvenido a la sumatoria de n�meros");
		System.out.print("�Cu�ntos n�meros vas a sumar? ");
		a = Integer.parseInt(System.console().readLine());
		m=0;

		for(i=0;i<a;i++){

			System.out.print("Dame un n�mero " );
			n = Double.parseDouble(System.console().readLine());

				m=m+n;

		}
		System.out.print("La suma de los n�meros es: " +m);
	}
}