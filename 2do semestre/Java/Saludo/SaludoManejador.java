import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//utilizaremos JTextField y JLabel:
import javax.swing.*;


public class SaludoManejador implements ActionListener{
	public JTextField txtNombre, txtApellidos;
	public JLabel lblSaludo;
	public void actionPerformed(ActionEvent evt){
		String nombre = txtNombre.getText();
		String apelldios = txtApellidos.getText();
		//así como getText es para leer, setText es para escribir
		lblSaludo.setText("Que tal "+nombre+" "+apelldios);
	}
}