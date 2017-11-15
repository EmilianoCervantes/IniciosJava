package edu.itesm.mx.proyecto;
public class NodoABB<T> implements Comparable<T>{
	
	private NodoABB<T> izquierdo;
	private NodoABB<T> derecho;
	private T dato;
	
	public NodoABB( T dato){
		this.dato = dato;
		izquierdo = derecho = null;
	}
	public NodoABB<T> getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(NodoABB<T> izquierdo) {
		this.izquierdo = izquierdo;
	}
	public NodoABB<T> getDerecho() {
		return derecho;
	}
	public void setDerecho(NodoABB<T> derecho) {
		this.derecho = derecho;
	}
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	@Override
	public int compareTo(T o) {
		return ((Comparable)o).compareTo(dato);
	}
}