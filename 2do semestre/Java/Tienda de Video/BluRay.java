public class BluRay extends Material{
	public String genero, tipo;
	public String[] nomActor = new String[4];
	public int ejemplares;

	public String toString(){
			return super.toString()+"genero: "+genero+", tipo:"+tipo+", actores principales"+
			nomActor+", número de ejemplares: "+ejemplares;
	}
}