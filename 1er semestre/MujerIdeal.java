/* Este cuestionario va a ser de la mujer ideal (para mí)
Vamos a evaluar estatura, complexión, color de piel, comics
si es enojona, tierna, dieta, ejercicio, videojuegos, mascotas, películas */

public class MujerIdeal {
	public static void main (String[] args) {
	boolean complexion, dieta, ejercicio, videojuegos, mascotas, peliculas, enojona, tierna, maquillaje, comics, manga;
	double estatura;
	int autoestima;

	System.out.println("Bienvenida, veremos si eres mi mujer ideal");

		System.out.print("¿Cuánto mides?: ");
		estatura = Double.parseDouble(System.console().readLine());

		System.out.print("¿Comes de todo o no eres quisquillosa al comer? True/False: ");
		dieta = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Haces ejercicio? True/False: ");
		ejercicio = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Eres delgada? True/False: ");
		complexion = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Juegas videojuegos? True/False: ");
		videojuegos = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te gustan los perros? True/False: ");
		mascotas = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te gustan las películas? True/False: ");
		peliculas = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te gustan los comics? True/False: ");
		comics = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te consideras enojona? True/False: ");
		enojona = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Usas mucho o bastante maquillaje? True/False: ");
		maquillaje = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te gusta el manga o el anime? True/False: ");
		manga = Boolean.parseBoolean(System.console().readLine());

		System.out.print("¿Te consideras tierna? True/False: ");
		tierna = Boolean.parseBoolean(System.console().readLine());

		System.out.print("Del 1 al 10, ¿qué tan bella te consideras?: ");
		autoestima = Integer.parseInt(System.console().readLine());

		if((estatura>=1.50) & dieta & (complexion | ejercicio)
			& mascotas & (videojuegos | comics | manga) & peliculas & (autoestima>5) & (!enojona | tierna) | (maquillaje)){
			System.out.println("Eres mi clase de chica");
		}
		else {
		System.out.println("No eres mi tipo");
		}
	}
}