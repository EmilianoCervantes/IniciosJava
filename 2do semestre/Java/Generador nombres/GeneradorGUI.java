import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Color;


public class GeneradorGUI extends JFrame{

	private JLabel lblNombre, lblApellidoPat, lblApellidoMat, lblCiudad, lblGenerar, lblSaludo;
	private JTextField txtNombre, txtApellidoPat, txtApellidoMat, txtCiudad;
	private JButton bttGenerar;
	private JPanel pDatos;

	public static void main(String[]args){
		GeneradorGUI gui;
		gui = new GeneradorGUI();
		gui.setVisible(true);
	}

	public GeneradorGUI(){
		crearPersonaje();
	}

	private void crearPersonaje(){
		setSize(500,400);
		setTitle("Personaje StarWars");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		GridLayout layout = new GridLayout(6, 2,    20, 30);
		pDatos = new JPanel(layout);
		add(pDatos);
		pDatos.setBackground(Color.yellow);

		//Con los dos primeros generas el nombre
		lblApellidoPat = new JLabel("Dame tu apellido paterno: ");
		pDatos.add(lblApellidoPat);
		txtApellidoPat = new JTextField();
		pDatos.add(txtApellidoPat);

		lblNombre = new JLabel("Dame tu nombre: ");
		pDatos.add(lblNombre);
		txtNombre = new JTextField();
		pDatos.add(txtNombre);

		//Con los dos sig. generas el apellido
		lblApellidoMat = new JLabel("Dame tu apellido materno: ");
		pDatos.add(lblApellidoMat);
		txtApellidoMat = new JTextField();
		pDatos.add(txtApellidoMat);

		lblCiudad = new JLabel("Dame la ciudad donde naciste: ");
		pDatos.add(lblCiudad);
		txtCiudad = new JTextField();
		pDatos.add(txtCiudad);

		pDatos.add(new JLabel(""));
		pDatos.add(new JLabel(""));

		lblGenerar = new JLabel(" ...");

		pDatos.add(lblGenerar);

		bttGenerar = new JButton("Generar");

		bttGenerar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				loquesea generador = new loquesea();
				Persona persona = new  Persona();
				persona.apellidoPaterno = txtApellidoPat.getText();
				persona.nombre = txtNombre.getText();
				persona.apellidoMaterno = txtApellidoMat.getText();
				persona.ciudad = txtCiudad.getText();
				lblGenerar.setText("Bienvenido "+generador.generarNombre(persona));
			}
		} ) ;
	pDatos.add(bttGenerar);
	}
}