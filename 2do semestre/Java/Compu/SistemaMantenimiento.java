public class SistemaMantenimiento{
	public static void main(String[] args){
		Mouse m;
		m = new Mouse();
		m.marca = "Dell";
		m.modelo = "RJ45";
		m.numeroBotones = 3;

		Computadora c;
		c = new Computadora();
		c.marca = "Toshiba";
		c.modelo = "Inspiron";
		c.sistemaOperativo = "Windows 95";
		c.velocidadProcesador = 0.1;
		c.RAM = 128;
		c.agregarMouse(m); //se guarda la dirección donde está el mouse

		System.out.println("Computadora: " + c);

	}
}