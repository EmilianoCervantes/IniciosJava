public class Entrenumeros {
	public static void main (String[] args){
		int numero, i;

		System.out.print("Dame un número entero");
		numero=Integer.parseInt(System.console().readLine());

		for(i=1;i<=numero;i++){
			System.out.println(i);
		}
	}
}