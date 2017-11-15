//relación de herencia1 - padre
public class Mascota{
	public double edad, tamaño, peso, patas, costo;
	public String raza;
	public boolean parasitos, dientes;

	public String toString() {
		String texto;
		texto= " Raza "+raza+", edad "+edad+" años"+
				", tamaño "+tamaño+"mts"+", peso "+peso+"kg"+
				", #patas/aletas "+patas+", parásitos "+parasitos+
				", dientes "+dientes+", costo $"+costo;
		return texto;
	}
}