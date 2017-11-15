/* par /2, non *3+1*/
public class Hailstone {
	public static void main (String[] args){
		int i, numero;
		System.out.println("Bienvendio a la secuencia Hailsone");
		System.out.println("Ingresa el número entero");
		numero = Integer.parseInt(System.console().readLine());
		i=0;
		while (i!=1) {
			if(numero%2==0){
				numero=numero/2;
				System.out.println(numero);
			}
			else {
				numero=numero*3+1;
				System.out.println(numero);
			}
			i=numero;
		}
	}
}