//Llamado por Platillo
public class Ingredientes{
	public String tipoAlimento, nombre;
	public int noCalorias;

	public String toString() {
		return "Nombre: "+nombre+", Tipo: "+tipoAlimento+
				", No. de calorías: "+noCalorias;
	}
}