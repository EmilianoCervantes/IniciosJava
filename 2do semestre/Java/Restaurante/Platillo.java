//Llamado por Restaurante
public class Platillo {
	public Ingredientes[] ingredientes;
	public double costo;
	public String nombre, termino;
	public int costoT=0;

	/*Método constuctor - Cuando hay una relación de composición,
	  cada vez que hago un nuevo platillo:*/
	public Platillo() {
		//Fijo que hay hasta 15 ingredientes por platillo
		//Pero puede variar
		ingredientes = new Ingredientes[15];
	}

	//Puedo tener varios constructores, sin llamarlos igual:
	public Platillo(int maximoIngredientes) {
		ingredientes = new Ingredientes[maximoIngredientes];
	}

	public String toString() {
		 String texto="Nombre: "+nombre+" $"+costo+"\n\tIngredientes: ";
		 for(int i=0; i<ingredientes.length;i++){
		 	if(ingredientes[i]!=null){
				texto+="\n"+ingredientes[i];
			}
			costoT+=ingredientes[i].noCalorias;
		}
		texto+="\nCosto total: "+costoT;
		 return texto;
	}
}