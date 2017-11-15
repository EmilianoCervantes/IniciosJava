
public class Main {
	public static void main(String args[]){
		Box<Integer> caja = new Box<Integer>();
		caja.set(89);
		Box<String> cajaDos = new Box<String>();
		cajaDos.set("Allá en la fuente, había un churrito");
		System.out.println(cajaDos.get());
		
		System.out.println(caja.get());
		int datos[]=new int[5];
		int numero =12345,w=0;
		
		while(numero<10){
			datos[datos.length-(w+1)]=numero%10;
			numero/=10;
			w++;
		}
		for(int i=0;i<5;i++){
			System.out.println(datos[i]);
		}
	}
}
