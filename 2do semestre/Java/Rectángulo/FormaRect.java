public class FormaRect{
	public static void main(String[] args){
		int i;
		for(i=1;i<3;i++){
			Rectangle recti = new Rectangle();
			recti.altura=i*7;
			recti.ancho=i*6;
			System.out.println("Rectángulo "+i+" "+recti);
		}

	}
}