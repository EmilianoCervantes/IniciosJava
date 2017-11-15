public class Palindromo implements Operaciones{
	private int datos[];

	public Palindromo(){
		datos = new int[1];
	}
	public boolean esPalindromo(int numero ){
		for(int i=0;i<(numero.length/2);i++){
			//comparamos primero contra último y sucesivamente
			if(pal[i]!=pal[pal.length-(1+i)]){
				return false;
			}
		}
		return true;
	}

	public boolean laSumaEsPalindromo(int a, int b){
		int c=a+b;
		boolean suma=esPalinfromo(c);
		return suma;
	}

	public String generaPalindromo(int numeroDeDigitos ){
		if(numeroDeDigitos%2){
			for(int i=0;i<numeroDeDigitos/2;i++){
				pal[i]=(int)Math.floor(Math.random()*10);
				pal[numerodeDigitos-(1+i)]=pal[i];
			}
		}
		else{
			for(int i=0;i<numeroDeDigitos/2;i++){
				pal[i]=(int)Math.floor(Math.random()*10);
				pal[numerodeDigitos-(1+i)]=pal[i];
			}
			pal[(numeroDeDigitos/2)+1]=Math.floor(Math.random()*10);
		}
	}

	public String generaPalindromoBinario(int numeroDeDigitos){

	}
}