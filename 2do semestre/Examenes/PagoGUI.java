import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class PagoGUI extends JFrame{
	private JLabel lblAdeudo;
	private JTextField txtPersona, txtMonto, txtFechaPago, txtAdeudo;
	private JButton bttnPagar;
	private JPanel pPago;
	private int pers=0;

	public static void main(String[]args){
		new PagoGUI().setVisible(true);
	}

	public PagoGUI(){
		generarPago();
	}

	private void generarPago(){
		setTitle("Pagos");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pPago = new JPanel(new GridLayout(5, 2, 5, 5));
		add(pPago);

		//Datos
		pPago.add(new JLabel("Perosna: "));
		txtPersona = new JTextField();
		pPago.add(txtPersona);

		pPago.add(new JLabel("Monto de Pago: "));
		txtMonto = new JTextField();
		pPago.add(txtMonto);

		pPago.add(new JLabel("Fecha del pago(dd/mm/aaaa): "));
		txtFechaPago = new JTextField();
		pPago.add(txtFechaPago);

		pPago.add(new JLabel("¿Tiene adeudo?(si/no)"));
		txtAdeudo = new JTextField();
		pPago.add(txtAdeudo);

		//Mostrar adeudo
		lblAdeudo=new JLabel("");
		pPago.add(lblAdeudo);

		//botón
		bttnPagar = new JButton("Agregar Pago");
		bttnPagar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				bttnAgregarClicked();
			}
		});
		pPago.add(bttnPagar);
	}

	public void bttnAgregarClicked(){
		Pago p = new Pago();
		String nomP=txtPersona.getText();
		//p.condos[pers][0].nombre=nomP;
		//condos[pers][1].dir
		double monto=Double.parseDouble(txtMonto.getText());
		String adeudo=txtAdeudo.getText();
		double adeudoM=0.0;
		if(adeudo=="si"){
			adeudoM=(monto*1.1);
			txtAdeudo.setText(adeudoM+"");
		}
		else{
			txtAdeudo.setText(monto+"");
		}
		pers++;
	}
}