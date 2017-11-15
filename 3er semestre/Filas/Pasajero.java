public class Pasajero implements Comparable <Pasajero>{
	int edad;
	public Pasajero(int e){
		this.edad=e;
	}
	public int compareTo(Pasajero a){
		return edad.compareTo(a.edad);
	}

	public String toString(){
		return "Edad: "+edad;
	}
}