//Esto es un ejemplo de composici�n
public class Camara {
	public double resolucion, abertura, zoom;
	public boolean flash;
	public int ISO;

	public String toString(){
		return "Resoluci�n: "+resolucion+"\tzoom: "+zoom+
		"\tFlash: "+flash+"\tISO: "+ISO+"\tAbertura: "+abertura;
	}
}