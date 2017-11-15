public class Mouse extends DispositivoELectronico{
	public String tipo;
	public int numeroBotones;

	public Mouse(){
		tipo = "Alámbrico";
	}

	public String toString(){
		return super.toString() + " (" + tipo + ") Botones: " + numeroBotones;
	}
}