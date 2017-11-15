public class DemoTexto{
	public static void main(String[]args){
		LectorTexto lector = new LectorTexto();
		try{
			String texto = lector.leer();
			System.out.println(texto);
			//throw new NullPointerException();
		} catch(TextoVacioException e){
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Terminado");
		}
		System.out.println("Fuera del código de exception");
	}
}