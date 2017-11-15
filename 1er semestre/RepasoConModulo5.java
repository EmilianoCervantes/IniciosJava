public class RepasoConModulo5 {
	public static void main(String[] args){
		int i=1;
		do {
			if (i%5 == 0){
				System.out.println(i);
				break;
			}
			i *= 2;
		} while (i<100);
		System.out.println(i);
	}
}