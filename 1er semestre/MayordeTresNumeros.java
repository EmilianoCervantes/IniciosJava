/* Le pido tress valores al usuario.
Después se establecen las condiciones a>b, a<b, a==b; y se comparan los números.
Después se mete otra condición dentro de la primera para comparar con el tercero.
Al final le mostramos al usuario el número más grande.
*/
public class MayordeTresNumeros {
	public static void main(String [] args){
		String texto;
		int a, b, c;

		System.out.println("Dame dos números");
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
			System.out.println("Los números son iguales");
			}
		}

		//Si dos números son iguales pero el tercero no

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

		//Si el primero y el último son iguales
		if( a == c){
			if(a > b){
				System.out.println("El mayor es " +a);
			}
		}
	}
}