public class ImprimirArregloAlreves {
	public static void main(String[] args){
		int i, n, m, j;
		int[] num;

		System.out.print("Bienvenido, ¿de qué tamaño quieres tu arreglo?: ");
		n=Integer.parseInt(System.console().readLine());

		num = new int [n];

		m=0;
		for(i=0;i<n;i++){
			System.out.print("Dame un número: ");
			num[0+i]=Integer.parseInt(System.console().readLine());
		}
		System.out.print("Los números al revés son: ");
		for(i=1;i<=n;i++){
			//i tiene que ser igual a 1 porque los arreglos empiezan en [0]..
			//si son 30 datos, el arreglo termina en [29]
			System.out.print(num[n-i]+" ");
		}
	}
}
