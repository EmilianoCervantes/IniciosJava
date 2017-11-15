public class ABB<T> implements Comparable<ABB>{
	private NodoArboles<T> raiz;

	public ABB(){
		raiz = null;
	}

	public boolean isEmpty(){
		return raiz == null;
	}


	public void insert(T dato){
		if(isEmpty()){
			raiz = new NodoArboles(dato);
		}else{
			insert(raiz, dato);
		}
	}

	private void insert(NodoArboles<T> nodo, T dato){
		if(nodo.compareTo(dato) == 0){
			//no hace nada
		}else if(nodo.compareTo(dato) < 0){
			if(nodo.getIzquierdo() == null){
				NodoArboles n = new NodoArboles(dato);
				nodo.setIzquierdo(n);
			}
			else{
				insert(nodo.getIzquierdo(), dato);
			}
		}
		else{
			if(nodo.getDerecho() == null){
				NodoArboles n = new NodoArboles(dato);
				nodo.setDerecho(n);
				return;
			}
			else{
				insert(nodo.getDerecho(), dato);
			}
		}
	}

	public int cuentaNodos(){
		if(isEmpty()){
			return 0;
		}else{
			int tamanno=0;
			return cuentaNodos(raiz,tamanno);
		}
	}

	private int cuentaNodos(NodoArboles<T> nodo, int tamanno){
		if(nodo != null){
			tamanno++;
			cuentaNodos(nodo.getIzquierdo(),tamanno);

			cuentaNodos(nodo.getDerecho(),tamanno);
		}
		return tamanno;
	}

	public String inOrder(){

	 String dato = "";
		return inOrder(raiz,dato);
	}

	private String inOrder(NodoArboles<T> nodo, String dato){
		if(nodo != null){
			inOrder(nodo.getIzquierdo(),dato);
			dato += nodo.getDato() + "\n";
			inOrder(nodo.getDerecho(),dato);
		}
		return dato;
	}



	public boolean completo(){
		return completo(raiz);
	}

	private boolean completo(NodoArboles<T> nodo){
		if(nodo != null){
			if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
				return true;
			}else{
				if ((nodo.getIzquierdo() != null && nodo.getDerecho() == null) || (nodo.getIzquierdo() == null && nodo.getDerecho() != null)) {

					return false;
				}else{
					return (completo(nodo.getIzquierdo()))&&(completo(nodo.getDerecho()));
				}
			}
		}
		return false;
	}

	public String toString(){
		return  "\n"+ "Sistema Solar:" + "\n" + inOrder() ;
	}

	public int compareTo(ABB abb){
		return ((Comparable)cuentaNodos()).compareTo(abb.cuentaNodos());
	}

}
