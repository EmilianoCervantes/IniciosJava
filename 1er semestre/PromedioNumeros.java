public class PromedioNumeros {
	public static void main (String[] args){
		int i, a;
		double m, n;

		System.out.println("Bienvenido, vamos a promediar varios n�meros");
		System.out.print("�Con cu�ntos n�meros vas a promediar? ");
		a = Integer.parseInt(System.console().readLine());
		m=0;

		for(i=0;i<a;i++){

			System.out.print("Dame un n�mero " );
			n = Double.parseDouble(System.console().readLine());

			if(i==0){
				m=n;
			}
			else {
			m=m+n;
			}
		}
		m=m/a;
		System.out.print("El promedio de los n�meros es: " +m);
	}
}
/*
public class PromedioNumeros {
	public static void main (String[] args){
		int i, a;
		double m, n;

		System.out.println("Bienvenido, vamos a promediar varios n�meros");
		System.out.print("�Con cu�ntos n�meros vas a promediar? ");
		a = Integer.parseInt(System.console().readLine());
		m=1;

		for(i=1;i<=a;i++){

			System.out.print("Dame un n�mero " );
			n = Double.parseDouble(System.console().readLine());

			m*=n; // eso es igual a m= m*n;

		}
		m=m/a;
		System.out.print("El promedio de los n�meros es: " +m);
	}
}
*/