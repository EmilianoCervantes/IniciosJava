/* Le pido tress valores al usuario.
Despu�s se establecen las condiciones a>b, a<b, a==b; y se comparan los n�meros.
Despu�s se mete otra condici�n dentro de la primera para comparar con el tercero.
Al final le mostramos al usuario el n�mero m�s grande.
*/
public class MayordeTresNumeros {
	public static void main(String [] args){
		String texto;
		int a, b, c;

		System.out.println("Dame dos n�meros");
		System.out.print("Dame el primero ");
		texto = System.console().readLine();
		a= Integer.parseInt(texto);
		System.out.print("Dame el segundo ");
		texto = System.console().readLine();
		b= Integer.parseInt(texto);
		System.out.print("Dame el tercero ");
		texto = System.console().readLine();
		c= Integer.parseInt(texto);

		//Si el primero es el mayor
		if(a > b) {
			if(a > c) {
			System.out.println("El mayor es " +a);
			}
		}

		//Si el segundo es el mayor
		if( b > a) {
			if(b > c) {
			System.out.println("El mayor es " +b);
			}
		}

		//Si el tercero es el mayor
		if( c > a){
			if(c > b) {
			System.out.println("El mayor es " +c);
			}
		}

		//Si son iguales
		if( a == b) {
			if(a == c) {
			System.out.println("Los n�meros son iguales");
			}
		}

		//Si dos n�meros son iguales pero el tercero no

		//Si los primeros dos son mayores
		if( a == b){
			if(a > c){
				System.out.println("El mayor es " +a);
			}
		}

		//Si los segundos dos son mayores
		if( c == b){
			if(a < c){
				System.out.println("El mayor es " +b);
			}
		}

		//Si el primero y el �ltimo son iguales
		if( a == c){
			if(a > b){
				System.out.println("El mayor es " +a);
			}
		}
	}
}