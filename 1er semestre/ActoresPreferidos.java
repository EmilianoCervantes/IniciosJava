//Termina cuando se ingresa un nombre vacío
public class ActoresPreferidos {
	public static void main (String[] args){
		String[] a;
		String actor;
		boolean res;

		a= leerActores();

		System.out.print("Buscar actor: ");
		actor = System.console().readLine();

		res= buscarActor(actor, a);
		System.out.println("Actor en lista: "+ res);
	}

	public static String[] leerActores() {
		String[] actores, resultado;
		int cont=0;

		actores = new String[1000];

		do{
			System.out.print("Nombre del actor "+(cont+1)+ " ");
			actores[cont] = System.console().readLine();
			cont++;
		} while(actores[cont-1].equals("") == false); //ó != True

		resultado=new String[cont-1];
		for(int i=0;i<resultado.length;i++){
			resultado[i] = actores[i];
		}

		return resultado;
	}

	public static boolean buscarActor(String actor, String[] lista){
		boolean res = false;

		/*for(int i=0; i<lista.length; i++){
			if(lista[i].equals(actor)){
				res = true; }
		}*/

		//Esto es un for in:
		for(String a : lista) {
			res |= a.equals(actor);
		}

		return res;
	}
}