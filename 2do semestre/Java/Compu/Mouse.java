public class Mouse extends DispositivoELectronico{
	public String tipo;
	public int numeroBotones;

	public Mouse(){
		tipo = "Al�mbrico";
	}

	public String toString(){
		return super.toString() + " (" + tipo + ") Botones: " + numeroBotones;
	}
}