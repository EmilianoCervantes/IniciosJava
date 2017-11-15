//constructor : darle valores iniciales al objeto
//constructor estático: darle valores estáticos a un objeto  estático
//const est no existe como tal en java
public class Libro{
	public String nombre;
	public int id;
	public static int siguiente;

	//darle valores iniciales
	//uno por todos los obj
	static{
		siguiente=10;
	}

	public Libro(){
		id=siguiente++;
	}
}