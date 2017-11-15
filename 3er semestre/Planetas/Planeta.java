public class Planeta<T>{
	private T dato;
	String nombre;//5 letras
	int edad;//entre mil y 10mil años

	Planeta(String nom, int ed){
		this.nombre = nom;
		this.edad = ed;
	}

	public T get(){
		return dato;
	}

	public void set(T dato){
		this.dato=dato;
	}

	@Override
	public String toString(){
		return "El nombre es "+nombre+" y la edad es "+edad;
	}

	public int compareTo(Planeta o){
		return Integer.compare(edad, o.edad);
	}
}