public class Peliculas2{
	public static void main(String[] args){
		//Para hacer una nueva clase:
		Pelicula p;
		p = new Pelicula();

		System.out.print("Dime el nombre de la pelicula: ");
		p.nombre = System.console().readLine();
		System.out.print("Dime la duraci�n de la pel�cula: ");
		p.duracion = Double.parseDouble(System.console().readLine());
		System.out.print("Dime el g�nero de la pel�cula: ");
		p.genero = System.console().readLine();
		System.out.print("Dime la clasificaci�n de la pel�cula: ");
		p.clasificacion = System.console().readLine();

		System.out.println("Datos de la pel�cula: "+p);
	}

}