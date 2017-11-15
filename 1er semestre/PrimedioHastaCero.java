/* Para pedir la lista de números hasta cero, nada más vamos haciendo la sumatoria hasta
que el usuario ingrese un cero; ponemos condicional que al ingresar 0, el programa se detenga
y ya al final sacamos el promedio*/
public class PrimedioHastaCero {
	public static void main (String[] args){
		int a;
		double m, n, i;

		System.out.println("Bienvenido al promedio hasta Cero");
		System.out.println("Todo se sumará y promediará hasta que ingreses un 0");

		m=0;
		i=0;
		a=-1;
		do {
			System.out.print("Dame un número " );
			n = Double.parseDouble(System.console().readLine());

			m+=n;
			i=n;
			a++;
		} while(i!=0);
		m=m/a;
		System.out.println("El promedio es " +m);
	}
}