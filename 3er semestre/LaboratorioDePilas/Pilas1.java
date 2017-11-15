import javax.swing.JOptionPane;
public class Pilas1 <T>{
	public static void main (String [] args ){

		String expr= JOptionPane.showInputDialog("Dame una oración: ");	
		System.out.println(conta(expr));
	}
	private static boolean conta (String expr) {
		Stack<String> hola = new Stack<String>(expr.length());
		for(int i=0;i<expr.length();i++){
			switch(expr.charAt(i)){
			case '[':
			case '{':
			case '(':
				hola.push(String.valueOf(expr.charAt(i)));
				break;
			case ']':
				if(encontrar(hola, expr,i,'[')){
					quitar(hola, expr,i,'[');
				}else{
					return false;
				}
				break;
			case '}':
				if(encontrar(hola, expr,i,'{')){
					quitar(hola, expr,i,'{');
				}else{
					return false;
				}
				break;
			case ')':
				if(encontrar(hola, expr,i,'(')){
					quitar(hola, expr,i,'(');
				}else{
					return false;
				}
				break;
			default: break;
			}
		}
		if(hola.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	private static Stack quitar(Stack<String> hola, String expr, int i, char car) {
		
		Stack<String>auxiliar= new Stack<String>(expr.length());
		while(hola.isEmpty()==false){
			String aux=hola.peek();
			if(aux.equals(String.valueOf(car))){
				hola.pop();
				rellenar(auxiliar, hola);
				return hola;
			}else{
				if(hola.isEmpty()==false){
					auxiliar.push(hola.peek());
					hola.pop();
				}
			}
		}		
		return hola;
	}
	private static boolean encontrar(Stack<String> hola, String expr, int i, char car) {
		boolean encontrar=false;
		Stack<String>auxiliar= new Stack<String>(expr.length());
		while(hola.isEmpty()==false){
			String aux=hola.peek();
			if(aux.equals(String.valueOf(car))){
				encontrar=true;
				return encontrar;
			}else{
				if(hola.isEmpty()==false){
					auxiliar.push(hola.peek());
					hola.pop();
				}
			}
		}		
		return encontrar;
	}
	private static Stack rellenar(Stack<String> auxiliar, Stack<String> hola) {
		while(auxiliar.isEmpty()==false){
			hola.push(auxiliar.peek());
			auxiliar.pop();
		}
		return  hola;
	}
}