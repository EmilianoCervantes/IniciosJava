public class DemoNumeros{
	public static void main(String[]args){
		int num=0;
		boolean exito;
		do{
			System.out.println("Dame un número: ");
			try{
				num=Integer.parseInt(System.console().readLine());
				exito=true;
			} catch(NumberFormatException e){
				System.out.println("Ese no es un número, dame un número: ");
				exito = false;
			}
		}while(exito==false);
		System.out.println("El siguiente número es: "+(num+1));
	}
}