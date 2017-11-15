public class Contacto{
	String nombre;
	int telefono;
	public static int tipoFuncion;

	public Contacto(String n, int t){
		this.telefono = t;
		this.nombre = n;
		
	}

	@Override
	public String toString(){
		return nombre + ": " + ": " +telefono;
	}

	@Override
	public int hashCode(){
		int h = 0;
		switch(tipoFuncion){
			case 1:
				h = nombre.hashCode();
				break;

			case 2:
				h = nombre.hashCode()*29;
                break;
		}
		return h;
	}

	public String getNom(){
		return nombre;
	}
	public void setNom(String n){
		this.nombre = n;
	}

	

	public int getTel(){
		return telefono;
	}
	public void setTel(int t){
		this.telefono = t;
	}

}