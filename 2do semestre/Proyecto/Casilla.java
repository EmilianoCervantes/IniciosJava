import javax.swing.*; //JToggleButton

public class Casilla extends JToggleButton {
	/*
	private final ImageIcon iblanco = new ImageIcon("Blanco.png");
	private final ImageIcon inegro = new ImageIcon("Negro.png");
	*/
	int x, y;
	int a,b;
	private Pieza pieza;
	//boolean ocupado;
	public Casilla(){

	}

	public void setPieza(Pieza p) {
		pieza = p;
		//Agregar el icono a la casilla
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setCoordenadas(int x, int y) {
		a = x;
		b = y;
	}
}