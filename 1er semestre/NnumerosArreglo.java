/* Pedir una lista de n n�meros; vamos a pedir primero el n�m de datos que quiere guardar
para ello se har� un for con un [0+i] dentro. Para la posici�n m*/
public class NnumerosArreglo {
	public static void main(String[] args){
		int i, n, m;
		int[] num;


		System.out.print("Bienvenido, �de qu� tama�o quieres tu arreglo?: ");
		n=Integer.parseInt(System.console().readLine());

		num = new int [n];

		m=0;
		for(i=0;i<n;i++){
			System.out.print("Dame un n�mero: ");
			num[0+i]=Integer.parseInt(System.console().readLine());
		}
		System.out.print("�Qu� n�mero de elemento quieres sacar del arreglo?: ");
		m=Integer.parseInt(System.console().readLine());

		System.out.println("El n�mero en la posici�n que pediste es: " +num[m-1]);
	}
}
