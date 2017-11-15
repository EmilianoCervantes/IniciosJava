/* Para las tareas se va a pedir un número en el main y luego se va a utilizar para
c/tabla.
*/
public class TareasConFunciones {
	public static void main(String[] args) {
		int n, opcion;
		System.out.print("Dame un número: ");
		n = Integer.parseInt(System.console().readLine());
		opciones();
		System.out.print("¿Qué opción eliges? ");
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
		System.out.println("¿Qué quieres hacer?");
		System.out.println("Opción 1. Tabla de multiplicación.");
		System.out.println("Opción 2. Tabla de adición.");
		System.out.println("Opción 3. Tabla de sustracción.");
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
		System.out.println("Tabla de la adición");
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(numero + " + "+i+" = "+ (numero+i));
		}
		System.out.println();
	}
	public static void tablaresta(int numero){
		System.out.println("Tabla de la substracción");
		System.out.println();
		for(int i=10;i>=1;i--){
			System.out.println(numero + " - "+i+" = "+ (numero-i));
		}
		System.out.println();
	}
}