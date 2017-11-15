//Esto es un ejemplo de composición
public class Camara {
	public double resolucion, abertura, zoom;
	public boolean flash;
	public int ISO;

	public String toString(){
		return "Resolución: "+resolucion+"\tzoom: "+zoom+
		"\tFlash: "+flash+"\tISO: "+ISO+"\tAbertura: "+abertura;
	}
}