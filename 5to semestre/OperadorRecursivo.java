import javax.swing.JOptionPane;

public  class OperadorRecursivo{
	public static void main(String[] args){
		String cadena = JOptionPane.showInputDialog("Dame una cadena: ");
		System.out.println(perteneceLenguaje(cadena));
	}

	public static String perteneceLenguaje(String cadena){
		String u, residuo;
		if(cadena.length()==0){
			return "No enviaste nada";
		}else{
			u = String.valueOf(cadena.charAt(cadena.length()-2) + cadena.charAt(cadena.length()-1));
			return "";
		}
	}
}