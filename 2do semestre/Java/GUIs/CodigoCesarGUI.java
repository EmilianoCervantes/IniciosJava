import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class CodigoCesarGUI extends JFrame{
	private JLabel lblTexto, lblCodigo, lblCodigo2, lblDecod, lblDecod2, lblCodif, lblCesar;
	private JTextField txtTexto;
	private JButton btnCesar;
	private JPanel pCesar;

	public CodigoCesarGUI(){
		generarCodigo();
	}

	private void generarCodigo(){
		setTitle("Codigo César");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Grid lineas, columnas, espacioHor, espVer
		GridLayout layout = new GridLayout(4, 2, 5, 5);
		pCesar = new JPanel(layout);
		add(pCesar);

		//Con los dos primeros generas el nombre
		lblTexto = new JLabel("Dame un texto: ");
		pCesar.add(lblTexto);
		txtTexto = new JTextField();
		pCesar.add(txtTexto);

		/*lo podríamos obtener nosotros de la longitud
		del texto que nos mandaran
		lblCorrim = new JLabel("Dame el corrimiento: ");
		pCesar.add(lblTexto);
		txtCorrimiento = new JTextArea();
		pCesar.add(txtTexto);*/

		lblCodigo = new JLabel("Código: ");
		pCesar.add(lblCodigo);
		lblCodigo2 = new JLabel("");
		pCesar.add(lblCodigo2);

		lblDecod = new JLabel("Decodificación: ");
		pCesar.add(lblDecod);
		lblDecod2 = new JLabel();
		pCesar.add(lblDecod2);

		/*lblCodif = new JLabel("");
		pCesar.add(lblCodif);*/
		btnCesar = new JButton("Código César");

		btnCesar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String text;
				int corrimiento;
				CodigoCesar cc = new CodigoCesar();
				text = txtTexto.getText();
				corrimiento = text.length();
				lblCodigo2.setText("Código: "+cc.codificar(text, corrimiento));
				lblDecod2.setText("Código: "+cc.decodificar(text, corrimiento));
			}
		});
		pCesar.add(btnCesar);
	}
}