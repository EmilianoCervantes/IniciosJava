/* Vamos a un npumero a la vez, diez veces, luego los vamos a comparar para ver cu�l fue el mayor.
Habr�a que compararlos quiz� un por uno. El menor es el que se va guardando. */
public class MenorDiezNumeros {
	public static void main (String[] args){
		int i;
		double m, n;

		System.out.println("Bienvenido a la comparaci�n de diez n�meros");
		m=0;
		for(i=0;i<10;i++){

			System.out.print("Dame un n�mero " );
			n = Double.parseDouble(System.console().readLine());

			if(i==0){
				m=n;
			}
			else if(n<m){
				m=n;
			}
		}
		System.out.print("El n�mero menor es: " +m);
	}
}