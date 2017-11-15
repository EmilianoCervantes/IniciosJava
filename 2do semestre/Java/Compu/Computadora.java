public class Computadora extends DispositivoELectronico{
	public int RAM;
	public double velocidadProcesador;
	public String sistemaOperativo;
	private Mouse raton; //Solo se puede utilizar en la clase donde la declaré

	public Computadora(){
	}

	//recibe como parámetro un mouse
	//recibe atributo y asocia, el mouse que recibe lo hace igual al que tengo
	public void agregarMouse(Mouse mouse){
		raton = mouse;
	}

	public String toString(){
		return super.toString() + "S.O. " + sistemaOperativo + "Procesador: " + velocidadProcesador + "\tRAM: " + RAM + "Mouse: " + raton;
	}
}