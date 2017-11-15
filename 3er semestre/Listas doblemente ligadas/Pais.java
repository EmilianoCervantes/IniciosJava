
public class Pais implements Comparable<Pais>{

	private String nombre;
	private String nombreCiudad;
	private double habitantes;
	
	public String toString(){
		return nombre +  " " + nombreCiudad;
	}
	
	public Pais(String nombre, String nombreCiudad, double habitantes) {
		super();
		this.nombre = nombre;
		this.nombreCiudad = nombreCiudad;
		this.habitantes=habitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public void setHabitantes(double habitantes) {
		this.habitantes = habitantes;
	}
	public double getHabitantes() {
		return habitantes;
	}
	
	public int compareTo(Pais a){
		return (int) ((int)habitantes-a.habitantes);
	}
	
}
