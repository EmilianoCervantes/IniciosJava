public class Videojuego extends Material{
	public int numJug;
	public String marca;

	public String toString(){
		return super.toString()+", n�mero de jugadores: "+numJug+", marca: "+marca;
	}
}