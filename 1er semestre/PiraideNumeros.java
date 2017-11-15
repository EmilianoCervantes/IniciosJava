public class PiraideNumeros {
	public static void main (String[] args){
		int altura, incremento, i, j, a;
		System.out.println("Bienvenido a la pirámide de números");
		System.out.print("¿De qué altura (número de pisos) quieres tu pirámide?: ");
		altura=Integer.parseInt(System.console().readLine());
		System.out.print("¿De cuánto en cuánto va a ir la secuencia (incremento)?: ");
		incremento=Integer.parseInt(System.console().readLine());

		for(i=1;i<=altura;i++){
			a=1;
			for(j=1;j<=i;j++){
				if (j==1){
					System.out.print(a+" ");
				}
				else {
					a=a+incremento;
					System.out.print(a+" ");
				}
			}
			System.out.println(" ");
		}
	}
}