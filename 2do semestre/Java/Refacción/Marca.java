//Llamado por refacción
//relación de agregación - refacción
public class Marca{
	Direccion dir;
	String nombre, RFC;

	public Marca(){
		dir=new Direccion();
	}

	public String toString(){
		return "Nombre marca: "+nombre+", RFC: "+RFC+"\nDirección: "+dir;
	}
}