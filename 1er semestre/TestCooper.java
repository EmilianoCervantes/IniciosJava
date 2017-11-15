public class TestCooper {
	public static void main (String[] args) {
		boolean conocer, trenes, fisica, interacSociales, china, mascotas;
		String texto;

		System.out.print("1. ¿Me conoces? (true/false)");
			texto = System.console().readLine();
			conocer = Boolean.parseBoolean(texto);
		System.out.print("2. ¿Te gustan los trenes? (true/false)");
			texto = System.console().readLine();
			trenes = Boolean.parseBoolean(texto);
		System.out.print("3. ¿Crees que la profesión más importante es la física? (true/false)");
			texto = System.console().readLine();
			fisica = Boolean.parseBoolean(texto);
		System.out.print("4. ¿Te interesan las interacciones sociales? (true/false)");
			texto = System.console().readLine();
			interacSociales = Boolean.parseBoolean(texto);
		System.out.print("5. ¿Te gusta la comida china? (true/false)");
			texto = System.console().readLine();
			china = Boolean.parseBoolean(texto);
		System.out.print("6. ¿Te gustan las mascotas? (true/false)");
			texto = System.console().readLine();
			mascotas = Boolean.parseBoolean(texto);

		System.out.print("Eres mi amigo ");
		System.out.println(trenes & fisica & !interacSociales & !mascotas & (conocer) | (china));
	}
}