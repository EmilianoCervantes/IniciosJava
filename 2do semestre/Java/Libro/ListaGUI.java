import javax.swing.*;
import javax.swing.event.*;

public class ListaGUI extends JFrame{
	private JList lista;
	private DefaultListModel modelo;

	public static void main(String[]args){
		new ListaGUI().setVisible(true);
	}

	public ListaGUI(){
		inicializarComponentes();
	}

	private void inicializarComponentes(){
		setSize(400,400);
		setTitle("Lista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		modelo=new DefaultListModel();
		modelo.addElement("Eduardo");
		modelo.addElement("David");
		modelo.addElement("Jose");
		modelo.addElement("Karen");
		modelo.addElement("Allan");

		lista=new JList(modelo);
		lista.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent evt){
				String v=(String)lista.getSelectedValue();
				JOptionPane.showMessageDialog(null,v);
			}
		});
		add(lista);
	}
}