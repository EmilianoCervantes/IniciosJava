package edu.itesm.mx.proyecto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test <T>extends JFrame{
	//JFrames
	public JFrame principal;
	public JFrame tweets;
	public JFrame grafos;
	public JFrame diccionario;
	//Principal	
	//Botones
	public JButton bTweets;
	public JButton bDiccionario;
	public JButton bCDiccionario;
	//Generales
	public Twitter t;
	public JButton bGrafos;
	public JButton bcerrar=new JButton("Cerrar");
	public JButton bregresar=new JButton("Regresar");
	public JList lista,dlista;
	public DefaultListModel modelo;
	public JPanel p;
	int r=(int) (Math.random()*255+1), g= (int) (Math.random()*255+1),b=(int)(Math.random()*255+1);
	public Color color=new Color(r,g,b);
	public Color color2=new Color(255-r,255-g ,255-b);
	public String s;
	//Diccionario
	public String [] opciones = {"Inglés", "Español"};
	public JTextField txtpa=new JTextField(10);
	public JComboBox box = new JComboBox(opciones);
	public JButton bagregar,bmostrar,bborrar;
	//Grafos
	
	public static void main (String args[]){
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		new Test();
	}
	public Test(){
		drawPrincipal();
	}
	
	public void drawTweet(){
		tweets=new JFrame();
		tweets.getContentPane().setBackground(color);
		tweets.getContentPane().setForeground(color2);
		tweets.setSize(800,600);
		tweets.setTitle("Resultados de la Búsqueda");
		tweets.setLayout(new BorderLayout());
		tweets.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Twitter t=new Twitter();
		DefaultListModel l=new DefaultListModel();
		s=JOptionPane.showInputDialog(principal, "Escriba el tema que desea ver: ");
		l=t.consultaTwitter(s,l);
		lista = new JList(l);
		tweets.add(lista, BorderLayout.CENTER);
		bGrafos=new JButton("Ver Grafos");
		JPanel z=new JPanel();
		z.add(bGrafos);
		z.add(bregresar);
		tweets.add(z, BorderLayout.SOUTH);
		bregresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tweets.dispose();
				drawPrincipal();
				principal.setVisible(true);
			}
		});
		bGrafos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawGrafo(s);
			}
		});
	}
	
	public void drawGrafo(String str){
		t = new Twitter();
		CircularDoubleLinkedList <String>c =  t.consultaTwitter(str);
		int tamano;
		grafos = new JFrame();
		grafos.setSize(800, 600);
		grafos.getContentPane().setBackground(color);
		grafos.getContentPane().setForeground(color2);
		Grafo g = new Grafo();
		tamano = c.size();
		System.out.println(c.size());
		for(int w = 0; w < c.size(); w++){
			g.put(c.get(w), c);
		}
		c = new CircularDoubleLinkedList();
		int comp = 0;
		String uno="", dos="";
		Graph grafo = new SingleGraph("Grafo de tweets");
		for(String nodo : g.keySet()){
			grafo.addNode(nodo);
			String[] n = nodo.split(" ");
			for(String x : g.keySet()){
				int aa = 0;
				String[] e = x.split(" ");
				for(String v : n){
					for(String w : e){
						if(w.equals(v)){
							aa++;
						}
					}
				}
				if(comp<aa && x!=nodo){
					uno = nodo;
					dos = x;
					comp=aa;
				}
			}
		}
		Diccionario dic = new Diccionario();
		int sen =0, nodoMayor=0;
		String tweetMayor=new String();
		for(String nodo:g.keySet()){
			try {
				sen = dic.sentimientos(nodo);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Node n = grafo.getNode(nodo);
			n.addAttribute("ui.label",nodo);
			int aristas = 0;
			for(String a : g.keySet()){
				if(nodo.compareTo(a)!=0 ){
					try{
						Edge arista=grafo.addEdge(nodo+a, nodo, a, false);
						arista.addAttribute("ui.label", nodo);
						aristas++;
						if(sen==0){
							n.setAttribute("ui.style", "fill-color: rgb(0,255,0); size: "+(50+1*aristas)+"px;");
						}else if(sen<0){
							n.setAttribute("ui.style", "fill-color: rgb(255,0,0); size: "+(50+1*aristas)+"px;");
						}else if(sen>0){
							n.setAttribute("ui.style", "fill-color: rgb(0,0,255); size: "+(50+1*aristas)+"px;");
						}
						if(aristas>nodoMayor){
							tweetMayor = nodo;
							nodoMayor=aristas;
						}
					}catch(Exception ex){
					}
				}
				aristas=0;
			}
		}
		System.out.println(tweetMayor);
		grafo.display();
		
	}
	
	public void drawDiccionario(){
		diccionario=new JFrame();
		diccionario.getContentPane().setBackground(color);
		diccionario.getContentPane().setForeground(color2);
		diccionario.setSize(800,400);
		diccionario.setTitle("Diccionario");
		diccionario.setLayout(new BorderLayout());
		JPanel izquierda=new JPanel();
		izquierda.setLayout(new GridLayout(3,1,5,5));
		ButtonGroup bg= new ButtonGroup();
		JRadioButton [] rb=new JRadioButton[2];
		rb[0]=new JRadioButton("Palabras Positivas");
		rb[1]=new JRadioButton("Palabras Negativas");
		rb[0].setForeground(color2);
		rb[1].setForeground(color2);
		diccionario.add(new JLabel("Elija un diccionario para editar"), BorderLayout.NORTH);
		bg.add(rb[0]);
		bg.add(rb[1]);
		izquierda.add(box);
		izquierda.add(rb[0]);
		izquierda.add(rb[1]);
		izquierda.setBackground(color);
		izquierda.setForeground(color2);
		diccionario.add(izquierda, BorderLayout.WEST);
		bmostrar=new JButton("Mostrar");
		bagregar=new JButton("Agregar");
		bborrar=new JButton("Borrar");
		bregresar=new JButton("Regresar");	
		p=new JPanel();
		p.add(new JLabel("Escriba su palabra a agregar"));
		p.add(txtpa);
		p.add(bmostrar);
		p.add(bagregar);
		p.add(bborrar);
		p.add(bregresar);
		p.setBackground(color);
		diccionario.add(p,BorderLayout.SOUTH);
		dlista=new JList(new DefaultListModel());
		dlista.setBackground(Color.WHITE);
		diccionario.add(new JScrollPane(dlista));
		Diccionario d=new Diccionario();
		bregresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				diccionario.dispose();
				drawPrincipal();
				principal.setVisible(true);
			}
		});
		bagregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(rb[0].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						try {
							d.agregar(txtpa.getText(), 1);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else{
						try {
							d.agregar(txtpa.getText(), 0);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}else if(rb[1].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						try {
							d.agregar(txtpa.getText(), 3);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else{
						try {
							d.agregar(txtpa.getText(), 2);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}		
					}
				}else{
					JOptionPane.showMessageDialog(diccionario, "Elija un diccionario");		
				}
				JOptionPane.showMessageDialog(diccionario, "Su palabra ha sido agregada existosamente");
			}
		});
		bmostrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(rb[0].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						dlista.setModel(d.mostrar(new DefaultListModel(), 1));
						dlista.setBackground(Color.WHITE);
						dlista.updateUI();
					}else{
						dlista.setModel(d.mostrar(new DefaultListModel(), 0));
						dlista.setBackground(Color.WHITE);
						dlista.updateUI();
					}
				}else if(rb[1].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						dlista.setModel(d.mostrar(new DefaultListModel(), 3));
						dlista.setBackground(Color.WHITE);
						dlista.updateUI();
					}else{
						dlista.setModel(d.mostrar(new DefaultListModel(), 2));
						dlista.setBackground(Color.WHITE);
						dlista.updateUI();
					}
				}else{
					JOptionPane.showMessageDialog(diccionario, "Elija un diccionario");		
				}
			}
		});
		bborrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(rb[0].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						try {
							d.borrar(txtpa.getText(), 1);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else{
						try {
							d.borrar(txtpa.getText(), 0);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}else if(rb[1].isSelected()){
					if(box.getSelectedItem()=="Inglés"){
						try {
							d.borrar(txtpa.getText(), 3);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else{
						try {
							d.borrar(txtpa.getText(), 2);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}		
					}
				}else{
					JOptionPane.showMessageDialog(diccionario, "Elija un diccionario");		
				}
				JOptionPane.showMessageDialog(diccionario, "Su palabra ha sido agregada existosamente");
			}
		});
	}
	public void drawPrincipal(){
		principal=new JFrame();
		principal.getContentPane().setBackground(color);
		principal.getContentPane().setForeground(color2);
		principal.setSize(150,200);
		principal.setTitle("      Swittter      ");
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setLayout(new FlowLayout(FlowLayout.CENTER));
		bTweets=new JButton("     Ver Tweets     ");
		bDiccionario=new JButton(" Diccionarios");
		principal.add(new JLabel("     Swittter     "));
		bTweets.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawTweet();
				principal.dispose();
				tweets.setVisible(true);
			}
		});
		bDiccionario.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawDiccionario();
				principal.dispose();
				diccionario.setVisible(true);
			}
		});
		bcerrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				principal.dispose();
				System.exit(0);	
			}
		});
		principal.add(bTweets);
		principal.add(bDiccionario);
		principal.add(bcerrar);
		principal.setVisible(true);
	}
}