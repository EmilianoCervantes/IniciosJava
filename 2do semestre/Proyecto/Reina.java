import javax.swing.ImageIcon;

public class Reina  extends Pieza{
	private boolean Jaque;
	public Reina(String color){
		super.color = color;
		/*if (color.equals("blanco"))
			icono = new ImageIcon("reinablanca.png");
		else
			icono = new ImageIcon("reinanegra.png");*/
	}
	public boolean Mover (int x1,int y1,int x2,int y2){
		int posx=(int)Math.sqrt(Math.pow((x1-x2),2));
		int posy=(int)Math.sqrt(Math.pow((y1-y2),2));
		int x=x1-x2;
		int y=y1-y2;
		if ((x1!=x2)&&(y1==y2)){
			mover=true;
		}
		else if((x1==x2)&&(y1!=y2)){
			mover=true;
		}
		else if((x1-x2)==(y1-y2)){
			mover=true;
		}
		else{
			mover=false;
			System.out.println("Movimiento invá¡lido");
		}
		return mover;
	}
	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}

	public ImageIcon getIcono() {
		return icono;
	}
}