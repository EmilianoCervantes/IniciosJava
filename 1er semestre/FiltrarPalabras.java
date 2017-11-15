/* Pediremos al usuario que ingrese un número, con base en él, el numero de
 palabras. Luego le pedimos una letra y con base en ella, las palabras que
 inicien con aquella letra.
 (int)Math.sqrt(numero)
*/
public class FiltrarPalabras {
	public static void main(String[] args){
		char letra;
		int num;

		System.out.print("¿Cuántas palabras deseas ingresar? ");
		num = Integer.parseInt(System.console().readLine());
		System.out.println();
		System.out.print("Dame una letra: ");
		letra= System.console().readLine().charAt(0);
		System.out.println();
		filtrarPabalbras(num, letra);

	}

	public static void filtrarPabalbras(int num, char letra){
		String[] palabras= new String[num];
		String[] filtro= new String[num];
		int i, cont=0;
		for(i=0;i<num;i++){
			System.out.print("Dame la palabra "+(i+1)+": ");
			palabras[i]= System.console().readLine();
			if(palabras[i].charAt(0)==letra){
				//ponemos filtro[cont] porque el contador puede ser menor a i
				filtro[cont]=palabras[i];
				cont++;
			}
		}
		System.out.println();

		System.out.println("Las palabras que inician con la letra son:");
		for(i=0;i<cont;i++){
			System.out.println(filtro[i]);
		}
	}
}