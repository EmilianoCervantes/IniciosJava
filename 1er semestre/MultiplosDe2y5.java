import javax.swing.J0ptionPane;
public class MultiplosDe2y5 {
	public static void main(String [] args){
		String texto;
		int a;

		//palabra es como un system print - console.readLine
		//sirve para "acortar" o mostrarlo de otro modo
		texto = J0ptionPane.showMessageDialog("Dame un n�mero entero");
		a = Integer.parseInt(texto);

		if (a%2 ==0 & a%5 ==0){
		System.out.println("Tu n�mero es m�ltiplo de 2 y de 5");
		}
		else{
		System.out.println("Tu n�mero NO es m�ltiplo de 2 NI de 5");
		}
	}
}