//relación de composición1
public class Pez extends Mascota{
	public String tipo; //tipo=cartilaginoso/oseo
	public Pecera pecera;

	public Pez(){
		pecera = new Pecera();
	}

	public String toString(){
		String texto;
		texto=super.toString()+", tipo "+tipo;
		texto+="\nPecera: "+pecera;
		return texto;
	}
}