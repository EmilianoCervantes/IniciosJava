public class SepararDig {
	public static void main (String[] args) {
		int num, i, dig=0;

		System.out.print("Dame un n�mero entero de 5 d�gitos: ");
		num=Integer.parseInt(System.console().readLine());

		/*Podemos dividir cada d�gito entre 1,10,100,etc; e ir imprimiendo cada resultado*/
		//Usar� Math.pow() y el 10 como base e i como exponente
		for(i=4;i>=0;i--){
			dig=num/(int)(Math.pow(10,i));
			if(i>0){
				System.out.print(dig+",");
			}
			else{
				System.out.print(dig);
			}
			num=num-(dig*(int)(Math.pow(10,i)));
		}
		System.out.println();
	}
}