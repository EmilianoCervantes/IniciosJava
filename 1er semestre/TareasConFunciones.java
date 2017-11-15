/* Para las tareas se va a pedir un n�mero en el main y luego se va a utilizar para
c/tabla.
*/
public class TareasConFunciones {
	public static void main(String[] args) {
		int n, opcion;
		System.out.print("Dame un n�mero: ");
		n = Integer.parseInt(System.console().readLine());
		opciones();
		System.out.print("�Qu� opci�n eliges? ");
		opcion=Integer.parseInt(System.console().readLine());
		switch(opcion){
			case 1:
				tablamulti(n);
				break;
			case 2:
				tablasuma(n);
				break;
			case 3:
				tablaresta(n);
				break;
		}

	}
	public static void opciones(){
		System.out.println("�Qu� quieres hacer?");
		System.out.println("Opci�n 1. Tabla de multiplicaci�n.");
		System.out.println("Opci�n 2. Tabla de adici�n.");
		System.out.println("Opci�n 3. Tabla de sustracci�n.");
		System.out.println();
	}

	public static void tablamulti(int numero){
		System.out.println("Tabla de multiplicar");
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(numero + " * "+i+" = "+ (numero*i));
		}
		System.out.println();
	}
	public static void tablasuma(int numero){
		System.out.println("Tabla de la adici�n");
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(numero + " + "+i+" = "+ (numero+i));
		}
		System.out.println();
	}
	public static void tablaresta(int numero){
		System.out.println("Tabla de la substracci�n");
		System.out.println();
		for(int i=10;i>=1;i--){
			System.out.println(numero + " - "+i+" = "+ (numero-i));
		}
		System.out.println();
	}
}