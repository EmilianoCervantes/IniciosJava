public class Peliculas2{
	public static void main(String[] args){
		//Para hacer una nueva clase:
		Pelicula p;
		p = new Pelicula();

		System.out.print("Dime el nombre de la pelicula: ");
		p.nombre = System.console().readLine();
		System.out.print("Dime la duración de la película: ");
		p.duracion = Double.parseDouble(System.console().readLine());
		System.out.print("Dime el género de la película: ");
		p.genero = System.console().readLine();
		System.out.print("Dime la clasificación de la película: ");
		p.clasificacion = System.console().readLine();

		System.out.println("Datos de la película: "+p);
	}

}