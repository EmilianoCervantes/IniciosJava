/* Le pido dos valores al usuario.
Después se establecen las condiciones a>b, a<b, a=b; y se comparan los números.
Al final le mostramos al usuario el número más grande.
*/
public class MayordeDosNumeros {
	public static void main(String [] args){
		String texto;
		int a, b;

		System.out.println("Dame dos números");
		System.out.print("Dame el primero ");
		texto = System.console().readLine();
		a= Integer.parseInt(texto);
		System.out.print("Dame el segundo ");
		texto = System.console().readLine();
		b= Integer.parseInt(texto);

		//Si el primero es mayor al segundo
		if(a > b) {
			System.out.println("El mayor es " +a);
		}
		//Si el segundo es mayor

		if( a < b){
			System.out.println("El mayor es " +b);
		}
		//Si son iguales
		if( a == b){
			System.out.println("Los números son iguales");
		}
	}
}