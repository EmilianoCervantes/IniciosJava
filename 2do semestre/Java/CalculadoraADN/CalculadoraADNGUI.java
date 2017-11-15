import javax.swing.*;
import java.awt.*;

public class CalculadoraADNGUI extends JFrame{
	private JButton bttnGenerar, bttnCombinar, bttnLongitud,
			bttnClonar, bttnBuscar, bttnAgregar;
	private JList lblSecuencias;
	private DefaultListModel datosSecuencias;
	private JTextField txtSecuencia;
	private JPanel pBotones, pDatos, pPrincipal;

	public CalculadoraADNGUI(){
		inicializarComponentes();
	}

	private void inicializarComponentes(){
		setSize(500,500);
		setTitle("Calculadora ADN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pPrincipal=new JPanel(new GridLayout(1,2));
		add(pPrincipal);
		pBotones=new JPanel(new FlowLayout());
		bttnGenerar=new JButton("Generar");
		pBotones.add(bttnGenerar);

		bttnCombinar=new JButton("Combinar");
		pBotones.add(bttnCombinar);

		bttnLongitud=new JButton("Longitud");
		pBotones.add(bttnLongitud);

		bttnClonar=new JButton("Clonar");
		pBotones.add(bttnClonar);

		bttnBuscar=new JButton("Buscar");
		pBotones.add(bttnBuscar);

		pPrincipal.add(pBotones);

		//Creamos el panel de datos
		pDatos = new JPanel(new FlowLayout());
		pDatos.add(new JLabel("Secuencias"));
		datosSecuencias = new DefaultListModel();
		lblSecuencias = new JList(datosSecuencias);
		lblSecuencias.setPreferredSize(new Dimension(250,300));
		pDatos.add(lblSecuencias);
		pDatos.add(new JLabel("Resultado"));
		txtSecuencia = new JTextField();
		pDatos.add(txtSecuencia);
		bttnAgregar=new JButton("Agregar");
		pDatos.add(bttnAgregar);
		pPrincipal.add(pDatos);
	}

	public static void main(String[]args){
		new CalculadoraADNGUI().setVisible(true);
	}
}