public class MiClase2 {
	public static void main (String[] args) {
	String nombre;

	//Pedir el nombre
	System.out.println("¿Cuál es tu nombre?");
	nombre = System.console().readLine();

	//Saludar a la persona
	System.out.print("Hola ");
	System.out.println(nombre);
	}
}