public class Peliculas{
	public static void main(String[] args){
		/*
		String nombre, genero, clasificacion;
		double duracion;
		Date fecha, hora;
		*/
		int i, j;
		String[][] peliculas = new String [1][4];

		System.out.println("Bienvenido");
		System.out.println("Vamos a ingresar los datos de dos pel�culas");
		System.out.println();

		for(i=0;i<2;i++){
			System.out.println("Ingresa los datos de la pel�cula "+(i+1));
			System.out.print("Nombre: ");
			peliculas[i]=System.console().readLine();
			System.out.print("Genero: ");
			peliculas[i][0]=System.console().readLine();
			System.out.print("Duraci�n: ");
			peliculas[i][1]=System.console().readLine();
			System.out.print("Clasificaci�n: ");
			peliculas[i][2]=System.console().readLine();
			System.out.print("Fecha(DD/MM/AA): ");
			peliculas[i][3]=System.console().readLine();
			System.out.print("Hora(HH:MM): ");
			peliculas[i][4]=System.console().readLine();
		}

		for(i=0;i<2;i++){
			System.out.println("Pel�cula "+peliculas[i]);
			for(j=0;j<5;j++){
				System.out.println(peliculas[i][j]);
			}
		}
	}
}