import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//JToggleButton (cuando se clickea se realiza el evento)
//import javax.swing.JOptionPane;

public class Tablero extends JFrame{
	GridLayout layp=new GridLayout(8,8,1,1);

	private final ImageIcon ipeonblanco = new ImageIcon("peonblanco.png");
	private final ImageIcon ipeonnegro = new ImageIcon("peonnegro.png");
	private final ImageIcon itorreblanca = new ImageIcon("torreblanca.png");
	private final ImageIcon itorrenegra = new ImageIcon("torrenegra.png");
	private final ImageIcon icaballoblanco = new ImageIcon("caballoblanco.png");
	private final ImageIcon icaballonegro = new ImageIcon("caballonegro.png");
	private final ImageIcon ialfilblanco = new ImageIcon("alfilblanco.png");
	private final ImageIcon ialfilnegro = new ImageIcon("alfilnegro.png");
	private final ImageIcon ireinablanca = new ImageIcon("reinablanca.png");
	private final ImageIcon ireinanegra = new ImageIcon("reinanegra.png");
	private final ImageIcon ireyblanco = new ImageIcon("reyblanco.png");
	private final ImageIcon ireynegro = new ImageIcon("reynegro.png");

	private int a=0,b=0;
	private int x1,y1,x2,y2;
	private int contadorB=0;
	private Casilla [][] casillas = new Casilla [8][8];
	private int numeros[][] = new int[8][8];
	private String nombres[][] = new String [8][8];
	private boolean mover;

	public static void main (String [] args){
		new Tablero().setVisible(true);
	}

	public Tablero(){
		construir();
		colocarPiezasInicio();
		colocar();
	}

	public void construir(){
		setTitle("Tablero");
		setSize(700,700);
		setLayout(layp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.out.println(blanco.length);
		String color;
		for(int i=0; i < 8; i++){
			if(i % 2 == 0){
				color = "blanco";
			}else{
				color = "negro";
			}
			for(int j=0; j < 8; j++){
				if(color.equals("blanco")){
					//if(cosatablero[i][j]==7){cosa.setIcon(blancotorre.png)}
					casillas[i][j] = new Casilla();
					add(casillas[i][j]);
					casillas[i][j].setBackground( Color.WHITE );
					color = "negro";
					casillas[i][j].x=i;
					casillas[i][j].y=j;
					casillas[i][j].addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent evento){
						 //JToggleButton manejadoreventos = (JToggleButton) evento.getSource();
							 casillasClick(evento);
						 }
					});
				}
				else if(color.equals("negro")){
					casillas[i][j] = new Casilla();
					add(casillas[i][j]);
					casillas[i][j].setBackground( Color.BLACK );
					color = "blanco";
					casillas[i][j].x=i;
					casillas[i][j].y=j;
					casillas[i][j].addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent evento){
						//JToggleButton manejadoreventos = (JToggleButton) evento.getSource();
							casillasClick(evento);
						}
					});
				}
			}
		}
	}

	public void colocarPiezasInicio(){
		//primeras piezas
		numeros[0][0]=13;
		numeros[0][1]=9;
		numeros[0][2]=7;
		numeros[0][3]=2;
		numeros[0][4]=3;
		numeros[0][5]=8;
		numeros[0][6]=10;
		numeros[0][7]=14;
		//peones
		for(int i=0;i<8;i++){
			numeros[1][i]=25+i;
		}
		//casillas vacías
		for(int i=2;i<5;i++){
			for(int j=0;j<8;j++){
				numeros[i][j]=0;
			}
		}
		//más peones
		for(int i=0;i<8;i++){
			numeros[6][i]=17+i;
		}
		//últimas piezas
		numeros[7][0]=15;
		numeros[7][1]=11;
		numeros[7][2]=5;
		numeros[7][3]=1;
		numeros[7][4]=4;
		numeros[7][5]=6;
		numeros[7][6]=12;
		numeros[7][7]=16;
	}

	public void casillasClick(ActionEvent evento){
		String color;
		Casilla c = (Casilla)evento.getSource();
		/*Pieza p = c.getPieza();*/
		contadorB++;
		if(contadorB==1){
			x1=c.x;
			y1=c.y;
			//que una casilla en blanco NO se coma a una pieza
			if(numeros[x1][y1]==0){
				casillas[x1][y1].setSelected(false);
				contadorB=0;
			}
		}
		else if(contadorB==2){
			x2=c.x;
			y2=c.y;
			//que no haya suicidios xD
			if((x1==x2)&(y1==y2)){
				contadorB=0;
				casillas[x2][y2].setSelected(false);
			}
			else{
				switch(nombres[x1][y1]){
					case "rey negro":
						color="negro";
						mover=Rey.Mover(x1,y1,x2,y2);
						break;
					case "rey blanco":
						color="blanco";
						mover=Rey.Mover(x1,y1,x2,y2);
						break;
					case "reina negra":
						color="negro";
						mover=Reina.Mover(x1,y1,x2,y2);
						break;
					case "reina blanca":
						color="blanco";
						mover=Reina.Mover(x1,y1,x2,y2);
						break;
					case "alfil negro":
						color="negro";
						mover=Alfil.Mover(x1,y1,x2,y2);
						break;
					case "alfil blanco":
						color="blanco";
						mover=Alfil.Mover(x1,y1,x2,y2);
						break;
					case "caballo blanco":
						color="blanco";
						mover=Caballo.Mover(x1,y1,x2,y2);
						break;
					case "caballo negro":
						color="negro";
						mover=Caballo.Mover(x1,y1,x2,y2);
						break;
					case "torre negro":
						color="negro";
						mover=Torre.Mover(x1,y1,x2,y2);
						break;
					case "torre blanca":
						color="blanco";
						mover=Torre.Mover(x1,y1,x2,y2);
						break;
					case "peon blanco":
						color="blanco";
						mover=Peon.Mover(x1,y1,x2,y2);
						break;
					case "peon negro":
						color="negro";
						mover=Peon.Mover(x1,y1,x2,y2);
						break;
				}
				if(mover==true){
					numeros[x2][y2]=numeros[x1][y1];
					numeros[x1][y1]=0;
					colocar();
				}
				contadorB=0;
				casillas[x2][y2].setSelected(false);
				casillas[x1][y1].setSelected(false);
				x1=0;
				y1=0;
				x2=0;
				y2=0;
			}
		}
	}
	public void colocar(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				switch(numeros[i][j]){
					case 0:
						casillas[i][j].setIcon(null);
						nombres[i][j]="vacio";
						break;
					case 1:
						casillas[i][j].setIcon(ireynegro);
						nombres[i][j]="rey negro";
						break;
					case 2:
						casillas[i][j].setIcon(ireyblanco);
						nombres[i][j]="rey blanco";
						break;
					case 3:
						casillas[i][j].setIcon(ireinablanca);
						nombres[i][j]="reina blanca";
						break;
					case 4:
						casillas[i][j].setIcon(ireinanegra);
						nombres[i][j]="reina negra";
						break;
					case 5:
						casillas[i][j].setIcon(ialfilnegro);
						nombres[i][j]="alfil negro";
						break;
					case 6:
						casillas[i][j].setIcon(ialfilnegro);
						nombres[i][j]="alfil negro";
						break;
					case 7:
						casillas[i][j].setIcon(ialfilblanco);
						nombres[i][j]="alfil blanco";
						break;
					case 8:
						casillas[i][j].setIcon(ialfilblanco);
						nombres[i][j]="alfil blanco";
						break;
					case 9:
						casillas[i][j].setIcon(icaballoblanco);
						nombres[i][j]="caballo blanco";
						break;
					case 10:
						casillas[i][j].setIcon(icaballoblanco);
						nombres[i][j]="caballo blanco";
						break;
					case 11:
						casillas[i][j].setIcon(icaballonegro);
						nombres[i][j]="caballo negro";
						break;
					case 12:
						casillas[i][j].setIcon(icaballonegro);
						nombres[i][j]="caballo negro";
						break;
					case 13:
						casillas[i][j].setIcon(itorreblanca);
						nombres[i][j]="torre blanca";
						break;
					case 14:
						casillas[i][j].setIcon(itorreblanca);
						nombres[i][j]="torre blanca";
						break;
					case 15:
						casillas[i][j].setIcon(itorrenegra);
						nombres[i][j]="torre negra";
						break;
					case 16:
						casillas[i][j].setIcon(itorrenegra);
						nombres[i][j]="torre negra";
						break;
					case 17:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 18:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 19:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 20:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 21:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 22:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 23:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 24:
						casillas[i][j].setIcon(ipeonnegro);
						nombres[i][j]="peon negro";
						break;
					case 25:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 26:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 27:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 28:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 29:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 30:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 31:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
					case 32:
						casillas[i][j].setIcon(ipeonblanco);
						nombres[i][j]="peon blanco";
						break;
				}
			}
		}
	}
}