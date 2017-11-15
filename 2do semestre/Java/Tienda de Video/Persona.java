public class Persona extends Cliente {
	public String correo;

	public String toString(){
		return super.toString()+" ("+correo+")";
	}
}