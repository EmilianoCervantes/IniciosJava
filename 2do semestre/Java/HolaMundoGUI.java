//import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaMundoGUI extends JFrame{
	public static void main(String[] args){
		HolaMundoGUI gui;
		gui = new HolaMundoGUI();
		gui.setVisible(true);
	}

	public HolaMundoGUI(){
		inicializarComponentes();
	}
	private void inicializarComponentes(){
		setSize(300, 200);
		setTitle("Hola Mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblMensaje;
		lblMensaje = new JLabel("Hola Mundo");

		add(lblMensaje);
	}
}