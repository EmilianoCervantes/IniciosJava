public class Videojuego extends Material{
	public int numJug;
	public String marca;

	public String toString(){
		return super.toString()+", número de jugadores: "+numJug+", marca: "+marca;
	}
}