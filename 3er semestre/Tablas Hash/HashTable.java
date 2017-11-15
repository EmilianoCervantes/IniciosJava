import java.lang.reflect.*;

public class HashTable<K, D>{
	private Dato[] tabla;

	public HashTable(int size){
		//newInstance creo un nuevo arreglo de Object
		tabla = (Dato[]) Array.newInstance(Dato.class, size);
	}

	private int hash(K llave){
		return Math.abs(llave.hashCode());
	}

	public void put(K llave, D dato){
		int indice = hash(llave)%tabla.length;
		// no se puede meter directo el dato
		tabla[indice] = new Dato(llave, dato);
	}

	public D get(K llave){
		int indice = hash(llave)%tabla.length;
		if(tabla[indice]!=null){
			return tabla[indice].dato;
		}
		return null;
	}

	private class Dato{
		K llave;
		D dato;
		public Dato(K k, D d){
			dato = d;
			llave = k;
		}
	}

	public String toString(){
		String r="";
		for(int i=0;i<tabla.length;i++){
			if(tabla[i]==null){
				r+="null";
			}else{
				r+=tabla[i].llave + " " + tabla[i].dato+" ";
			}
		}
		return r;
	}

	public static void main(String[] args){
		/*HashTable<Integer, String> nombres = new HashTable(5);
		nombres.put(45,"Juan");
		nombres.put(7,"Juan 2");
		nombres.put(51,"Juan 3");
		nombres.put(48,"Juan 4");
		nombres.put(99,"Juan 5");
		System.out.println(nombres);

		HashTable<String, Integer>nuevos=new HashTable(5);
		nuevos.put("Juan",45);
		nuevos.put("Donatello",555);
		nuevos.put("Yoda",678);
		nuevos.put("Anakin",33);
		nuevos.put("Rosita Fresita",50);
		System.out.println(nuevos);*/

		Personaje.tipoFuncion = 2;
		HashTable<Personaje, Personaje> nombres = new HashTable(5);
		nombres.put(new Personaje("Andres",13), new Personaje("Andres",77));
		nombres.put(new Personaje("jaws",5), new Personaje("Jaws",90));
		System.out.println(nombres);
	}
}