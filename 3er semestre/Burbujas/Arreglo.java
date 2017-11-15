public class Arreglo<T> {
	private T arreglo [];

	public Arreglo(int tamno){
		arreglo = ((T[]) new Object [tamno]);
	}

	public void agrega(int i, T dato){
		arreglo[i]=dato;
	}

	public int buscaSecuencial (T buscado) {
		for (int i = 0; i<arreglo.length; i++) {
			if (((Comparable)buscado).compareTo(arreglo[i])==0){

				return i;
			}
		}

		return -1;
	}

	public void ordenarBurbuja(){
		boolean swapped=false;
		do {
			swapped = false;
			for (int i = 0; i<arreglo.length-1; i++) {
				if (((Comparable)arreglo[i]).compareTo(arreglo[i+1]) > 0) {
					T buffer = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = buffer;
					swapped = true;

				}
			}
		} while (swapped);
	}

	public String toString(){
		String cadena="";
		for(int i=0;i<arreglo.length;i++){
			cadena+=arreglo[i]+"\n";
		}
		return cadena;
	}

	public int cuentaElementos(){
		return cuentaElementos(0);
	}

	private int cuentaElementos(int pos){
		if(pos == arreglo.length){
			return cuentaElementos(0);
		}
		else{
			return cuentaElementos(pos+1)+1;
		}
	}

	public boolean removeFirstOcurrence(T buscado){
		return removeFirstOcurrence(0, buscado);
	}

	public boolean removeFirstOcurrence(int pos, T buscado){
		if(pos == arreglo.length){
			return false;
		}else if (((Comparable)buscado).compareTo(arreglo[pos])==0){
			arreglo[pos]=(T) "";
			return true;
		}else{
			return removeFirstOcurrence(pos+1, buscado);
		}
	}
}