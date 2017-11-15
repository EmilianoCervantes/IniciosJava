import javax.swing.*;
import java.util.*;

public class main {
	public static void main(String s[]){
		String p= JOptionPane.showInputDialog("Dame una oración: ");
		
		
		Stack<String> letras = new Stack<String>(100);
		
		/*for(int i=0;i<p.length();i++){
			letras.push(p.charAt(i));
		}
		
		*/
		String hola="";
		for(int i=0;i<p.length();i++){
			String aux = String.valueOf(p.charAt(i));
			if(aux.equals(" ")){
				letras.push(hola);
				hola="";
			}else{
				hola+=p.charAt(i);
			}
		}
		letras.push(hola);
		while(!letras.isEmpty()){
			System.out.println(letras.pop());
		}
	}
}
