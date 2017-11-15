public class SumatoriaNumDado{
	public static void main(String[]args){
		int num, i;
		double sum=0;
		System.out.print("Dame un número entero");
		num=Integer.parseInt(System.console().readLine());
		System.out.println();

		for(i=1;i<=num;i++){
			sum+=i*1.0;
		}
		System.out.println("La sumatoria entre 1 y el número dado es: "+sum);
	}
}