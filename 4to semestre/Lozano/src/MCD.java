//maximo comun divisor
public class MCD {
	public static int[] euclides(int a, int b, int c){
		int a=1, b=16720, c=-19713;
		int[] x = new int[3];
		if(b==0){
			return x;
		}else{
			b=b%c;
			euclides(a, b, c);
		}
	}
}