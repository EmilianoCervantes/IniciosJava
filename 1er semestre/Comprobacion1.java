public class Comprobacion1 {
	public static void main(String[] args) {
		int i;
		Boolean si;
		i=0;
		System.out.print("¿Quieres seguir ingresando palabraa?: True/False");
		si = Boolean.parseBoolean(System.console().readLine());
		while (si = true){
			i=i+1;
			System.out.println(i);
		System.out.print("¿Quieres seguir ingresando palabraa?: True/False");
		si = Boolean.parseBoolean(System.console().readLine());
		}
	}
}