//Irvin Uriel Mundo Rivera A01333820 Emiliano Cervantes del Valle A01332891
import javax.swing.JOptionPane;
public class TestPalindromo{
	

	public static void main(String args[]){
		
		int num;
		Palindromo p = new Palindromo();
		System.out.println( p.esPalindromo(899) ); //false
		System.out.println( p.esPalindromo(484) ); //true
		num=Integer.parseInt(JOptionPane.showInputDialog("Cuantos digitos quiere que su numero tenga"));
		System.out.println(p.generaPalindromo(num));
		num=Integer.parseInt(JOptionPane.showInputDialog("Cuantos digitos quiere que su numero binario tenga"));
		System.out.println(p.generaPalindromoBinario(num));
		System.out.println(p.laSumaEsPalindromo(325, 123));//false
	}


}