//Arrays.equals (nombreArray1, nombreArray2)
public class ListasConNumerosEnComun {
	public static void main (String[] args){
		int i, a, b, comun;
		int[] lista1, lista2;

		System.out.println("Bienvenido, vamos a crear dos listas");
		System.out.println("Y veremos cuantos números tienen en común");

System.out.println(" "); //Esto va a ser para dar espacio entre líneas, hasta un mejor método.


		System.out.print("¿De cuántos números van a ser tus listas?: ");
		a=Integer.parseInt(System.console().readLine());

		lista1 = new int [a];
		System.out.println("Vamos a crear la primer lista: ");
		for(i=0;i<a;i++){
			System.out.print("Dame un número ");
			lista1[0+i]=Integer.parseInt(System.console().readLine());
		}

System.out.println(" ");

		System.out.println("Vamos a crear la segunda lista: ");

		lista2 = new int [a];

		for(i=0;i<a;i++){
			System.out.print("Dame un número ");
			lista1[0+i]=Integer.parseInt(System.console().readLine());
		}
//No sabemos cuál es más grande, en este caso son iguales porque no se me ocurre como comparar lo otro
//El 1er elem de una lista puede ser igual al último de la otra

		for(i=0;i<a;i++){
			if(