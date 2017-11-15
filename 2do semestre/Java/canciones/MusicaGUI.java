import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MusicaGUI extends JFrame implements ArtistaGUI, CancionGUI{
	private JPanel pPrincipal, pBotones;
	private JButton bttnArtistas, bttnCanciones, bttnRegresar;

	public static void main(String[] args){
		new MusicaGUI().setVisible(true);
	}

	public MusicaGUI(){
		menuInicial();
	}

	public void menuInicial(){
		setSize(600,400);
		setTitle("Canciones y Artistas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pDatos = new JPanel(new GridLayout(2,2,10,10));

		pBotones = new JPanel(new FlowLayout());

		bttnArtistas = new JButton("Artistas");
		bttnArtistas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnArtistasClick();
			}
		});
		pBotones.add(bttnArtistas);

		bttnCanciones = new JButton("Artistas");
		bttnCanciones.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnCancionesClick();
			}
		});
		pBotones.add(bttnCanciones);

	}
	public void bttnCancionesClick(){
		new ArtistaGUI().setVisible(false);
		new CancionGUI().setVisible(true);
	}

	public void bttnArtistasClick(){
		new ArtistaGUI().setVisible(true);
		new CancionGUI().setVisible(false);
	}
}