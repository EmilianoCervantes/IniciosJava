public class AdivinarNumero {
	public static void main (String[] args){
		int i, numero, adivinar;
		System.out.println("Bienvendio al adivinador de n�meros");
		System.out.println("Trata de adivinar el n�mero del 1 al 100, tienes 10 intentos");
		for(i=0;i<10;i++){
			System.out.print("Ingresa un n�mero ");
			adivinar=Integer.parseInt(System.console().readLine());
			numero = (int)Math.round(Math.random()*99) + 1;
			System.out.println(numero);
			if(numero == adivinar){
				System.out.println("Felicidades, adivinaste el n�mero");
				i=10;
			}
		}
	}
}