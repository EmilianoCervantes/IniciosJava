//Llamado por refacci�n
//relaci�n de agregaci�n - refacci�n
public class Marca{
	Direccion dir;
	String nombre, RFC;

	public Marca(){
		dir=new Direccion();
	}

	public String toString(){
		return "Nombre marca: "+nombre+", RFC: "+RFC+"\nDirecci�n: "+dir;
	}
}