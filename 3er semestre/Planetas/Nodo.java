public class Nodo<T> implements Comparable<T>{

	private T dato;
	private Nodo<T> izquierdo;
	private Nodo<T> derecho;

	public Nodo(T dato){
		this.dato = dato;
		izquierdo = derecho = null;
	}

	public Nodo(T dato, Nodo<T> siguiente, Nodo<T> anterior){
		this.dato = dato;
		this.izquierdo = izquierdo;
		this.derecho = derecho;
	}

	public T getDato(){
		return dato;
	}

	public void setDato(T dato){
		this.dato = dato;
	}

	public Nodo<T> getDerecho(){
		return derecho;
	}

	public void setDerecho( Nodo<T> derecho){
		this.derecho = derecho;
	}

	public Nodo<T> getIzquierdo(){
		return izquierdo;
	}

	public void setIzquierdo( Nodo<T> izquierdo){
		this.izquierdo = izquierdo;
	}

	@Override
	public int compareTo(T o) {
		return ((Comparable)o).compareTo(dato);
	}
}