//relaci�n de herencia1 - padre
public class Mascota{
	public double edad, tama�o, peso, patas, costo;
	public String raza;
	public boolean parasitos, dientes;

	public String toString() {
		String texto;
		texto= " Raza "+raza+", edad "+edad+" a�os"+
				", tama�o "+tama�o+"mts"+", peso "+peso+"kg"+
				", #patas/aletas "+patas+", par�sitos "+parasitos+
				", dientes "+dientes+", costo $"+costo;
		return texto;
	}
}