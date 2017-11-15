public class ArregloSepararParesNones {
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
		System.out.println("Estos son los pares del arreglo: ");
		for(i=0;i<n;i++){

			if(num[i]%2==0){
				System.out.print(num[i]+" ");
			}
		}
		System.out.println(" ");
		System.out.println("Estos son nones del arreglo: ");
		for(i=0;i<n;i++){
			if(num[i]%2!=0){
				System.out.print(num[i]+" ");
			}
		}
	}
}