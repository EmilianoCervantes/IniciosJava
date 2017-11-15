
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CircularDoubleLinkedList<T> implements List<T>, Deque<T> {

  private Nodo<T> inicio;
  private Nodo<T> fin;

  public CircularDoubleLinkedList(){
    fin = inicio = null;
  }
@Override
public int size() {
  return size(inicio);
}

private int size(Nodo<T> nodo){
  if(isEmpty()){
    return 0;
  }else{
    if(nodo.getSiguiente() != inicio){
      return 1 + size(nodo.getSiguiente());
    }else{
      return 1;
    }
  }
}


@Override
public T get(int index) {

  T d = null;
  if(isEmpty()){
    return d;
  }
  else{
    Nodo<T> aux= inicio;
    if(index<0||index>=size()){
      return null;
    }

    for(int i=0; i<index; i++){
      aux = aux.getSiguiente();
    }
    d=aux.getDato();
    return d;
  }
}


@Override
public T set(int index, T element) {
  if(index<=size()){
    Nodo<T> crawler = inicio;
    for(int i=0;i<index;i++){
      crawler = crawler.getSiguiente();
    }
    Nodo<T> aux1 = crawler;
    crawler.setDato(element);
    return aux1.getDato();
  }else{
    return null;
  }
}


@Override
public void addFirst(T e) {
  // TODO Auto-generated method stub
  if(isEmpty()){
    inicio = fin = new Nodo<T>(e);
    inicio.setSiguiente(inicio);
    inicio.setAnterior(inicio);
  }else{
    Nodo<T> nuevo = new Nodo<T>(e);
    nuevo.setSiguiente(inicio);
    nuevo.setAnterior(fin);
    fin.setSiguiente(nuevo);
    inicio.setAnterior(nuevo);
    inicio = nuevo;
  }
}

@Override
public void addLast(T e) {
  // TODO Auto-generated method stub
  if(isEmpty()){
    addFirst(e);
  }else{
    Nodo<T> nuevo = new Nodo<T>(e);
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
  String salida = "";
  Nodo<T> aux = inicio;
  if(!isEmpty()){
    do{
      salida += " : " + aux.getDato();
      aux = aux.getSiguiente();
    }while(aux != inicio);
  }
  return salida;
}



public int ocurrencias(T e){
  Nodo<T> nodo = new Nodo<T>(e);
  nodo=inicio;
  return ocurrencias(e, nodo);
}

private int ocurrencias(T e, Nodo<T> nodo){
  if(isEmpty()){
    return 0;
  }else{
    if(nodo.getSiguiente() !=inicio){
      if(e == nodo.getDato()){
        return 1 + ocurrencias(e, nodo.getSiguiente());
      }
    }
  }
  return 0;
}

@Override
public int lastIndexOf(Object o) {
  // TODO Auto-generated method stub
  return lastIndexOf(size(),o,fin);
}

private int lastIndexOf(int pos,Object o,Nodo<T> element){
  if(!isEmpty()){
    return 0;
  }else{
    if(element.equals(o)){
      return pos;
    }else{
      return lastIndexOf(pos-1,o,element.getAnterior());
    }
  }
}

public void selectionSort(){
  T minimo = get(0);
  int lug = 0;
  for (int i = 0; i < (size()-1);i++) {
    minimo = get(i);
    for (int j= i+1; j<size(); j++ ) {
      if((((Comparable)get(j)).compareTo(minimo)) < 0){
        minimo = get(j);
        lug=j;
      }
    }
    if ((((Comparable)get(i)).compareTo(minimo)) != 0) {
      T aux = get(i);
      set(i ,minimo);
      set(lug ,aux);
    }
  }
}


/*********************************************************/
public Object[] toArray() {
  if (!isEmpty()) {
    Object[] o = new Object[size()];
    return toArray(size()-1, o, fin);
  }
  return null;
}

private Object[] toArray(int index, Object[] o, Nodo<T> nodo) {
  if (index < 0) {
    return o;
  } else {
    o[index] = nodo.getDato();
    return toArray(index-1, o, nodo.getAnterior());
  }
}

@Override
public boolean contains(Object o) {
  // TODO Auto-generated method stub
  return contains(size()-1, o, fin);
}

private boolean contains(int index, Object o, Nodo<T> nodo){
  if(index < 0){
    return false;
  }
  else{
    if(((Comparable)o).compareTo(nodo.getDato())==0){
      return true;
    }
    else{
      return contains(index-1, 0, nodo.getAnterior());
    }
  }
}

public T getMiddle(){
  return getMiddle(inicio,fin);
}

private T getMiddle(Nodo<T> inicio, Nodo<T>fin){
  if(isEmpty()){
    return null;
  }else{
    if((size()%2)!=0){
      if(inicio!=fin){
        return getMiddle(inicio.getSiguiente(),fin.getAnterior());
      }else{
        return inicio.getDato();
      }
    }else{
      if(inicio.getSiguiente()!=fin){
        return getMiddle(inicio.getSiguiente(),fin.getAnterior());
      }else{
        return inicio.getDato();
      }
    }
  }
}

@Override
public Iterator<T> iterator() {
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

public int indexOf(Object o) {
  T dato=(T) o;
  int a=0;
  return indexOfRecursivo(dato,inicio,a);
}

private int indexOfRecursivo(T dato, Nodo<T> aux,int a){
  if(aux==null)
  throw new NullPointerException();
  else{
    if(aux.getDato() == dato)
    return a;
    else if(dato != inicio.getDato() && aux.getSiguiente()==inicio){
      return -1;
    }else{
      return indexOfRecursivo(dato,aux.getSiguiente(),a+1);
    }
  }
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
