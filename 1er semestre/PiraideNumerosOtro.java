public class PiraideNumerosOtro {
	public static void main (String[] args){
		int altura, incremento, i, j, a;
		System.out.println("Bienvenido a la pir�mide de n�meros");
		System.out.print("�De qu� altura (n�mero de pisos) quieres tu pir�mide?: ");
		altura=Integer.parseInt(System.console().readLine());
		System.out.print("�De cu�nto en cu�nto va a ir la secuencia (incremento)?: ");
		incremento=Integer.parseInt(System.console().readLine());

		a=0;
		System.out.println(a+" ");
		for(i=1;i<=altura;i++){
			for(j=0;j<=i;j++){
					a+=incremento;
					System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}