import java.lang.reflect.Array;


public class HashTable <K,D>{
	private Dato[]tabla;
	public HashTable(int size){
		tabla= (Dato[])Array.newInstance(Dato.class, size);
	}
	private int hash (K llave){
		return Math.abs(llave.hashCode());
	}
	public void put(K llave, D dato){
		int indice= hash(llave)%tabla.length;
		tabla[indice]= new Dato(llave, dato);	
	}
	public D get(K llave){
		int indice= hash(llave)%tabla.length;
		if(tabla[indice]==null){return null;}else{
		return  tabla[indice].dato;}
	}
	public String toString(){
		String hola="";
		for(int i=0;i<tabla.length;i++){
			if(tabla[i]==null){
			}else{
				 hola +=  ""+tabla[i].dato+", ";
			}
			
		}
		 return hola;
	}
	public CircularDoubleLinkedList<K> keys(){
		CircularDoubleLinkedList<K> listas= new CircularDoubleLinkedList<K>();
		for(int i=0;i<tabla.length;i++){
			listas.addLast(tabla[i].llave);
		}
		return listas;
	}


	public void eliminar(K llave){
		int l= hash(llave) % tabla.length;
		tabla[l]=null;
	}
	private class Dato  {
		K llave;
		D dato;
		public Dato (K k, D d){
			dato=d;
			llave = k;
		}
	}
	
}
