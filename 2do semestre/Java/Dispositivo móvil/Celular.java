public class Celular extends DispositivoMovil{
	public String numero;
	public String operadora;
	public Camara camara;
	//usamos may�scula para el nombre de la clase y min�scula para el nombre de la variable

	public Celular(){
		camara = new Camara();
	}

	/*Le podemos agregar toString a Celular si queremos que imprima diferente
	  de DispositivoMovil*/

	public String toString() {
		String texto;
		texto = "# "+numero+" con "+operadora+"\n"+super.toString();
		//para llamar cosas de la clase padre usamos "super."
		texto+= "\nCamara";
		return texto;
	}
}