import java.util.Scanner;

/**
 * Juego de gato
 */
public class JuegoDeGato {
	/**
	 *
	 * Los posibles valores almacenados en el tablero son:
	 * -1 si la casilla está vacía
	 * 1 si tiene un tiro la computadora
	 * 0 si tiene un tiro el jugador humano
	 */
	public static void tiroAutomatico(TableroGato gato) {
		int[][] tablero = gato.obtenerTablero();
		int posx, posy;
		boolean tiro = false, inicial=true;

		//ESCRIBE TU CODIGO AQUI!

		/*System.out.print("¿Empiezas? true/false: ");
		inicial=Boolean.parseBoolean(System.console().readLine());*/

		//Identifica la primera casilla vacia y tira en ella
		for (int i=0; i<3 && !tiro; i++) {
			if(i==0){
				for(int k=1;k>=0;k--){
					if (tablero[k][k] == TableroGato.CASILLA_VACIA) {
						tablero[k][k] = TableroGato.TIRO_COMPUTADORA;
						tiro = true;
					}
				}
			}
			else {
				for (int j=0; j<3 && !tiro; j++) {
					posx=(int)Math.round(Math.random()*2);
					posy=(int)Math.round(Math.random()*2);
					if (tablero[posx][posy] == TableroGato.CASILLA_VACIA) {
						tablero[posx][posy] = TableroGato.TIRO_COMPUTADORA;
						tiro = true;
					}
				}
			}
		}
	}

    public static void main(String[] args) {
        TableroGato tablero = new TableroGato();
        Scanner lector = new Scanner(System.in);
        int renglon, columna;

        do {
			//Pregunto el lugar a tirar
			boolean tiroAceptado = true;
			do {
				if (tiroAceptado == false)
					System.out.println("Tiro invalido, intenta de nuevo");
				System.out.print("Renglon: ");
				renglon = Integer.parseInt(lector.nextLine());
				System.out.print("Columna: ");
				columna = Integer.parseInt(lector.nextLine());
				tiroAceptado = tablero.tirar(TableroGato.TIRO_HUMANO, renglon, columna);
			} while (tiroAceptado == false);
			//Verifico si alguien ha ganado
			if (tablero.verificarGanador() < 0) {
            	tiroAutomatico(tablero);
			}
			//Imprimo el tablero
			System.out.println(tablero.imprimirTablero());
        } while (tablero.verificarGanador() < 0);
		//Imprimo el nombre del ganador
        System.out.println(tablero.imprimirGanador());
    }
}