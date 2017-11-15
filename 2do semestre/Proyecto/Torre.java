import javax.swing.ImageIcon;

public class Torre extends Pieza{
	private boolean jaque, enroque;

	public Torre(String color){
		super.color = color;
		/*if (color.equals("blanco"))
			icono = new ImageIcon("torreblanco.png");
		else
			icono = new ImageIcon("torrenegro.png");*/
	}

	public boolean Mover(int x1, int y1,int x2, int y2){
		//checar casillas
		//sólo sirven para el tamaño del for
		int posx=(int)Math.sqrt(Math.pow((x1-x2),2));
		int posy=(int)Math.sqrt(Math.pow((y1-y2),2));
		int x=x1-x2;
		int y=y1-y2;
		if((x1 != x2) && (y1 == y2)){
			/*for(int i=0;i<posx;i++){

			}*/
			mover=true;
		}
		else if((x1 == x2) && (y1 != y2)){
			/*for(int i=0;i<posy;i++){

			}*/
			mover=true;
		}
		else{
			mover=false;
			System.out.print("Movimiento no valido");
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
