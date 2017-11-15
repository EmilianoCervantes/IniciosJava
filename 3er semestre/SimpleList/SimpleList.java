import java.util.*;

public class SimpleList<T> implements List<T>, Deque<T> {

	private Nodo<T> inicio;

	//Constructor 1
	public SimpleList(){
		inicio = null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return inicio == null;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(T e) {
		addLast(e);
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public T get(int index) {
		T d = null;
		return d;
	}

	@Override
	public T set(int index, T element) {
		return null;
	}

	@Override
	public void add(int index, T element) {
		Nodo crawler=inicio;
		for(int i=0;i<index;i++){
			crawler=crawler.getSiguiente();
		}
		Nodo nuevo= new  Nodo(element);
		nuevo.setSiguiente(crawler.getSiguiente());
		crawler=nuevo;
	}

	@Override
	public T remove(int index) {
		Nodo crawler=inicio;
		Nodo crawler2=null;
		Nodo<T> aux=null;
		if(isEmpty()){
			return null;
		}else if(index==0){
			removeFirst();
		}else{
			for(int i=0;i<index-1;i++) {
				crawler=crawler.getSiguiente();
			}
			aux = crawler.getSiguiente();
			crawler2=crawler.getSiguiente().getSiguiente();

			if(crawler2!=null){
				crawler.setSiguiente(crawler2);
			}
		}
		return aux.getDato();
	}//Emiliano

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public void addFirst(T e) {
		if(isEmpty()){
			inicio = new Nodo(e);
		}else{
			Nodo nuevo = new Nodo(e);
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}

	@Override
	public void addLast(T e) {
		Nodo crawler=inicio;
		while(crawler!=null){
			crawler=crawler.getSiguiente();
		}
		Nodo nuevo= new  Nodo(e);
		crawler=nuevo;
		nuevo.setSiguiente(null);
	}

	@Override
	public String toString(){
		String salida = "";

		Nodo crawler = inicio;
		while(crawler !=null){
			salida+=crawler.getDato() +" : ";
			crawler=crawler.getSiguiente();
		}
		return salida;
	}

	@Override
	public boolean offerFirst(T e) {
		return false;
	}

	@Override
	public boolean offerLast(T e) {
		return false;
	}

	@Override
	public T removeFirst() {
		return null;
	}

	@Override
	public T removeLast() {
		if(isEmpty()){
			return null;
		}else{
			Nodo<T> aux1=inicio, aux2=null;
			while(aux1.getSiguiente()!=null){
				aux2=aux1;
				aux1=aux1.getSiguiente();
			}
			if(aux2==null){
				inicio=null;
			}else{
				aux2.setSiguiente(null);
			}
			return aux1.getDato();
		}
	}

	@Override
	public T pollFirst() {
		return null;
	}

	@Override
	public T pollLast() {
		return null;
	}

	@Override
	public T getFirst() {
		return null;
	}

	@Override
	public T getLast() {
		return null;
	}

	@Override
	public T peekFirst() {
		return null;
	}

	@Override
	public T peekLast() {
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		return false;
	}

	@Override
	public boolean offer(T e) {
		return false;
	}

	@Override
	public T remove() {
		return null;
	}

	@Override
	public T poll() {
		return null;
	}

	@Override
	public T element() {
		return null;
	}

	@Override
	public T peek() {
		return null;
	}

	@Override
	public void push(T e) {
	}

	@Override
	public T pop() {
		return null;
	}

	@Override
	public Iterator<T> descendingIterator() {
		return null;
	}
}