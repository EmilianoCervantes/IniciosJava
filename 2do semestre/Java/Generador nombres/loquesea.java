public class loquesea implements IGeneradorNombres{
	
	public String generarNombre(Persona p) {
	String nombre;
	nombre = p.apellidoPaterno.substring(0,3) + p.nombre.substring(0,2) +p.apellidoMaterno.substring(0,2) + p.ciudad.substring(0,3);
	return nombre;
	}
	
}