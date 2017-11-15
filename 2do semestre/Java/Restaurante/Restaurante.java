public class Restaurante {
	Platillo[] platillos;
	String nombre;
	int noMesas, i;

	public Restaurante(){
		platillos = new Platillo[15];
	}

	public Restaurante(int maxPlatillos){
		platillos = new Platillo[maxPlatillos];
	}

	public String toString(){
		String texto= "Nombre del restaurante: "+nombre+
				" con un numero de "+noMesas+" mesas. ";

		for (i=0;i<platillos.length;i++){
			if(platillos[i]!=null){
				texto+="\n"+platillos[i];
			}
		}
		return texto;
	}
}