package edu.itesm.mx.proyecto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test extends JFrame{
	//JFrames
	public JFrame principal;
	public JFrame tweets;
	public JFrame grafos;
	public JFrame diccionario;
//Principal	
	//Botones
	public JButton bTweets;
	public JButton bDiccionario;
	public JButton bGrafos;
	public JButton bADiccionario;
	public JButton bBDiccionario;
//Generales
	public JButton bcerrar=new JButton("Cerrar");
	public JList lista;
	public DefaultListModel modelo;
	public Color rojoCenizo=new Color(200, 100,100);
//Diccionario
	public String [] opciones = {"Inglés", "Español"};
	public JComboBox box = new JComboBox(opciones);

//Grafos


	public static void main (String args[]){
		new Test();
	}
	public Test(){

		draw(1);

	}

	public void draw(int i){
		
		switch(i){
		case 1:
			principal=new JFrame();
			principal.getContentPane().setBackground(rojoCenizo);
			principal.getContentPane().setForeground(Color.white);
			principal.setSize(150,400);
			principal.setTitle("      Swittter      ");
			principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			principal.setLayout(new FlowLayout(FlowLayout.CENTER));
			bTweets=new JButton("     Ver Tweets     ");
			bDiccionario=new JButton("Ver Diccionarios");
			bADiccionario=new JButton(" Agregar palabras ");
			bGrafos=new JButton("    Ver Grafos    ");
			bBDiccionario=new JButton(" Borrar  palabras ");
			principal.add(new JLabel("     Swittter     "));
			bTweets.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					draw(2);
					dispose();
					tweets.setVisible(true);
				}
			});
			bDiccionario.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					draw(3);
					dispose();
					diccionario.setVisible(true);
				}

			});
			bGrafos.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					draw(4);
					dispose();
					grafos.setVisible(true);
				}

			});
			bADiccionario.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					draw(5);
					dispose();
					diccionario.setVisible(true);
				}

			});
			bBDiccionario.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					draw(6);
					dispose();
					diccionario.setVisible(true);
				}

			});
			bcerrar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					dispose();
					System.exit(3);	
				}

			});
			principal.add(bTweets);
			principal.add(bDiccionario);
			principal.add(bADiccionario);
			principal.add(bBDiccionario);
			principal.add(bGrafos);
			principal.add(bcerrar);
			principal.setVisible(true);
			
			
			break;
		case 2:
			tweets=new JFrame();
			tweets.getContentPane().setBackground(rojoCenizo);
			tweets.getContentPane().setForeground(Color.white);
			tweets.setSize(400,100);
			tweets.setTitle("Resultados de la Búsqueda");
			tweets.setLayout(new BorderLayout());
			tweets.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			lista=  new JList(cargarTweets(JOptionPane.showInputDialog(principal, "Escriba el tema que desea ver")));
			tweets.add(lista, BorderLayout.CENTER);
			tweets.add(bcerrar, BorderLayout.SOUTH);
			
			break;
		case 3:
			dic("ver");
			break;
		case 4:
			grafos=new JFrame();
			grafos.setSize(400, 400);
			grafos.getContentPane().setBackground(rojoCenizo);
			grafos.getContentPane().setForeground(Color.white);
			Grafo g=new Grafo();
			grafos.add(new JLabel("Aquí irá una grafo prof, lo prometo"));
			break;
		case 5:
			dic("agregar");
			break;
		case 6:
			dic("eliminar");
			break;
			
		}
	

	}
	private void dic(String hola){
		diccionario=new JFrame();
		diccionario.getContentPane().setBackground(rojoCenizo);
		diccionario.getContentPane().setForeground(Color.white);
		diccionario.setSize(600,300);
		diccionario.setTitle("Diccionario");
		diccionario.setLayout(new BorderLayout());
		JPanel izquierda=new JPanel();
		izquierda.setLayout(new GridLayout(3,1,5,5));
		ButtonGroup bg= new ButtonGroup();
		JRadioButton [] rb=new JRadioButton[2];
		rb[0]=new JRadioButton("Palabras Positivas");
		rb[1]=new JRadioButton("Palabras Negativas");
		diccionario.add(new JLabel("Elija un diccionario para "+hola), BorderLayout.NORTH);
		bg.add(rb[0]);
		bg.add(rb[1]);
		izquierda.add(box);
		izquierda.add(rb[0]);
		izquierda.add(rb[1]);
		izquierda.setBackground(rojoCenizo);
		izquierda.setForeground(Color.white);
		
		diccionario.add(izquierda, BorderLayout.WEST);
		diccionario.add(bcerrar,BorderLayout.SOUTH);
		diccionario.add(lista=new JList(cargarTweets("x")));
	}
	private DefaultListModel cargarTweets(String tema) {
		modelo=new DefaultListModel();
		modelo.addElement("Emi");
		modelo.addElement("Oscar");
		modelo.addElement("Joao");
		modelo.addElement("El manzanas");
		modelo.addElement("Yo");
		return modelo;

	}
}
