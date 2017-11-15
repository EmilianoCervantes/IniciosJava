import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal extends JFrame{
	//JFrames
	public JFrame principal;
	public JFrame clientes;
	//JButtons
	public JButton bClientes;
	public JButton bMostrar;
	public JButton bAgregar;
	public JButton bBorrar;
	public JButton bModificar;
	//General
	public JButton bCerrar = new JButton("Cerrar");
	public JButton bRegresar = new JButton("Regresar");
	public JPanel p;
	public JTextField txtClientes = new JTextField(10);
	public JList lClientes;
	//Otros
	int r=(int) (Math.random()*255+1), g= (int) (Math.random()*255+1),b=(int)(Math.random()*255+1);
	public Color color=new Color(r,g,b);
	public Color color2=new Color(255-r,255-g ,255-b);
	public String s;
	
	public static void main(String[] args){
		new Principal();
	}
	public Principal(){
		crearPrincipal();
	}
	
	public void crearPrincipal(){
		principal = new JFrame();
		principal.getContentPane().setBackground(color);
		principal.getContentPane().setForeground(color2);
		principal.setSize(300,400);
		principal.setTitle("      Principal      ");
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setLayout(new FlowLayout(FlowLayout.CENTER));
		bClientes = new JButton("     Ver Clientes     ");
		
		principal.add(new JLabel("     Principal     "));
		bClientes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				crearClientes();
				principal.dispose();
				clientes.setVisible(true);
			}
		});
		bCerrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				principal.dispose();
				System.exit(0);
			}
		});
		principal.add(bClientes);
		principal.add(bCerrar);
		principal.setVisible(true);
	}
	
	public void crearClientes(){
		clientes = new JFrame();
		clientes.getContentPane().setBackground(color);
		clientes.getContentPane().setForeground(color2);
		clientes.setSize(800,400);
		clientes.setTitle("Lista de clientes");
		clientes.setLayout(new BorderLayout());
		JPanel izquierda = new JPanel();
		izquierda.setLayout(new GridLayout(3,1,5,5));
		clientes.add(new JLabel("Elija un cliente a modificar"), BorderLayout.NORTH);
		clientes.add(izquierda, BorderLayout.WEST);
		bMostrar = new JButton("Mostrar");
		bAgregar=new JButton("Agregar");
		bBorrar=new JButton("Borrar");
		bRegresar=new JButton("Regresar");	
		p = new JPanel();
		p.add(new JLabel("Escriba su cliente a agregar"));
		p.add(txtClientes);
		p.add(bMostrar);
		p.add(bAgregar);
		p.add(bBorrar);
		p.add(bRegresar);
		p.setBackground(color);
		clientes.add(p,BorderLayout.SOUTH);
		lClientes = new JList(new DefaultListModel());
		lClientes.setBackground(Color.WHITE);
		clientes.add(new JScrollPane(lClientes));
		Cliente c = new Cliente();
		bRegresar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clientes.dispose();
				crearPrincipal();
				principal.setVisible(true);
			}
		});
		bAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					c.agregar(txtClientes.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(clientes, "Su cliente ha sido agregado existosamente");
			}
		});
		bMostrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lClientes.setModel(c.mostrar(new DefaultListModel()));
				lClientes.setBackground(Color.WHITE);
				lClientes.updateUI();
			}
		});
		bBorrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					c.borrar(txtClientes.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(clientes, "Su cliente ha sido borrado existosamente");
			}
		});
	}
}
