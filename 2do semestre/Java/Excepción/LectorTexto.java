public class LectorTexto{
	public String leer() throws TextoVacioException{
		String texto;
		System.out.print("Dame un texto: ");
		texto = System.console().readLine();
		if(texto.length()==0){
			throw new TextoVacioException("El texto esta vac�o.");
		}
		return texto;
	}
}