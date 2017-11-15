/* Primero te da la bienvenida el programa.
	Despu�s te pide los valores de HCM, reticulocitos,linfocitos y monocitos.
	Posteriormente comprueba si cada valor est� dentro del rango normal o no.
	Finalmente dice si est�s bien en cada �rea y finalmente en general.

*/
public class Analizador {
	public static void main (String[] args) {
		int HCM, linfocitos, monocitos;
		double reticulocitos;
		String texto;
		//HCM 27 - 34
		// Reticulocitos: 0.5% - 1.5%
		// Linfocitos: 12 - 46
		// Monocitos 1 - 13

		System.out.println("Bienvenido al analizador de c�lulas sangu�neas.");

		System.out.println("Dame el n�mero de Hemoglobina corpuscular media");
		texto = System.console().readLine();
		HCM = Integer.parseInt(texto);

		System.out.println("�Qu� porcentaje, en decimales, de reticulocitos tienes?");
		texto = System.console().readLine();
		reticulocitos = Double.parseDouble(texto);

		System.out.println("Dame tu n�mero de linfocitos");
		texto = System.console().readLine();
		linfocitos = Integer.parseInt(texto);

		System.out.println("Dame tu n�mero de monocitos");
		texto = System.console().readLine();
		monocitos = Integer.parseInt(texto);

		System.out.println("�Est�s sano?");
		System.out.print("N�mero normal de HCM ");
		System.out.println((HCM>=27)&(HCM<=34));
		System.out.print("Porcentaje normal de reticulocitos ");
		System.out.println((reticulocitos>=0.005)&(reticulocitos<=.015));
		System.out.print("N�mero normal de Linfocitos ");
		System.out.println((linfocitos>=12)&(linfocitos<=46));
		System.out.print("N�mero normal de monocitos ");
		System.out.println((monocitos>=1)&(monocitos<=13));
		System.out.print("�Est�s sano ?");
		System.out.println(((HCM>=27)&(HCM<=34))&((reticulocitos>=0.005)&(reticulocitos<=.015))&((linfocitos>=12)&(linfocitos<=46))&((monocitos>=1)&(monocitos<=13)));
	}
}