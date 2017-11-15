/*Para tablamultitodo(n), tablasumatodo(n) y tablarestatodo(n); se va a crear un main
con todos los dígitos y luego se van a pedir en cada tabla*/
public class TablasdeOperaciones2{
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			System.out.println("Tabla del "+i);
			tablasmulti(i);
			tablassuma(i);
			tablasresta(i);
		}
		System.out.println();
	}
	public static void tablasmulti(i){
		for(int i=1;i<=10;i++){
			System.out.println(numero + " * "+i+" = "+ (numero*i));
		}
		System.out.println();
	}
	public static void tablassuma(i){
		for(int i=1;i<=10;i++){
			System.out.println(numero + " + "+i+" = "+ (numero+i));
		}
		System.out.println();
	}
	public static void tablasresta(i){
		for(int i=1;i<=10;i++){
			System.out.println(numero + " - "+i+" = "+ (numero-i));
		}
		System.out.println();
	}
}