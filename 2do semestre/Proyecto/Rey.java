import javax.swing.ImageIcon;

public class Rey  extends Pieza{
	private boolean enJaque, Enroque, movPosi, JaqueMate;
	public Rey(String color){
		super.color = color;
		/*if (color.equals("blanco"))
			icono = new ImageIcon("reyblanco.png");
		else
			icono = new ImageIcon("reynnegro.png");*/
	}
	//no hay que hacer ciclos para este
	public boolean Mover (int x1,int y1,int x2,int y2){
		int posx=(int)Math.sqrt(Math.pow((x1-x2),2));
		int posy=(int)Math.sqrt(Math.pow((y1-y2),2));
		int x=x1-x2;
		int y=y1-y2;
		//atrás y/o abajo
		if (((x1-x2)==1) || ((y1-y2)==1)){
			mover=true;
		}
		//adelante y/o arriba
		else if(((x2-x1)==1) || ((y2-y1)==1)){
			mover=true;
		}
		//adelante Y abajo
		else if(((x2-x1)==1) && ((y2-y1)==-1)){
			mover=true;
		}
		//atrás Y arriba
		else if(((x2-x1)==-1)&&((y2-y1)==1)){
			mover=true;
		}
		else{
			System.out.println("Movimiento invá¡lido");
			mover=false;
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