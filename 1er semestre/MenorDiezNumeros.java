/* Vamos a un npumero a la vez, diez veces, luego los vamos a comparar para ver cuál fue el mayor.
Habría que compararlos quizá un por uno. El menor es el que se va guardando. */
public class MenorDiezNumeros {
	public static void main (String[] args){
		int i;
		double m, n;

		System.out.println("Bienvenido a la comparación de diez números");
		m=0;
		for(i=0;i<10;i++){

			System.out.print("Dame un número " );
			n = Double.parseDouble(System.console().readLine());

			if(i==0){
				m=n;
			}
			else if(n<m){
				m=n;
			}
		}
		System.out.print("El número menor es: " +m);
	}
}