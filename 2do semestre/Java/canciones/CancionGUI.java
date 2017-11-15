import javax.swing.*; //Controles de swing
import java.awt.*; //Eventos y layouts
import java.awt.event.*; //Manejador de eventos
import javax.swing.event.*; //Manejador de eventos de la lista

public class CancionGUI extends JFrame{
	JPanel pPrincipal, pBotones, pCentral, pDatos;
	JTextField txtNom, txtGenero, txtDur;
	JCheckBox cbftArtista;
	JList lbCanciones;
	DefaultListModel modeloCanciones;
	JButton bttnAgregar, bttnBorrar, bttnSalvar;

	//esta parte iría en comentarios al implementarla en MusicaGUI
	public static void main(String[] args){
		new CancionGUI().setVisible(true);
	}

	public CancionGUI(){
		inicializarComponentes();
	}

	public void inicializarComponentes(){
		setSize(600, 400);
		setTitle("Administración de Cacniones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Panel con los datos del artista
		pDatos = new JPanel(new GridLayout(4,2,10,10));

		pDatos.add(new JLabel("Nombre: "));
		txtNom = new JTextField();
		pDatos.add(txtNom);

		pDatos.add(new JLabel("Género: "));
		txtGenero = new JTextField();
		pDatos.add(txtGenero);

		pDatos.add(new JLabel("Duración: "));
		txtDur = new JTextField();
		pDatos.add(txtDur);

		cbftArtista = new JCheckBox("ft. Artista");
		pDatos.add(cbftArtista);

		//Panel con los datos y lista de las canciones
		pCentral = new JPanel(new FlowLayout());
		pCentral.add(pDatos);

		modeloCanciones = new DefaultListModel();
		lbCanciones = new JList(modeloCanciones);
		lbCanciones.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent evt){
				lbCancionesChanged();
			}
		});

		pCentral.add(new JScrollPane(lbCanciones));

		//Panel de los botones
		pBotones = new JPanel(new FlowLayout());

		bttnAgregar = new JButton("Agregar");
		bttnAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnAgregarClick();
			}
		});
		pBotones.add(bttnAgregar);

		bttnBorrar = new JButton("Borrar");
		bttnBorrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnBorrarClick();
			}
		});
		pBotones.add(bttnBorrar);

		bttnSalvar = new JButton("Salvar");
		/*bttnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnSalvarClick();
			}
		});*/
		pBotones.add(bttnSalvar);

		//Panel principal
		pPrincipal = new JPanel(new BorderLayout());
		pPrincipal.add(pCentral, BorderLayout.CENTER);
		pPrincipal.add(pBotones, BorderLayout.PAGE_END);
		add(pPrincipal);
	}

	public void bttnAgregarClick(){
		Cancion c = (Cancion)lbCanciones.getSelectedValue();
		if(c != null){
			c.nombre = txtNom.getText();
			c.genero = txtGenero.getText();
			c.duracion = Double.parseDouble(txtDur.getText());
			c.ftArtista = cbftArtista.isSelected();
		}
		else{
			c = new Cancion();
			c.nombre = txtNom.getText();
			c.genero = txtGenero.getText();
			c.duracion = Double.parseDouble(txtDur.getText());
			c.ftArtista = cbftArtista.isSelected();
			modeloCanciones.addElement(c);
		}
		lbCanciones.updateUI();
		txtNom.setText("");
		txtGenero.setText("");
		txtDur.setText("");
		cbftArtista.setSelected(false);
	}

	public void bttnBorrarClick(){
		int indice = lbCanciones.getSelectedIndex();
		modeloCanciones.remove(indice);
		lbCanciones.updateUI();
	}

	public void lbCancionesChanged(){
		Cancion c = (Cancion)lbCanciones.getSelectedValue();
		if(c!=null){
			txtNom.setText(c.nombre);
			txtGenero.setText(c.genero);
			txtDur.setText(c.duracion+"");
			cbftArtista.setSelected(c.ftArtista);
			bttnAgregar.setText("Modificar");
		}
		else{
			txtNom.setText(c.nombre);
			txtGenero.setText(c.genero);
			txtDur.setText(c.duracion+"");
			cbftArtista.setSelected(false);
			bttnAgregar.setText("Agregar");
		}
	}
}