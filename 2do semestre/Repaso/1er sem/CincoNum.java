public class CincoNum {
	public static void main(String[] args){
		int i, sum, prom, prod, may, men;
		int[] num=new int[5];

		System.out.print("Dame 5 números enteros");

		for(i=0;i<5;i++){
			System.out.print("Dame el "+(i+1)+": ");
			num[i]=Integer.parseInt(System.console().readLine());
		}
		sum=sum(num);
		System.out.println("La suma de los 5 números es: "+sum);
		System.out.println();
		prom=prom(num);
		System.out.println("El promedio de los números es: "+prom);
		System.out.println();
		prod=prod(num);
		System.out.println("Su producto es igual a: "+prod);
		System.out.println();
		may=may(num);
		System.out.println("El número mayor es: "+may);
		System.out.println();
		men=men(num);
		System.out.println("Y el menor es: "+men);
	}
	public static int sum (int[] num){
		int i, sum=0;
		for(i=0;i<5;i++){
			sum+=num[i];
		}
		return sum;
	}

	public static int prom (int[] num){
		int i, prom=0;
		for(i=0;i<5;i++){
			prom+=num[i];
		}
		prom=prom/5;
		return prom;
	}

	public static int prod (int[] num){
		int i, prod=1;
		for(i=0;i<5;i++){
			prod=num[i]*prod;
		}
		return prod;
	}

	public static int may (int[] num){
		int i, mayor=-300;
		for(i=0;i<5;i++){
			if(mayor<num[i]){
				mayor=num[i];
			}
		}
		return mayor;
	}

	public static int men (int[] num){
		int i, menor=300000;
		for(i=0;i<5;i++){
			if(menor>num[i]){
				menor=num[i];
			}
		}
		return menor;
	}
}