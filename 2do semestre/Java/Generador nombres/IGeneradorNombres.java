public interface IGeneradorNombres{
	String generarNombre(Persona p);
}

class Persona {
	public String nombre, apellidoPaterno, apellidoMaterno, ciudad;

	public String toString() {
		return nombre + " " + apellidoPaterno + " " + apellidoMaterno + " (" + ciudad + ")";
	}
}