public class Refaccion{
	int cantExist, cantMin;
	Marca marc;
	String nombre, SKU;//Stock-keeping unit
	boolean requiereOrd;

	public Refaccion(){
		marc=new Marca();
	}

	public String toString(){
		return "Nombre refacci�n: "+nombre+", SKU: "+SKU+
				"\nSe requieren m�s: "+requiereOrd+"\nMarca: "+marc;
	}
}