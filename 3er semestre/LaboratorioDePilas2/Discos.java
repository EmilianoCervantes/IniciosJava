import javax.swing.JOptionPane;
public class Discos <T>{
	public static void main (String [] args ){
		int n= Integer.parseInt(JOptionPane.showInputDialog("Cuantos nombres daras: "));
		String [] expr= new String[n];
		for(int i=0;i<expr.length;i++){
			expr[i]= JOptionPane.showInputDialog("Dame una oración: ");
		}
		sort(expr,n);
	}

	private static void sort(String []expr, int n) {
		Stack<String> principal = new Stack<String>(n);
		Stack<String> aux = new Stack<String>(n);
		for(int i=0;i<n;i++){
			if(principal.isEmpty()||principal.peek().compareTo(expr[i])<=0){
				principal.push(expr[i]);
			}else{
					boolean hastaaqui=true;
					while(hastaaqui){
						if(principal.isEmpty()||principal.peek().compareTo(expr[i])<0){
							hastaaqui=false;
						}else{aux.push(principal.pop());}
					}
					principal.push(expr[i]);
					while(aux.isEmpty()==false){
						principal.push(aux.pop());
					}
				
			}
		}
		while(principal.isEmpty()==false){
			System.out.println(principal.pop());
		}
	}
}
