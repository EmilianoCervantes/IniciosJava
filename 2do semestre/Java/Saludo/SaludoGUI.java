//Así sabe java que se van a utilizar todas las cosas de javax.swing:
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class SaludoGUI extends JFrame{

	private JLabel lblNombre, lblApellidos, lblSaludo;
	private JTextField txtNombre, txtApellidos;
	private JButton bttSaludar;
	private JPanel pDatos;

	public static void main(String[] args){
		SaludoGUI gui = new SaludoGUI();
		gui.setVisible(true);
	}

	public SaludoGUI(){
		inicializarComponentes();
	}
	private void inicializarComponentes(){
		setSize(300, 200);
		setTitle("Saludar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//filas, columnas, espacio entre elementos horizontales, espacio entre elementos verticales
		GridLayout layout = new GridLayout(4, 2, 10, 20);
		pDatos = new JPanel(layout);
		add(pDatos);

		lblNombre = new JLabel("Nombre(s): ");
		pDatos.add(lblNombre);
		txtNombre = new JTextField();
		pDatos.add(txtNombre);

		lblApellidos = new JLabel("Apellidos: ");
		pDatos.add(lblApellidos);
		txtApellidos = new JTextField();
		pDatos.add(txtApellidos);

		pDatos.add(new JLabel(""));
		pDatos.add(new JLabel(""));

		lblSaludo = new JLabel("...");
		pDatos.add(lblSaludo);

		bttSaludar = new JButton("Saludar");

		//Esta es la tercer forma de crear la clase y el objeto al mismo tiempo:
		//En realidad no me importa el nombre de la clase
		bttSaludar.addActionListener(new ActionListener(){
		/*Esta es la segunda forma de crear la clase y el objeto a la vez:
		//Esta es una clase interna
		class SaludoManejador implements ActionListener{*/
			public void actionPerformed(ActionEvent evt){
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				lblSaludo.setText("Hola "+nombre+" "+apellidos);
			}
		});

		/*Esta es la primer forma de crear el objeto:
		Es más complicada y hay que escribir más código
		SaludoManejador manejador = new SaludoManejador();
		manejador.txtNombre = txtNombre;
		manejador.txtApellidos = txtApellidos;
		manejador.lblSaludo = lblSaludo;

		//En vez de poner new SaludoManejador(), ponemos ya simplemente manejador
		bttSaludar.addActionListener(manejador);*/

		pDatos.add(bttSaludar);
	}
}