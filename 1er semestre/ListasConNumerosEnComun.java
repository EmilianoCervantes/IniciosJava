//Arrays.equals (nombreArray1, nombreArray2)
public class ListasConNumerosEnComun {
	public static void main (String[] args){
		int i, a, b, comun;
		int[] lista1, lista2;

		System.out.println("Bienvenido, vamos a crear dos listas");
		System.out.println("Y veremos cuantos n�meros tienen en com�n");

System.out.println(" "); //Esto va a ser para dar espacio entre l�neas, hasta un mejor m�todo.


		System.out.print("�De cu�ntos n�meros van a ser tus listas?: ");
		a=Integer.parseInt(System.console().readLine());

		lista1 = new int [a];
		System.out.println("Vamos a crear la primer lista: ");
		for(i=0;i<a;i++){
			System.out.print("Dame un n�mero ");
			lista1[0+i]=Integer.parseInt(System.console().readLine());
		}

System.out.println(" ");

		System.out.println("Vamos a crear la segunda lista: ");

		lista2 = new int [a];

		for(i=0;i<a;i++){
			System.out.print("Dame un n�mero ");
			lista1[0+i]=Integer.parseInt(System.console().readLine());
		}
//No sabemos cu�l es m�s grande, en este caso son iguales porque no se me ocurre como comparar lo otro
//El 1er elem de una lista puede ser igual al �ltimo de la otra

		for(i=0;i<a;i++){
			if(