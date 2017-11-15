
public class OperacionesRecursivas {
	public static void main(String args[]){
		OperacionesRecursivas op = new OperacionesRecursivas();
		
		System.out.println( op.suma(5,6));
		System.out.println( op.resta(5,6));
		System.out.println( op.multi(5,6));
		System.out.println( op.division(5,6));
		System.out.println( op.modulo(5,6));
		System.out.println( op.potencia(5,6));
	}
	
	public int suma(int a, int b){
		if(b==0)
			return a;
		else
			return suma(a+1, b-1);
	}
	
	public int resta(int a, int b){
		if(b==0)
			return a;
		else
			return resta(a-1, b-1);
	}
	public int multi(int a, int b){
		if(b==1)
			return a;
		else
			return a+multi(a,b-1);
	}
	
	public int division(int a, int b){
		if(a<b)
			return 0;
		else
			return 1+division(a-b, b);
	}
	
	public int modulo(int a, int b){
		if(a<b)
			return a;
		else
			return modulo(a-b, b);
	}
	
	public int potencia(int a, int b){
		if(b==0)
			return 1;
		else
			return a*potencia(a, b-1);
	}
	
}
