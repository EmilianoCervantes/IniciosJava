import java.util.Random.*;

public class prueba{
	public static void main(String args[]){
		int a, b, c;
		for(int i=0;i<10;i++){
			System.out.println((int)Math.floor(Math.random()*10));
		}
		for(int i=0;i<10;i++){
			System.out.println((int)Math.ceil(Math.random()*10));
		}
		System.out.println();
		System.out.println();
		System.out.println((int)(Math.random()*9));

		System.out.println();
		System.out.println();
		int n=0, m=0;
		//arreglo[n] --> el "buscado"
		int arreglo[] = new int[10];
		for(int i=0;i<10;i++){
			arreglo[i]=i-1;
		}
		for(int i=0;i<10;i++){
			if (((Comparable)arreglo[n]).compareTo(arreglo[i])<m){
				n=i;
				System.out.println(n);
				m=(((Comparable)arreglo[n]).compareTo(arreglo[i]));
				System.out.println(m);
			}
		}

		/*Random yolo = new Random();
		yolo.nextInt(8);*/
	}
}