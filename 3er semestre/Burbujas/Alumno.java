public class Alumno implements Comparable<Alumno> {
	private int edad;
	private String nombre;

	public Alumno (String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	public String toString() {
		return this.nombre;
	}
	public int compareTo(Alumno a){
		return nombre.compareTo(a.nombre);
	}
	
}
