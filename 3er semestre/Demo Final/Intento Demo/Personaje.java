public class Personaje{
	String nombre;
	int edad;
	public static int tipoFuncion;

	public Personaje(String nombre, int edad){
			this.nombre = nombre;
			this.edad = edad;
	}

	@Override
	public String toString(){
		return nombre +  "/" + edad;
	}

	@Override
	public int hashCode(){
		int h = 0;
		switch(tipoFuncion){
			case 1:
				h = nombre.hashCode();
				break;
			case 2:
				h = (int) Math.pow(edad, 2);
				break;
			case 3:
				h = (int) Math.pow(edad, 2);
				break;				
		}

		return h;
	}
}





