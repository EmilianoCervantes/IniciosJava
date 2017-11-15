
public class main {
	public static void main (String [] args){
		int datos[]=new int[5];
		int numero=12345,w=0;
		System.out.println("hola");
		while(numero>=1){
			datos[datos.length-(w+1)]=numero%10;
			
			numero/=10;
			w++;
		}
		for(int i=0;i<5;i++){
			System.out.println(datos[i]);
		}
	}
}
