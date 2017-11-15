package edu.itesm.mx.proyecto;
import javax.swing.DefaultListModel;

public class ABB <T> implements Comparable<ABB> {

	private NodoABB<T> raiz;

	public ABB(){
		raiz = null;
	}

	public void insert(T dato){
		if(isEmpty()){
			raiz = new NodoABB(dato);
		}else{
			insert(raiz, dato);
		}
	}

	private void insert(NodoABB<T> nodo, T dato){
		if(nodo.compareTo(dato) != 0){
			if(nodo.compareTo(dato) < 0){
				if(nodo.getIzquierdo() == null){
					nodo.setIzquierdo(new NodoABB(dato));
				}else{
					insert(nodo.getIzquierdo(), dato);
				}
			}else if(nodo.compareTo(dato) > 0){
				if(nodo.getDerecho() == null){
					nodo.setDerecho(new NodoABB(dato));
				}else{
					insert(nodo.getDerecho(), dato);
				}
			}
		}

	}

	public void preOrden(){
		preOrden(raiz);
	}

	private void preOrden(NodoABB<T> nodo){
		if(nodo != null){
			System.out.println(nodo.getDato());
			preOrden(nodo.getIzquierdo());
			preOrden(nodo.getDerecho());
		}

	}
	public DefaultListModel inOrden(DefaultListModel m){
		return inOrden(raiz,m);
	}

	private DefaultListModel inOrden(NodoABB<T> nodo,DefaultListModel m){
		if(nodo != null){
			inOrden(nodo.getIzquierdo());
			m.addElement(nodo.getDato());
			inOrden(nodo.getDerecho());
		}
		return m;
	}
	public void inOrden(){
		inOrden(raiz);
	}

	private void inOrden(NodoABB<T> nodo){
		if(nodo != null){
			inOrden(nodo.getIzquierdo());
			System.out.println(nodo.getDato());
			inOrden(nodo.getDerecho());
		}
	}

	public void postOrden(){
		postOrden(raiz);
	}

	private void postOrden(NodoABB<T> nodo){
		if(nodo != null){
			postOrden(nodo.getIzquierdo());
			postOrden(nodo.getDerecho());
			System.out.println(nodo.getDato());
		}
	}

	public int cuentaNodos(){
		return cuentaNodos(raiz);
	}

	private int cuentaNodos(NodoABB<T> nodo){
		return nodo == null ? 0 : cuentaNodos(nodo.getIzquierdo()) + cuentaNodos(nodo.getDerecho()) + 1;
	}

	public boolean isEmpty(){
		return raiz == null;
	}


	private String toString( NodoABB<T> nodo ){
		if(nodo != null){
			return  nodo.getDato().toString() + " : "  +  
					toString(nodo.getIzquierdo()) + " : " + 
					toString(nodo.getDerecho());
		}
		return "";
	}

	public String toString(){

		return toString(raiz);
	}

	public boolean esCompleto(){
		return esCompleto(raiz);	
	}

	private boolean esCompleto(NodoABB<T> nodo){
		if(nodo != null){
			if((nodo.getIzquierdo() == null && nodo.getDerecho() == null)){
				return true;
			}else{
				return nodo.getIzquierdo() != null && nodo.getDerecho() != null ? esCompleto(nodo.getDerecho()) && esCompleto(nodo.getIzquierdo()) : false;
			}
		}
		return false;
	}

	public int compareTo(ABB arbol){
		return ((Integer) this.cuentaNodos()).compareTo((Integer) arbol.cuentaNodos());
	}
}