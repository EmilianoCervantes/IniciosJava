import javax.swing.*; //Controles de swing
import java.awt.*; //Eventos y layouts
import java.awt.event.*; //Manejador de eventos
import javax.swing.event.*; //Manejador de eventos de la lista

public class ArtistaGUI extends JFrame{
	JPanel pPrincipal, pBotones, pCentral, pDatos;
	JTextField txtNombre, txtNacionalidad, txtEdad;
	JCheckBox cbSolista;
	JList lbArtistas;
	DefaultListModel modeloArtistas;
	JButton bttnAgregar, bttnBorrar, bttnSalvar;

	/*public static void main(String [] args){
		new ArtistaGUI().setVisible(true);
	}*/

	public ArtistaGUI(){
		inicializarComponentes();
	}

	public void inicializarComponentes(){
		setSize(600, 400);
		setTitle("Administración de Artistas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Panel con los datos del artista
		pDatos = new JPanel(new GridLayout(4,2,10,10));
		//filas, columnas, separación
		pDatos.add(new JLabel("Nombre: "));
		txtNombre = new JTextField();
		pDatos.add(txtNombre);

		pDatos.add(new JLabel("Nacionalidad: "));
		txtNacionalidad = new JTextField();
		pDatos.add(txtNacionalidad);

		pDatos.add(new JLabel("Edad: "));
		txtEdad = new JTextField();
		pDatos.add(txtEdad);

		cbSolista = new JCheckBox("Solista");
		pDatos.add(cbSolista);

		//Panel central con los datos y la lista de artistas
		pCentral = new JPanel(new FlowLayout());
		pCentral.add(pDatos);

		modeloArtistas = new DefaultListModel();
		lbArtistas = new JList(modeloArtistas);
		lbArtistas.addListSelectionListener(new ListSelectionListener(){
			//esto se puso para que cuando se seleccione, nos muestre sus datos
			public void valueChanged(ListSelectionEvent evt){
				lbArtistasChanged();
			}
		});

		pCentral.add(new JScrollPane(lbArtistas));

		//Panel de botones
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
		pBotones.add(bttnSalvar);

		//Panel principal
		pPrincipal = new JPanel(new BorderLayout());
		pPrincipal.add(pCentral, BorderLayout.CENTER);
		pPrincipal.add(pBotones, BorderLayout.PAGE_END);
		//decirle en donde acomoda los paneles
		add(pPrincipal);
	}

	public void bttnAgregarClick(){
		Artista a = (Artista)lbArtistas.getSelectedValue();
		if(a != null){
			a.nombre = txtNombre.getText();
			a.nacionalidad = txtNacionalidad.getText();
			a.edad = Integer.parseInt(txtEdad.getText());
			a.solista = cbSolista.isSelected();
			//regresa verdadero o falso
		}
		else{
			a = new Artista();
			a.nombre = txtNombre.getText();
			a.nacionalidad = txtNacionalidad.getText();
			a.edad = Integer.parseInt(txtEdad.getText());
			a.solista = cbSolista.isSelected();
			modeloArtistas.addElement(a);
		}
		lbArtistas.updateUI();
		txtNombre.setText("");
		txtNacionalidad.setText("");
		txtEdad.setText("");
		cbSolista.setSelected(false);
	}

	public void bttnBorrarClick(){
		//Obtener el elemento seleccionado
		int indice = lbArtistas.getSelectedIndex();
		//Borrarlo de la lista
		modeloArtistas.remove(indice);
		lbArtistas.updateUI();
	}

	public void lbArtistasChanged(){
		Artista a = (Artista)lbArtistas.getSelectedValue();
		if(a != null){
			txtNombre.setText(a.nombre);
			txtNacionalidad.setText(a.nacionalidad);
			txtEdad.setText(a.edad+"");
			cbSolista.setSelected(a.solista);
			bttnAgregar.setText("Modificar");
		}
		else{
			txtNombre.setText("");
			txtNacionalidad.setText("");
			txtEdad.setText("");
			cbSolista.setSelected(false);
			bttnAgregar.setText("Agregar");
		}
	}
}