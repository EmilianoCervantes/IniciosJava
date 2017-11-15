//Este es el archivo que lee Peliculas2
public class Pelicula{
	public String nombre;
	public double duracion;
	public String genero;
	public String clasificacion;

	public String toString() {
		String texto;
		texto = "Nombre: "+nombre+ "\tDuración: "+duracion+
			"\tGenero: "+genero+"\tClasif: "+clasificacion;

		return texto;
	}
}