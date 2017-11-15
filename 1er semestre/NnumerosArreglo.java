/* Pedir una lista de n números; vamos a pedir primero el núm de datos que quiere guardar
para ello se hará un for con un [0+i] dentro. Para la posición m*/
public class NnumerosArreglo {
	public static void main(String[] args){
		int i, n, m;
		int[] num;


		System.out.print("Bienvenido, ¿de qué tamaño quieres tu arreglo?: ");
		n=Integer.parseInt(System.console().readLine());

		num = new int [n];

		m=0;
		for(i=0;i<n;i++){
			System.out.print("Dame un número: ");
			num[0+i]=Integer.parseInt(System.console().readLine());
		}
		System.out.print("¿Qué número de elemento quieres sacar del arreglo?: ");
		m=Integer.parseInt(System.console().readLine());

		System.out.println("El número en la posición que pediste es: " +num[m-1]);
	}
}
