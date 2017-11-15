//Esto es un ejemplo de herencia
public class DispositivoMovil {
	public int bateria;
	public String sistemaOperativo;
	public double largo, ancho, peso;
	public String marca;

	//le decimos a java que mande todo a texto
	public String toString() {
		String texto;
		texto = "Dispositivo "+marca+"["+largo+", "+ancho+", "+
				peso+"] S.O. "+sistemaOperativo;

		return texto;
	}
}