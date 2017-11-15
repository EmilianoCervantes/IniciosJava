public class DVD extends Material{
	public String genero, tipo;

	public String toString(){
			return super.toString()+", género: "+genero+", tipo: "+tipo;
	}
}