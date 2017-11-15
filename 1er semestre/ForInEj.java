public class ForInEj{
	public static void main (String[] args){
		int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		int suma=0;
		//for (tipoDeElemento variableIterativa : coleccion)
		for (int numero : numeros) {
			suma += numero;
		}
		System.out.println(suma);
	}
}