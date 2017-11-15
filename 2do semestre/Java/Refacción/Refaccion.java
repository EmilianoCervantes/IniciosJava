public class Refaccion{
	int cantExist, cantMin;
	Marca marc;
	String nombre, SKU;//Stock-keeping unit
	boolean requiereOrd;

	public Refaccion(){
		marc=new Marca();
	}

	public String toString(){
		return "Nombre refacción: "+nombre+", SKU: "+SKU+
				"\nSe requieren más: "+requiereOrd+"\nMarca: "+marc;
	}
}