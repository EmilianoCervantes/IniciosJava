/*Vamos a almacenar el album, después pedimos y posteriormente reordenamos las canciones. Al final imprimimos el nuevo orden*/
public class AlbumArrayOrdenarRandom {
	public static void main(String[] args){
		int canciones, random, i, j;
		String [] AlbumOri;
		int [] AlbumAux;

		System.out.println("Bienvenido, vamos a ingresar un album de canciones");
		System.out.println();

		System.out.println("Vas a ingresar canción por canción en orden del album");
		System.out.println();

		System.out.print("¿Cuántas canciones contiene el album?  ");
		canciones= Integer.parseInt(System.console().readLine());
		System.out.println();
		AlbumOri = new String[canciones];
		AlbumAux = new int[canciones];

		for(i=0;i<canciones;i++){
			System.out.println("Ingresa la canción "+(i+1)+": ");
			AlbumOri[i]=System.console().readLine();
			AlbumAux[i] = -1;
		}
		System.out.println();

		//canciones es como album.length
		i=0;
		System.out.println("Las canciones en modo aleatorio son: ");
		do{
			random=(int)Math.round(Math.random()*(canciones-1));//AlbumOri.length-1));
			boolean impreso=false;
			for(j=0;j<canciones;j++){
				if(random==AlbumAux[j]){
					impreso=true;
				}
			}
			//Si no se repite, es decir es false, !impreso permite que se ejecute el if
			//si es if(false), entonces no corre
			if(!impreso){
				System.out.println(AlbumOri[random]);
				AlbumAux[i]=random;
				i++;
			}
		}while(i<canciones);

		for(i=0;i<canciones-1;i++){
			if(AlbumAux[i+1]-AlbumAux[i]==1){
				System.out.println("En modo aleatorio, las canciones "+AlbumAux[i+1]+" y "+AlbumAux[i+2]+" son consecutivas.");
			}
		}
	}
}