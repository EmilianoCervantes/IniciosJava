import javax.swing.ImageIcon;

public class Pieza {
	protected ImageIcon icono;
	protected String color;
	protected boolean mover;

	public boolean Mover(int x1,int y1,int x2,int y2){
		return mover;
	}

	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}

	public ImageIcon getIcono() {
		return icono;
	}
}