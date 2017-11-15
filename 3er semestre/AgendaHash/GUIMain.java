import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class GUIMain extends JFrame{
	
	private JLabel txtTitulo, ldeci;
	public JButton bAgregar, bModificar, bMostrar, bBuscar, bBorrar;
	private Color colorcito= new Color(140,80,255);
	private JPanel panel;
	public HashTable<Contacto,CircularDoubleLinkedList<Contacto>> agenda =new HashTable(10);
	public CircularDoubleLinkedList<Contacto> lista = new CircularDoubleLinkedList();
	public int  id=(int)Math.random()*10;
	
	
	public static void main (String [] args){
		
		new GUIMain().setVisible(true);
	}
	public GUIMain(){
		Contacto.tipoFuncion=(Integer.parseInt(JOptionPane.showInputDialog("Escriba el número del tipo de función Hash que desea aplicar a esta agenda")));
		
		draw();
	}
	public void agregar(HashTable<Contacto, CircularDoubleLinkedList<Contacto>> agenda,CircularDoubleLinkedList<Contacto> lista) {
		String nombre=JOptionPane.showInputDialog("Escriba su nombre");
		int tel=Integer.parseInt(JOptionPane.showInputDialog("Escriba su nombre"));
		Contacto contacto = new Contacto(nombre, tel);
		lista.addFirst(contacto);
		agenda.put(contacto,lista);

		
	}
	public void modificar() {
		CircularDoubleLinkedList<Contacto> llaves= agenda.keys();
		for(int i=0;i<llaves.size();i++){
			Contacto c = new Contacto(llaves.get(i).getNom(),llaves.get(i).getTel());
			String modificar=JOptionPane.showInputDialog("Elemento modificable");
			if(c.nombre.equals(modificar.toString())){
				
				c.setNom(JOptionPane.showInputDialog("Nuevo Nombre"));
				
				c.setTel(Integer.parseInt(JOptionPane.showInputDialog("Telefono nuevo")));
			}
		}
	}
	public boolean buscar(){
		CircularDoubleLinkedList<Contacto> llaves = agenda.keys();
		String busqueda=JOptionPane.showInputDialog("Elemento a buscar");	
		for(int i=0;i<llaves.size();i++){
			Contacto c = new Contacto(llaves.get(i).getNom(),llaves.get(i).getTel());
			if(c.getNom().equals(busqueda)){
				return true;
			}
		}
		return false;

	}
	public void borrar(){
		CircularDoubleLinkedList<Contacto> llaves= agenda.keys();
		for(int i=0;i<llaves.size();i++){
			Contacto c= new Contacto(llaves.get(i).getNom(),llaves.get(i).getTel());
			if(c.getNom().equals(JOptionPane.showInputDialog("Elemento a eliminar"))){
				agenda.eliminar(c);
			}
		}
	}
	public void draw(){
		setSize(200,200);
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(6,1));
		getContentPane().setBackground(colorcito);
		txtTitulo= new JLabel("Bienvenido a la agenda");
		txtTitulo.setBackground(colorcito);
		add(txtTitulo);
		bAgregar=new JButton("Agregar");
		bModificar=new JButton("Modificar");
		bMostrar=new JButton("Mostrar");
		bBuscar=new JButton("Buscar");
		bBorrar=new JButton("Borrar");
		add(bAgregar);
		add(bModificar);
		add(bMostrar);
		add(bBuscar);
		add(bBorrar);
		
		
		bAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				agregar(agenda, lista);
			}

			
		});
		bMostrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(agenda);
			}
		});
		bModificar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				modificar();
				
			}
		});
		bBuscar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(buscar()==false){
					System.out.println(false);
				}else{
					System.out.println(true);
				}
				
			}
		});
	}
	
		
	
}
