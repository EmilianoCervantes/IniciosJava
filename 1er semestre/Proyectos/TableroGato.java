public class TableroGato {
	public static final int CASILLA_VACIA = -1;
	public static final int TIRO_HUMANO = 0;
	public static final int TIRO_COMPUTADORA = 1;
    private int[][] tablero;

    public TableroGato() {
        tablero = new int[3][3];
        for (int i=0; i<tablero.length; i++) {
            for (int j=0; j<tablero[i].length; j++) {
                tablero[i][j] = CASILLA_VACIA;
            }
        }
    }

    public int[][] obtenerTablero() {
        return tablero;
    }

    public String imprimirTablero() {
        String texto = "\n";
        for (int i=0; i<tablero.length; i++) {
            for (int j=0; j<tablero[i].length; j++) {
                texto += obtenerTirada(tablero[i][j]) + " | ";
            }
            texto = texto.substring(0, texto.length()-3) + "\n";
            if (i<2)
	            texto += "---------\n";
        }
        return texto;
    }

    public boolean tirar(int jugador, int renglon, int columna) {
        if (tablero[renglon][columna] == CASILLA_VACIA) {
            tablero[renglon][columna] = jugador;
            return true;
        }
        return false;
    }

    private String obtenerTirada(int valor) {
        String tiro = " ";
        if (valor == TIRO_HUMANO)
            tiro = "X";
        else if (valor == TIRO_COMPUTADORA)
            tiro = "O";

        return tiro;
    }

    public String imprimirGanador() {
		int ganador = verificarGanador();
		if (ganador == TIRO_HUMANO)
			return "Has ganado!";
		else if (ganador == TIRO_COMPUTADORA)
			return "Ha ganado la computadora!";
		else
			return "Ha sido un empate";
	}

    public int verificarGanador() {
        int ganador = CASILLA_VACIA;
        //Verificar lineas horizontales
        for (int i=0; i<tablero.length; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2] && tablero[i][0] != CASILLA_VACIA) {
                ganador = tablero[i][0];
			}
        }

        //Verificar lineas verticales
        for (int i=0; i<tablero.length; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i] && tablero[0][i] != CASILLA_VACIA) {
                ganador = tablero[0][i];
			}
        }

        //Verificar diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] != CASILLA_VACIA) {
            ganador = tablero[0][0];
		}
        if (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[0][2] != CASILLA_VACIA) {
            ganador = tablero[0][2];
		}

        //Verificar empate
        if (ganador == CASILLA_VACIA) {
			int casillasVacias = 0;
			for (int i=0; i<tablero.length; i++) {
				for (int j=0; j<tablero[i].length; j++) {
					if (tablero[i][j] == CASILLA_VACIA)
						casillasVacias++;
				}
			}
			if (casillasVacias == 0)
				ganador = 2;
		}

        return ganador;
    }
}