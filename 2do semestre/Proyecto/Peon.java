import javax.swing.ImageIcon;

public class Peon  extends Pieza{
	private boolean Jaque,Coronar,inicial;
	public Peon(String color){
		super.color = color;
		if (color.equals("blanco"))
			icono = new ImageIcon("peonblanco.png");
		else
			icono = new ImageIcon("peonnegro.png");
	}
	public boolean Mover (int x1,int y1,int x2,int y2){
		int i=0;
		if(i==0){
			if((y2-y1==2)&&(x2==x1)){
				mover=true;
				i++;
			}
			else if((x2==x1)&&(y2-y1)==1){
				mover=true;
				i++;
			}
			else{
				mover=false;
				System.out.print("Movimiento inválido");
			}
		}
		//falta invalidar el mov. hacia atrás
		else if(i>=1){
			if(x2-x1==1){
				mover=true;
			}
			else if((x2==x1)&&(y2-y1)==1){
				mover=true;
			}
			else{
				mover=false;
				System.out.print("Movimiento inválido");
				//return false;
			}
		}
		return mover;
	}
}