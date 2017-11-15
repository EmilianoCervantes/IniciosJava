public class DemoNumeros{
	public static void main(String[]args){
		int num=0;
		boolean exito;
		do{
			System.out.println("Dame un n�mero: ");
			try{
				num=Integer.parseInt(System.console().readLine());
				exito=true;
			} catch(NumberFormatException e){
				System.out.println("Ese no es un n�mero, dame un n�mero: ");
				exito = false;
			}
		}while(exito==false);
		System.out.println("El siguiente n�mero es: "+(num+1));
	}
}