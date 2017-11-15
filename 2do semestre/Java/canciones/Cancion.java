import java.io.Serializable;

public class Cancion implements Serializable{
	String nombre, genero;
	double duracion;
	boolean ftArtista;

	@Override
	public String toString(){
		return nombre+" - "+duracion;
	}
}