/*Para el Directrio Electrónico hay que pedir nombre, dirección,
	tel. y E-mail. Primero pedimos los datos y luego los vamos ordenando.
	Hay que poder agregar, borrar, modificar y consultar.
	¿Cómo borrar y modificar?
	¿Cómo lograr que nunca acabe? Y si no acaba, ¿cómo detenerlo?
	Habrá que ordenarlos en lista o como tabla, en línea, etc.
*/
public class DirElectronico{
	public static void main(String[] args){
		//lo que busco es ejecutar opcion, menú y acción las veces necesarias
		String[][] contactos;
		int op, contContactos;

		contactos = new String[1000][4];
		contContactos=0;
		//1er nivel para numero de contactos, 2do para datos por contacto
		do{
			mostrarMenu();
			op= elegirOpcion();
			contContactos = ejecutarAccion(op, contContactos, contactos);
		}while(op!=5);
	}

	public static void mostrarMenu() {
		System.out.println("1. Agregar contacto");
		System.out.println("2. Borrar contacto");
		System.out.println("3. Modificar contacto");
		System.out.println("4. Consultar contacto");
		System.out.println("5. Salir");
		System.out.println();
	}

	public static int elegirOpcion() {
		int opcion;
		do {
			System.out.print("\tOpción: ");
			opcion = Integer.parseInt(System.console().readLine());
			if(opcion < 1 | opcion > 5)
				System.out.println("Opción inválida");
		}while(opcion < 1 | opcion > 5);
		System.out.println();
		return opcion;
		//Siempre que una función me regresa un valor, necesito el return
		//para saber qué valor me regresa
	}

	public static int ejecutarAccion(int opcion, int pos, String[][] datos) {
		//c/funcion independiente
		int noContacto;
		switch(opcion) {
			case 1://Agregar contacto
			agregarContacto(pos, datos);
				pos++;
				break;
			case 2://Borrar contacto
				System.out.print("Numero de contacto: ");
				noContacto= Integer.parseInt(System.console().readLine());
				borrarContacto(noContacto-1, pos, datos);
				break;
			case 3://Modificar contacto
				System.out.print("Numero de contacto: ");
				noContacto= Integer.parseInt(System.console().readLine());
				modificarContacto(noContacto-1, datos);
				break;
			case 4://Consultar contacto
				System.out.print("Numero de contacto: ");
				noContacto = Integer.parseInt(System.console().readLine());
				mostrarContacto(noContacto-1, datos);
				break;
			case 5://Salir
				System.out.println("Hasta luego :)");
				break;

		}
		return pos;
	}

	public static void agregarContacto(int posicion, String[][] datos) {
	//posicion se va a pasar con contContactos
		String nombre, direccion, telefono, email;
		//1. Leer el nombre,  tel, dir, E-mail
		System.out.print("Nombre: ");
		nombre = System.console().readLine();
		System.out.print("Dirección: ");
		direccion = System.console().readLine();
		System.out.print("Teléfono: ");
		telefono = System.console().readLine();
		System.out.print("E-mail: ");
		email = System.console().readLine();
		System.out.println();
		//2. Almacenar datos
		datos[posicion][0] = nombre;
		datos[posicion][1] = direccion;
		datos[posicion][2] = telefono;
		datos[posicion][3] = email;
	}

	public static String[] leerContacto() {
		//para modificar contactos y para mostrarlos hacemos básicamente lo mismo
		//así que lo escribimos mejor sólo una vez

		//1. Leer nombre, direccion, telefono, email
		String[] datos = new String[4];
		System.out.print("Nombre: ");
		datos[0] = System.console().readLine();
		System.out.print("Direccion: ");
		datos[1] = System.console().readLine();
		System.out.print("Telefono: ");
		datos[2] = System.console().readLine();
		System.out.print("Email: ");
		datos[3] = System.console().readLine();
		return datos;
	}

	public static void modificarContacto(int posicion, String[][] datos) {
		mostrarContacto(posicion, datos);
		datos[posicion] = leerContacto();
	}

	public static void mostrarContacto(int posicion, String[][] datos) {
		System.out.println("Datos del contacto " + (posicion+1));
		System.out.println("Nombre: " + datos[posicion][0]);
		System.out.println("Direccion: " + datos[posicion][1]);
		System.out.println("Telefono: " + datos[posicion][2]);
		System.out.println("Email: " + datos[posicion][3]);
		System.out.println();
	}

	public static void borrarContacto(int pos,int total, String[][] datos) {
		//1. obtener datos del ultimo contacto
		//2. conpiarlos al lugar del contacto que se va a borrar
		datos[pos][0]=datos[total][0];
		datos[pos][1]=datos[total][1];
		datos[pos][2]=datos[total][2];
		datos[pos][3]=datos[total][3];
		//3. Eliminar el último ocntacto
		datos[total][0]= null;
		datos[total][1]= null;
		datos[total][2]= null;
		datos[total][3]= null;

		System.out.println("El contacto "+(pos+1)+" ha sido eliminado.");
	}
}