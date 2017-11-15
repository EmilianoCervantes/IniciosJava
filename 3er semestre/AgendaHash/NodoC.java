public class NodoC<T>{
	
	private T dato;
	private NodoC<T> siguiente;
	private NodoC<T> anterior;

	public NodoC(T dato){
		this.dato = dato;
		anterior = siguiente = null;
	}

	public NodoC(T dato, NodoC<T> siguiente, NodoC<T> anterior){
		this.dato = dato;
		this.siguiente = siguiente;	
		this.anterior = anterior;
	}

	public T getDato(){
		return dato;
	}

	public void setDato(T dato){
		this.dato = dato;
	}

	public NodoC<T> getSiguiente(){
		return siguiente;
	}

	public void setSiguiente( NodoC<T> s){
		this.siguiente = s;
	}

	public NodoC<T> getAnterior(){
		return anterior;
	}

	public void setAnterior( NodoC<T> a){
		this.anterior = a;
	}
}