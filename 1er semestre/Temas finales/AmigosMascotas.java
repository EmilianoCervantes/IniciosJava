import java.util.Scanner;

public class AmigosMascotas {
	public static void main (String[] args){
		String[] amigos = new String[5];
		int[][] meses;
		String res1, res2;
		int res3;

		meses = new int[5][];
		leerDatos(amigos,meses);
		res1= mayorTiempoVida(amigos,meses);
		System.out.println("La mascota que vivió más tiempo es: "+res1);
		res2= amigoConMasTiempoMascotas(amigos,meses);
		System.out.println("El amigo que ha tenido mayor tiempo mascotas es: "+res2);
		res3= tiempoVidaComun(meses);
		System.out.println("El tiempo más común de vida de las mascotas es: "+res3);
	}

	public static void leerDatos(String [] amigos, int[][] meses){
		Scanner sc= new Scanner(System.in);
		int tiempo, NumMascotas;
		String amigo;

		for(int i=0;i<amigos.length;i++){
			System.out.print("Dame el nombre de tu amigo "+(i+1)+": ");
			amigo=System.console().readLine();
			amigos[i]=amigo;
			System.out.print("¿Cuántas mascotas ha tenido tu amigo? ");
			NumMascotas=Integer.parseInt(System.console().readLine());
			meses[i]= new int [NumMascotas];

			for(int j=0;j<NumMascotas;j++){
				//Se pide el tiempo de vida:
				System.out.print("Meses de vida de la mascota "+(j+1)+": ");
				meses[i][j]=Integer.parseInt(System.console().readLine());
			}

		System.out.println();
		}
		System.out.println();

	}

	public static String mayorTiempoVida (String[] amigos, int[][] meses) {
		int mayor=0;
		String amigo= "";

		for(int i=0;i<meses.length;i++){
			for(int j=0;j<meses[i].length;j++){
				if (meses[i][j] > mayor){
					mayor= meses[i][j];
					amigo = amigos[i];
				}
			}
		}
		return amigo;
	}

	public static String amigoConMasTiempoMascotas (String[] amigos, int[][] meses) {
		int tiempo=0, mayor=0;
		String amigo = "";

		for(int i=0;i<meses.length;i++){
			for(int j=0;j<meses[i].length;j++){
				tiempo+=meses[i][j];
			}
				if (tiempo > mayor){
					mayor = tiempo;
					amigo = amigos[i];
			}
		}
		return amigo;
	}

	public static int tiempoVidaComun(int[][] meses){
		int [] mesesMascota = new int[900];
		int mayor=0, posicion=0;

		for(int i=0;i< meses.length;i++){
			for(int j=0;j<meses[i].length;j++){
				mesesMascota[meses[i][j]]++;
			}
		}

		for(int i=0;i<900;i++){
			if(mesesMascota[i] > mayor){
				mayor=mesesMascota[i];
				posicion=i;
			}
		}

		return mayor;
	}
}