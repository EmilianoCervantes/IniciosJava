import javax.swing.JOptionPane;
public class InversionCadenaRecursivo2 {
	public static void main (String [] args){
		String cadena = JOptionPane.showInputDialog("Dame una cadena");
		System.out.println(inver(cadena));
	}
	public static String inver(String cadena){
		if(cadena.length()>0){
			return String.valueOf(cadena.charAt(cadena.length()-1)+inver(cadena.substring(0, cadena.length()-1)));
		}else{
			return "";
		}
	}
}