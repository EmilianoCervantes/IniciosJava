public class MaquinaDulces {
	public static void main (String[] args) {
		int dulces, dinero1, dinero2, dinero5, cambio;
		String texto;

		System.out.println("Bienvenido a la máquina de dulces");
		System.out.println("Cada dulce cuesta $1");
		System.out.println("Aquí nada más aceptamos monedas de $1, $2 y $5");


		System.out.println("Cuántos dulces quieres?");
		texto = System.console().readLine();
		dulces = Integer.parseInt(texto);
		//tienen que depositar el número de monedas de cada tipo que van a usar
		System.out.println("Deposita tus monedas de 1");
		texto = System.console().readLine();
		dinero1 = Integer.parseInt(texto);
		System.out.println("Deposita tus monedas de 2");
		texto = System.console().readLine();
		dinero2 = Integer.parseInt(texto);
		System.out.println("Deposita tus monedas de 5");
		texto = System.console().readLine();
		dinero5 = Integer.parseInt(texto);
		//El cambio se da del dinero que te sobra de los dulces
		//Es decir dinero-dinero gastado en dulces
		cambio = (dinero1+2*dinero2+5*dinero5)-dulces;

		System.out.print("Te falta dinero :");
		System.out.println(cambio<0);

		System.out.print("El número de dulces que compraste es de " );
		System.out.println(dulces);

		System.out.print("Tu cambio es de :");
		System.out.println(cambio);
	}
}
