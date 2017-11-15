public class HistogramaProgramasTV{
	public static void main(String[] args){
		/*
		Programa tiene nombre, clasif, hora inicio,
		hora fin, dia transmision, canal transmision
		*/
		String[][] arrayTest = new String[8][4];
		int cont1 = arrayTest.length;
		int cont2 = arrayTest[0].length;
		System.out.println(cont1); //8
		System.out.println(cont2); //4


		//1000 clientes y se almacena nombre, direccion, telefono, no...
		String[][] programas = new String[1000][8];

		//con esto llevar contador de los programas por canal
		int [] progCanal = new int[1000];
		int opcion, contProgramas=0;

		do{
			mostrarMenu();
			opcion= elegirOpcion();
			contProgramas = ejecutarOpcion(opcion, contProgramas, programas, progCanal);
		}while(opcion!=4);

	}

	//parte programa
	public static void mostrarMenu(){
		System.out.println("1. Registrar programa");
		System.out.println("2. Quitar programa");
		System.out.println("3. Duracion promedio de la programacion por canal");
		System.out.println("4. Salir");
		System.out.println();
	}

	public static int elegirOpcion(){
		int opcion;
		do{
			System.out.print("\tOpción: ");
			opcion=Integer.parseInt(System.console().readLine());
			if(opcion < 1 | opcion > 4){
				System.out.println("Opción inválida");
				System.out.println();
			}
		}while(opcion < 1 | opcion > 4);
		System.out.println();
		return opcion;
	}

	public static int ejecutarOpcion(int opcion, int pos, String[][]datos, int ProgramasCanal[]){
		String nomPrograma;
		boolean seEncontroProg = false;
		switch(opcion){
			case 1://Registrar al programa
				registrarPrograma(pos, datos, ProgramasCanal);
				pos++;
				break;
			case 2://eliminar prog
				if(datos[0][0]==null){
					System.out.println("Debes registrar por lo menos un programa");
					System.out.println();
				}
				else{
					System.out.print("¿Nombre del programa? ");
					nomPrograma=(System.console().readLine());
					int i=0, posicion=0;
					while(i<datos.length){
						String comprobarNombre = datos[i].toString();

						if(nomPrograma == comprobarNombre){
							seEncontroProg = true;
							posicion = i;
						}
						i++;
					}

					if(seEncontroProg){
						eliminarPrograma(posicion, datos, ProgramasCanal);
					}
					else{
						System.out.println("El programa no existe");
					}
				}
				break;
			case 3://Duracion promedio de la programacion en cada canal
				if(datos[0][0]==null){
					System.out.println("Debes registrar por lo menos a un programa");
					System.out.println();
				}
				else{
					reporteProgramas(datos);
				}
				break;
			case 4://Salir
				reporteCanales(datos);
				System.out.println("Cerrando programa. \nGracias por usarlo.");
				break;
		}
		return pos;
	}

	//1. dar de alta los datos
	/*
	Programa tiene nombre, clasif, hora inicio,
	hora fin, dia transmision, canal transmision
	*/
	public static void registrarPrograma (int posicion, String[][] datos, int[] progCanal){
		int canal = 0;
		//2. Almacenar los datos
		System.out.println("Datos del programa " + (posicion+1)+":");
		System.out.print("Nombre completo: ");
		datos[posicion][0] = System.console().readLine();
		System.out.print("Clasificasión: ");
		datos[posicion][1] = System.console().readLine();

		System.out.print("Canal de transmisión: ");
		datos[posicion][2] = System.console().readLine();
		canal = Integer.parseInt(datos[posicion][2]);
		System.out.println();
		System.out.print("Día de transmisión: ");
		datos[posicion][3] = System.console().readLine();
		System.out.println();
		System.out.print("Hora inicio (HH.MM): ");
		datos[posicion][4] = System.console().readLine();
		System.out.println();

		System.out.print("Hora fin (HH.MM): ");
		datos[posicion][5] = System.console().readLine();
		System.out.println();

		progCanal[canal] += 1;

		for(int i=0; i<posicion;i++){
			//se checa si chocan el canal, el dia y la hora de transmision
			if( (datos[posicion][2] == datos[i][2]) && (datos[posicion][3] == datos[i][3]) && (datos[posicion][4] == datos[i][4]) ){
				datos[posicion][2]= null;
				datos[posicion][3]= null;
				datos[posicion][4]= null;
				posicion = posicion -1;
				System.out.println("Tu programa no fue guardado porque se empalmaba con otro programa");
			}
		}
	}

	//2. registrar los vehículos asegurados
	public static void eliminarPrograma (int posicion, String[][] datos, int[] programasCanal){
		int canal = 0;

		datos[posicion][0]=null;
		datos[posicion][1]=null;
		//disminuir contador programasCanal
		canal = Integer.parseInt(datos[posicion][2]);
		programasCanal[canal] = programasCanal[canal] -1;
		datos[posicion][2]=null;
		datos[posicion][3]=null;
		datos[posicion][4]=null;
		datos[posicion][5]=null;

		System.out.println();
		System.out.print("El programa fue borrado exitosamente");
		System.out.println();

	}

	//3. duracion promedio programacion
	public static void reporteProgramas (String[][] datos){
		int canal = 0;
		//Programas por canal
		int[] contProgramas = new int[1000];
		double duracion=0;
		//[Canal][Duracion]
		double[][] duracionCanal= new double[1000][2];
		/*
			[pos][0] nombre
			[pos][1] clasif
			[pos][2] canal
			[pos][3] dia
			[pos][4] hora inicio
			[pos][5] hora fin
		*/

		//pone que todos los canales tienen 0 programas
		for(int i=0;i<1000;i++){
			contProgramas[i]=0;
		}

		for (int i=0;i<1000;i++){
			if (datos[i][2] != null) {
				canal = Integer.parseInt(datos[i][2]);
				duracion = Double.parseDouble(datos[i][5]);
				duracion = duracion - Double.parseDouble(datos[i][4]);

				contProgramas[2] += 1;
				duracionCanal[canal][0] = (duracion / contProgramas[2]);
			}
		}

		for(int i=0;i<1000;i++){
			if(duracionCanal[i] != null){
				System.out.println("El canal "+(i+1)+" tiene una duracion promedio de programación de "+duracionCanal[canal][0]);
			}
		}
	}

	//4.
	public static void reporteCanales (String[][] datos){
		int canal = 0, mayor=0;
		//Programas por canal
		int[] contProgramas = new int[1000];
		/*
		[pos][0] nombre
		[pos][1] clasif
		[pos][2] canal
		[pos][3] dia
		[pos][4] hora inicio
		[pos][5] hora fin
		*/

		//pone que todos los canales tienen 0 programas
		for(int i=0;i<1000;i++){
			contProgramas[i]=0;
		}

		for (int i=0;i<1000;i++){
			if (datos[i][2] != null) {
				canal = Integer.parseInt(datos[i][2]);
				contProgramas[2] += 1;
			}
		}

		/*
		10 - mayor
		n  - contProgramas[i]
		*/

		//sacar mayoru
		for(int i=0;i<1000;i++){
			if(contProgramas[i]>mayor){
				mayor=contProgramas[i];
			}
		}

		//regla de 3
		for(int i=0;i<1000;i++){
			if(datos[i][2] != null){
				System.out.print("Canal "+(i+1)+": ");
				for(int j=0;j<(Math.ceil(contProgramas[i]*10.0/mayor));j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}