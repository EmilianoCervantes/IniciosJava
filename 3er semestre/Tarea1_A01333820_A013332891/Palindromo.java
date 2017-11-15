public class Palindromo implements Operaciones{
	private int datos[];

	public Palindromo(){
		datos = new int[1];
	}
	public boolean esPalindromo(int numero ){
		int cant=0,numero2=numero;
		
		while(numero2>=1){
			numero2/=10;
			cant++;
		}
		datos=new int [cant];
		int w=0;
		while(numero>=1){
			datos[datos.length-(w+1)]=numero%10;
			numero/=10;
			w++;
		}
		boolean determinacion=true;
		for(int i=0;i<(datos.length/2);i++){
			
			//comparamos primero contra ˙ltimo y sucesivamente
			if(datos[i]!=datos[datos.length-(1+i)]){
				determinacion=false;
			}
		}
		return determinacion;
	}

	public boolean laSumaEsPalindromo(int a, int b){
		int c=a+b;
		boolean suma=esPalindromo(c);
		return suma;
	}

	public String generaPalindromo(int numeroDeDigitos ){
		datos=new int [numeroDeDigitos];
		String Pal="";	
		for(int i=0;i<=datos.length/2;i++){
			datos[i]=(int)Math.floor(Math.random()*10);
			datos[datos.length-(1+i)]=datos[i];
		}
		for(int i=0;i<datos.length;i++){
			Pal+=datos[i];
		}
		return Pal;
	}

	public String generaPalindromoBinario(int numeroDeDigitos){
		datos=new int [numeroDeDigitos];
		String Pal="";	
		for(int i=0;i<=datos.length/2;i++){
			datos[i]=(int)Math.floor(Math.random()*2);
			datos[datos.length-(1+i)]=datos[i];
		}
		for(int i=0;i<datos.length;i++){
			Pal+=datos[i];
		}
		return Pal;
	}
}