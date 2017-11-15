public class DemoLogica {
	public static void main (String[] args) {
		boolean llueve, haceFrio;
		String texto;

		System.out.print("Llueve (true/false)? ");
		texto = System.console().readLine();
		llueve = Boolean.parseBoolean(texto);
		System.out.print("Hace frío (true/false)? ");
		texto = System.console().readLine();
		haceFrio = Boolean.parseBoolean(texto);

		System.out.println(llueve ^ haceFrio);
		System.out.println(llueve | haceFrio);
		System.out.println(llueve & haceFrio);
		System.out.println(!llueve);
		System.out.println(!haceFrio);
	}
}
