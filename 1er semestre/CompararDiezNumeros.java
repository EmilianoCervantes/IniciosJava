/* Vamos a pedir diez n�meros y luego los vamos a comparar para ver cu�l fue el mayor.
Habr�a que compararlos quiz� un por uno o a la vez. */
public class CompararDiezNumeros {
	public static void main (String[] args){
		int i;
		double m, n;

		System.out.println("Bienvenido a la comparaci�n de diez n�meros");
		m=0;
		for(i=0;i<10;i++){

			System.out.print("Dame un n�mero " );
			n = Double.parseDouble(System.console().readLine());

			if(n>m){
				m=n;
			}
		}
		System.out.print("El n�mero mayor es: " +m);
	}
}