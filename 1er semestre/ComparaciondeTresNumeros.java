/* Le pido tress valores al usuario.
Despu�s se establecen las condiciones a>b, a<b, a==b; y se comparan los n�meros.
Despu�s se mete otra condici�n dentro de la primera para comparar con el tercero.
Se meten dos condiciones dentro de la primera para sacar el mayor y el menor.
Al final le mostramos al usuario el n�mero m�s grande y el m�s peque�o.
*/
public class ComparaciondeTresNumeros {
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
		//La primera condici�n debe ser la larga
		//Si la segunda condici�n es larga sale medio raro
		if(a > b & a > c) {
			if(b > c) {
			System.out.println("El mayor es " + a+" y el menor es " +c);
			}
			else{
			System.out.println("El mayor es " + a+" y el menor es " +b);
			}
		}

		//Si el segundo es el mayor
		if( b > a & b > c) {
			if(a > c) {
			System.out.println("El mayor es " +b+" y el menor es " +c);
			}
			else{
			System.out.println("El mayor es " + b+" y el menor es " +a);
			}
		}

		//Si el tercero es el mayor
		if( c > a & c > b){
			if(b > a) {
			System.out.println("El mayor es " +c+" y el menor es " +a);
			}
			else{
			System.out.println("El mayor es " +c+" y el menor es " +b);
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
				System.out.println("El mayor es " +a+" y el menor es "+c);
			}
		}

		//Si los segundos dos son mayores
		if( c == b){
			if(a < c){
				System.out.println("El mayor es " +b+" y el menor es "+a);
			}
		}

		//Si el primero y el �ltimo son iguales
		if( a == c){
			if(a > b){
				System.out.println("El mayor es " +a+" y el menor es "+b);
			}
		}
	}
}