
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
 
public class DoubleLinkedList<T> implements List<T>, Deque<T> {
 
        private Nodo<T> inicio;
        private Nodo<T> fin;

        public DoubleLinkedList(){
            fin = inicio = null;
        }


/*********************************************************/

        @Override
        public int size() {
			if(isEmpty()){
				return -1;
			}else{
				Nodo<T> crawler = inicio;
				int tamaño = 0;
				while(crawler.getSiguiente() != null){
					tamaño++;
					crawler = crawler.getSiguiente();
				}
				return tamaño;
			}
        }

           @Override
        public T get(int index) {
			if(index < 0 || index>(size()-1)){
				return null;
			}else{
				Nodo<T> nodo = inicio;
				for(int i = 0; i < index; i++){
					nodo.getSiguiente();
				}
				return nodo.getDato();
            }
		}


        @Override
        public T set(int index, T element) {
			if(index < 0 || (index>size()-1)){
				throw new IndexOutOfBoundsException("Indice erróneo");
			}else{
				Nodo<T> nuevo = new Nodo(element);
				Nodo aux1 = inicio;
				Nodo aux2 = null;
				for(int i = 0; i < index; i++){
					aux2 = aux1;
					aux1 = aux1.getSiguiente();
				}
				aux1.setAnterior(nuevo);
				aux2.setSiguiente(nuevo);
				nuevo.setAnterior(aux2);
				nuevo.setSiguiente(aux1);
				return nuevo.getDato();
			}
        }


        @Override
        public void addFirst(T e) {
            if(isEmpty()){
                inicio = fin  = new Nodo(e);
            }
            else{
				Nodo<T> nuevo = new Nodo(e);
				nuevo.setSiguiente(inicio);
				inicio.setAnterior(nuevo);
				inicio = nuevo;
			}

        }

        @Override
        public void addLast(T e) {
             if(isEmpty()){
                addFirst(e);
            }
            else{
				Nodo<T> nuevo = new Nodo(e);
				nuevo.setAnterior(fin);
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
                String salida = "";
                Nodo<T> aux = inicio;
                while(aux != null){
                    salida += " : " + aux.getDato();
                    aux = aux.getSiguiente();
                }

                return salida;
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
 

    }