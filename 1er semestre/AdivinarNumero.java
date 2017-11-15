public class AdivinarNumero {
	public static void main (String[] args){
		int i, numero, adivinar;
		System.out.println("Bienvendio al adivinador de números");
		System.out.println("Trata de adivinar el número del 1 al 100, tienes 10 intentos");
		for(i=0;i<10;i++){
			System.out.print("Ingresa un número ");
			adivinar=Integer.parseInt(System.console().readLine());
			numero = (int)Math.round(Math.random()*99) + 1;
			System.out.println(numero);
			if(numero == adivinar){
				System.out.println("Felicidades, adivinaste el número");
				i=10;
			}
		}
	}
}