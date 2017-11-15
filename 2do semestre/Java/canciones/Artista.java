import java.io.Serializable;

public class Artista implements Serializable{
	public String nombre, nacionalidad;
	public int edad;
	public boolean solista;

	@Override //Permite saber que métodos se están sobre-escribiendo
	public String toString(){
		return nombre + " - " + (solista ? "Solista"  : "Grupos");
		//Signo de interrogación y dos puntos: operador ternario, es como un if
	}
}
