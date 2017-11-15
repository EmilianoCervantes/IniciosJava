import javax.swing.ImageIcon;

public class Alfil extends Pieza{
	private boolean jaque;
	public Alfil(String color){
		super.color = color;
		if (color.equals("blanco"))
			icono = new ImageIcon("alfilblanco.png");
		else
			icono = new ImageIcon("alfilnegro.png");
	}

	public boolean Mover(int x1, int y1, int x2, int y2){
		int posx=(int)Math.sqrt(Math.pow((x1-x2),2));
		int posy=(int)Math.sqrt(Math.pow((y1-y2),2));
		//es esto o a través de las coordenadas
		int x=x1-x2;
		int y=y1-y2;
		if((x1-x2)==(y1-y2)){
			/*for(int i=0;i<posx;i++){
				for(int j=0;j<posy;i++){
					if(i==j){
						//checar[][]
					}
				}
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
