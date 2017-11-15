public class Filas<T> implements Interface<T>{
	private int ultimo;
	private T arreglo [];

	public Filas(int size){
		this.arreglo=(T[])new Object[size];
		ultimo = -1;
	}

	public T first(){
		if(!isEmpty()){
			return arreglo[0];
		}else{
			return null;
		}
	}

	public T last(){
		if(!isEmpty()){
			return arreglo[ultimo];
		}else{
			return null;
		}
	}

	public boolean isFull(){
		if(ultimo==arreglo.length-1){
			return true;
		}else{
			return false;
		}
	}

	public boolean isEmpty(){
		return ultimo==-1;
	}

	public T dequeue(){
		if(!isEmpty()){
			T temporal=arreglo[0];
			for(int i=0;i<ultimo;i++){
				arreglo[i]=arreglo[i+1];
			} ultimo--;
			return temporal;
		}else{ return null; }
	}

	public String toString(){
		if(!isEmpty())
			return "";
		else{
			String pozole="";
			for(int i=0;i<ultimo;i++){
				pozole = arreglo[i].toString();
			}
			return pozole;}
	}

	public void enqueue(T e) {
		if(isFull()){}
		else{
			ultimo++;
			arreglo[ultimo]=e;
		}
	}

	public T randomDequeue( ){
		if(!isEmpty()){
			int random=((int)(Math.random()*9));
			T temporal=arreglo[random];
			for(int i=random;i<ultimo;i++){
				arreglo[i]=arreglo[i+1];
			} ultimo--;
			return temporal;
		}else{
			return null;
		}
	}

	public T priorityDequeue(){
		if(!isEmpty()){
			int n=0;
			//arreglo[n] --> el "buscado"
			for(int i=0;i<ultimo;i++){
				if (((Comparable)arreglo[n]).compareTo(arreglo[i+1])>0){
					n=i+1;
				}
			}
			T temporal=arreglo[n];
			for(int i=n;i<ultimo;i++){
				arreglo[i]=arreglo[i+1];
			}
			ultimo--;
			return arreglo[n];
		}else{
			return null;
		}
	}
}