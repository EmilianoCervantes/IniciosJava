public class AdivinarNumero2{
	public static void main (String[] args){
		int numero, adivinar, i;

		System.out.println("\tBienvenido, trata de adivinar el n�mero.\nEs entre 1 y 100.");
		System.out.println("S�lo cuentas con ocho intentos.\nMucha suerte.");
		numero=(int)Math.round(Math.random()*99)+1;
		System.out.println();

		for(i=1;i<=8;i++){
			System.out.println("\tIntento "+i);
			System.out.print("Dame un n�mero entero: ");
			adivinar=Integer.parseInt(System.console().readLine());
			if(adivinar==numero){
				System.out.println("�Felicidades! Has adivinado el n�mero:");
				i=10;
			}
			else if(numero>adivinar){
				System.out.println("Lo siento, el n�mero que elegiste es menor");
			}
			else{
				System.out.println("Lo siento, el n�mero que elegiste es mayor");
			}
		}
		if(i==9){
			System.out.println("La respuesta era: "+numero);
		}
	}
}