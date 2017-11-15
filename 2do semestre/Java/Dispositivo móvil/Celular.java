public class Celular extends DispositivoMovil{
	public String numero;
	public String operadora;
	public Camara camara;
	//usamos mayúscula para el nombre de la clase y minúscula para el nombre de la variable

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