public class EjerDosExamen {
	public static void main(String[] args){
		int numero, amigo, j;
		System.out.print("Dame un número: ");
		numero=Integer.parseInt(System.console().readLine());
		divNumero(numero);

		for(int i=2;i<=numero;i++){
			amigo=0;
			for(j=1;j<i;j++){
				if(i%j==0){
					amigo+=j;
				}
			}
			if(i%j==0){
				System.out.println("El número amigo de "+i+" es "+amigo);
			}
		}
	}

	public static int divNumero(int numero){
		int i, j=0, amigo=0;
		int[] divisores;

		divisores = new int[numero];

		for(i=1;i<numero;i++){
			if(numero%i==0){
				System.out.println("El número es divisible entre: "+i);
				divisores[j]=i;
				j++;
			}
		}
		for(i=0;i<numero;i++){
			amigo+=divisores[i];
		}
		System.out.println("Tu múmero amigo es: "+amigo);

		return amigo;
	}
}

