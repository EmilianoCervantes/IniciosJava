public class ABB <T>{
	
	private Nodo<T> raiz;
	
	public ABB(){
		raiz = null;
	}
	
	public void insert(T dato){
		if(isEmpty()){
			raiz = new Nodo(dato);
		}else{
			insert(raiz, dato);
		}
	}
	
	private void insert(Nodo<T> nodo, T dato){
		if(nodo.compareTo(dato) != 0){
			if(nodo.compareTo(dato) < 0){
				if(nodo.getIzquierdo() == null){
					nodo.setIzquierdo(new Nodo(dato));
				}else{
					insert(nodo.getIzquierdo(), dato);
				}
			}else{
				if(nodo.getDerecho() == null){
					nodo.setDerecho(new Nodo(dato));
				}else{
					insert(nodo.getDerecho(), dato);
				}
			}
		}
		
	}
	
	public void preOrden(){
		preOrden(raiz);
	}
	
	private void preOrden(Nodo<T> nodo){
		if(nodo != null){
			System.out.println(nodo.getDato());
			preOrden(nodo.getIzquierdo());
			preOrden(nodo.getDerecho());
		}
		
	}
	
	public void inOrden(){
		inOrden(raiz);
	}
	
	private void inOrden(Nodo<T> nodo){
		if(nodo != null){
			inOrden(nodo.getIzquierdo());
			System.out.println(nodo.getDato());
			inOrden(nodo.getDerecho());
		}
	}
	
	public void postOrden(){
		postOrden(raiz);
	}
	
	private void postOrden(Nodo<T> nodo){
		if(nodo != null){
			postOrden(nodo.getIzquierdo());
			postOrden(nodo.getDerecho());
			System.out.println(nodo.getDato());
		}
	}
	
	public boolean isEmpty(){
		return raiz == null;
	}
	
	public static void main(String[] args){
		ABB<Integer> arbol = new ABB<Integer>();
		
		for(int i = 0; i < 10; i++){
			int num = (int)(Math.random() * 100 );
			System.out.println(num);
			arbol.insert(num);
		}
		System.out.println("===============");
		arbol.inOrden();
		System.out.println("===============");
		arbol.postOrden();
		System.out.println("===============");
		arbol.preOrden();
		
	}
	
}