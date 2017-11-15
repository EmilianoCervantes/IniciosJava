import javax.swing.ImageIcon;

public class Caballo extends Pieza{
	private boolean jaque;

	public Caballo(String color){
		super.color = color;
		if (color.equals("blanco"))
			icono = new ImageIcon("peonblanco.png");
		else
			icono = new ImageIcon("peonnegro.png");
	}

	public boolean Mover(int x1, int y1, int x2, int y2){
		int posx=(int)Math.sqrt(Math.pow((x1-x2),2));
		int posy=(int)Math.sqrt(Math.pow((y1-y2),2));
		int x=x1-x2;
		int y=y1-y2;
		boolean tiroEfectuado = false;
		//no hay que hacer ciclos para esta pieza
		while (tiroEfectuado = false){
			if((x2-x1==2)&(y2-y1==1)){
				mover=true;
			}
			else if((y2-y1==2)&(x2-x1==1)){
				mover=true;
			}
			else if((x1-x2==2)&(y2-y1==1)){
				mover=true;
			}
			else if((y1-y2==-2)&(x2-x1==1)){
				mover=true;
			}
			else if((y2-y1==2)&(x1-x2==1)){
				mover=true;
			}
			else if((x1-x2==2)&(y1-y2==1)){
				mover=true;
			}
			else if((y1-y2==-2)&(x1-x2==1)){
				mover=true;
			}
			else if((x2-x1==2)&(y1-y2==1)){
				mover=true;
			}
			else{
				mover=false;
				System.out.print("Movimiento no valido");
			}
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
