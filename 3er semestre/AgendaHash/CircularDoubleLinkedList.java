
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CircularDoubleLinkedList<T> implements List<T>, Deque<T> {

	private NodoC<T> inicio;
	private NodoC<T> fin;

	public CircularDoubleLinkedList(){
		fin = inicio = null;
	}


/*****************PRACTICA:  01************************/

	@Override
	public T get(int index) {
		if(index < 0 || index >= size()){

		 throw new IndexOutOfBoundsException();

		 } return get (index, inicio);
	 }
	 public T get(int index, NodoC n){

		 if (index==0){

		 return (T)n.getDato();

		 }else{

		 return get(index-1, n.getSiguiente());

		 }

		}


	@Override
	public T set(int index, T element){
		return (!isEmpty() && index < size() && index>=0) ? set(inicio, index, element) : null;

	}

	private T set(NodoC NodoC, int index, T element){
	   if(NodoC.getSiguiente() != inicio && index > 0){
	       return set(NodoC.getSiguiente(), index-1, element);
	    }else{
	        T d = (T)NodoC.getDato();
	        NodoC.setDato(element);
	        return d;
	    }
	}

	public void selectionSort(){
		int i=0, j=0;
		NodoC <T> crawler = inicio;
		NodoC <T> crawler2 = inicio;
		while(crawler.getSiguiente() != inicio){
			while(crawler2.getSiguiente() != inicio){
				crawler2 = crawler2.getSiguiente();
				if(((Comparable)crawler.getDato()).compareTo(crawler2.getDato())>0){
					T temp = crawler.getDato();
					crawler.setDato(crawler2.getDato());
					crawler2.setDato(temp);
				}
				j++;
			}
			crawler = crawler.getSiguiente();
			i++;
		}
	}

	public void insertionSort(){
		int i, j;
		T aux;
		NodoC <T> crawler = inicio;
		NodoC <T> crawler2 = fin;
		while(crawler.getSiguiente() != inicio){
		aux = crawler.getDato();
			while(((Comparable)aux).compareTo(crawler2.getDato())<0){
			// desplazar elementos para hacer espacio
				crawler2.setDato(crawler2.getAnterior().getDato());
				crawler2=crawler2.getAnterior();
			}
			crawler2.setDato(aux);
			crawler = crawler.getSiguiente();
 		}
	}

/*********************************************************/



	@Override
	public int size() {
		return size(inicio);
	}

	private int size(NodoC<T> NodoC){
		if(isEmpty()){
			return 0;
		}else{
			if(NodoC.getSiguiente() != inicio){
				return 1 + size(NodoC.getSiguiente());
			}else{
				return 1;
			}
		}
	}


	@Override
	public void addFirst(T e) {
			// TODO Auto-generated method stub
		if(isEmpty()){
			inicio = fin  = new NodoC(e);
			inicio.setSiguiente(inicio);
			inicio.setAnterior(inicio);
		}else{
			NodoC<T> nuevo = new NodoC(e); //1
			nuevo.setSiguiente(inicio); //2
			nuevo.setAnterior(fin);//3
			fin.setSiguiente(nuevo); //4
			inicio.setAnterior(nuevo); //5
			inicio = nuevo;
		}

	}

	@Override
	public void addLast(T e) {
			// TODO Auto-generated method stub
		 if(isEmpty()){
			addFirst(e);
		}else{
			NodoC<T> nuevo = new NodoC(e);
			nuevo.setAnterior(fin);
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}


	@Override
	public boolean isEmpty() {
			// TODO Auto-generated method stub
			return inicio == null&& fin==null;
	}

	@Override
	public String toString(){
			if(!isEmpty()){
				String salida = "";
				int z=0;
				NodoC<T> aux = inicio;
				if(!isEmpty()){
					do{
						salida += " : " + aux.getDato();
						aux = aux.getSiguiente();
						z=z+1;
						System.out.println(z);
					}while(aux != inicio);
				}
				return salida;
			}return null;
	}





/*********************************************************/


	@Override
	public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public boolean add(T e) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public void clear() {
			// TODO Auto-generated method stub
		   inicio = fin = null;
	}


	@Override
	public void add(int index, T element) {
			// TODO Auto-generated method stub

	}

	@Override
	public T remove(int index) {
			T da = null;

			return da;
	}

	@Override
	public int indexOf(Object o) {
			// TODO Auto-generated method stub
			int posicion = -1;

			return posicion;
	}

	@Override
	public int lastIndexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
	}


	@Override
	public boolean offerFirst(T e) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean offerLast(T e) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public T removeFirst() {
		return null;

	}

	@Override
	public T removeLast() {
			// TODO Auto-generated method stub

			return null;
	}

	@Override
	public T pollFirst() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T pollLast() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T getFirst() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T getLast() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T peekFirst() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T peekLast() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean offer(T e) {
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public T remove() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T poll() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T element() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public T peek() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public void push(T e) {
			// TODO Auto-generated method stub

	}

	@Override
	public T pop() {
			// TODO Auto-generated method stub
			return null;
	}

	@Override
	public Iterator<T> descendingIterator() {
			// TODO Auto-generated method stub
			return null;
	}

   public T getTemporal(int index) {
		if(inicio != null){
			NodoC<T> aux = inicio;
		int y = 0;
		if (index < 0 || index > size() - 1) {
			throw new IndexOutOfBoundsException("TE PASASTE DE LO QUE REALMENTE TIENES D=");
		}
		while (y < index) {
			y++;
			aux = aux.getSiguiente();
		}
		return aux.getDato();
		}else{
			return null;
		}
    }
 }