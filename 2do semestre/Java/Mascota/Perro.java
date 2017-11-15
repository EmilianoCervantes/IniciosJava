//relación de herencia2 - hijo
public class Perro extends Mascota {
	public boolean vacunas, pedigree, pelo;

	public String toString(){
		String texto;
		texto= super.toString()+", pelo: "+pelo+", vacunas "+vacunas+
				", pedigree "+pedigree;
		return texto;
	}
}