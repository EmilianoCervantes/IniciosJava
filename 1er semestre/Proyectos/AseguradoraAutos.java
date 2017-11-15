/* La aseguradora tiene 3 productos: particulares, colectivos y motos.
	Requiere que se guarde el nombre, dirección y teléfono; #de vehículos,
	colecticos y motos contratadas por el cliente.
	Debe tener 4 opciones:
	1. dar de alta los datos (ingresar los datos); sino no se ejecuta lo demás
	2. Registrar. #De autos, fecha, cliente. Al final se indica el costo.
	3. Reporte. Mes con más ventas
	Al Salir. Imprimir un histograma con asteriscos por mes.
	*/
/* a) Los clientes tienen nombre, dir y tel.
	b) Al registrar el auto tenemos #, fecha y precio.
	*/
public class AseguradoraAutos {
	public static void main (String[] args){
		//Part-particulares, Colect-colectivos, Moto-motos
		int CostoPart=5500, CostoColect=8400, CostoMoto=3900;
		String[][] clientes = new String[1000][8];
		int opcion, contClientes=0;

		do{
			mostrarMenu();
			opcion= elegirOpcion();
			contClientes = ejecutarOpcion(opcion, contClientes, clientes, CostoPart, CostoColect, CostoMoto);
		}while(opcion!=4);
	}

	public static void mostrarMenu(){
		System.out.println("1. Registrar cliente");
		System.out.println("2. Registrar aseguramiento");
		System.out.println("3. Reporte del mes con mayor ventas");
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

	public static int ejecutarOpcion(int opcion, int pos, String[][]datos, int CostoPart, int CostoColect, int CostoMoto){
		int numCliente;
		switch(opcion){
			case 1://Registrar al cliente
				registrarCliente(pos, datos);
				pos++;
				break;
			case 2://Registrar aseguramiento (#vehículos)
				if(datos[0][0]==null){
					System.out.println("Debes registrar por lo menos a un cliente");
					System.out.println();
				}
				else{
					System.out.print("¿Número de cliente? ");
					numCliente=Integer.parseInt(System.console().readLine());
					if(numCliente+1>pos){
						System.out.println("El cliente no existe");
					}
					else{
						registrarSeguro(pos, numCliente-1, datos, CostoPart, CostoColect, CostoMoto);
					}
				}
				break;
			case 3://Mes con mayor ventas
				if(datos[0][0]==null){
					System.out.println("Debes registrar por lo menos a un cliente");
					System.out.println();
				}
				else{
					reporteVentas(datos);
				}
				break;
			case 4://Salir
				reporteMeses(datos);
				System.out.println("Cerrando programa. \nGracias por usarlo.");
				break;
		}
		return pos;
	}

	//1. dar de alta los datos
	public static void registrarCliente (int posicion, String[][] datos){
		// Creo que esto sobra: String nombre, direccion, telefono, email;
		//2. Almacenar los datos
		System.out.println("Datos del contacto " + (posicion+1)+":");
		System.out.print("Nombre completo: ");
		datos[posicion][0] = System.console().readLine();
		System.out.print("Dirección: ");
		datos[posicion][1] = System.console().readLine();
		System.out.print("Teléfono: ");
		datos[posicion][2] = System.console().readLine();
		System.out.println();
	}

	//2. registrar los vehículos asegurados
	public static void registrarSeguro (int pos, int numCliente, String[][] datos, int Vehiculo, int Colectivo, int Moto){
		/* seguro[][0]=Mes, seguro[][1]=Part, seguro[][2]=Colect, seguro[][3]=Moto, seguro[][4]=Costo total */
		int seguro[] = new int[5];
		int precioSeguro;
		//costos y precio del seguro va a estar en la 3er dimensión del arreglo datos
		//que queden en datos[pos][0][0,1,2,3,4]

		System.out.print("Dame el mes del pedido en numero: ");
		seguro[0] = Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántos vehículos particulares se aseguran? ");
		seguro[1] = Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántos colectivos se aseguran? ");
		seguro[2] = Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántas motocicletas se aseguran? ");
		seguro[3] = Integer.parseInt(System.console().readLine());
		precioSeguro = (seguro[1]*Vehiculo + seguro[2]*Colectivo + seguro[3]*Moto);
		if((seguro[1] + seguro[2] + seguro[3]) > 5){
			seguro[4] = (int)(precioSeguro*.90);
		}
		else{
			seguro[4] = precioSeguro;
		}
		datos[numCliente][3] = seguro[0] +"";
		datos[numCliente][4] = seguro[1] +"";
		datos[numCliente][5] = seguro[2] +"";
		datos[numCliente][6] = seguro[3] +"";
		datos[numCliente][7] = seguro[4] +"";

		System.out.println();
		System.out.print("El pedido fue registrado, el precio final es: \n$" + seguro[4] + ".00 pesos.");
		System.out.println();

	}

	//3. mes con más ventas y la mayor venta de ese mes
	public static void reporteVentas (String[][] datos){
		int[][] mesYmayor = new int [1000][5];
		int[] GananciaMeses = new int [12];
		for (int i=0;i<1000;i++){
			if (datos[i][3] != null) {
				mesYmayor[i][0]=Integer.parseInt(datos[i][3]);//mes
				mesYmayor[i][1]=Integer.parseInt(datos[i][4]);//part
				mesYmayor[i][2]=Integer.parseInt(datos[i][5]);//colect
				mesYmayor[i][3]=Integer.parseInt(datos[i][6]);//motos
				mesYmayor[i][4]=Integer.parseInt(datos[i][7]);//cotsto total
			}
		}

		int mes=0;
		for(int j=0;j<1000;j++){
			mes=mesYmayor[j][0];
			if(mes!=0){
				GananciaMeses[(mes-1)] = GananciaMeses[(mes-1)] + mesYmayor[j][4];
			}
		}

		int mesMayor=0, posMayor=0;
		for(int k=0;k<12;k++){
			if(GananciaMeses[k] > mesMayor){
				mesMayor=GananciaMeses[k];
				posMayor=k;
			}
		}
		System.out.println("El mes donde hubo más ganacias fue en el mes número " + (posMayor+1));

		int ventaMayor=0;
		int posVentaMayor=0;
		for(int l=0;l<1000;l++){
			for(int i=0;i<12;i++){
				if(mesYmayor[l][4]>ventaMayor){
					ventaMayor=mesYmayor[l][4];
					posVentaMayor=l;
				}
			}
		}
		System.out.println("Los datos de la venta mayor son: ");

		System.out.println("Nombre: "+datos[posVentaMayor][0]);
		System.out.println("Dirección: "+datos[posVentaMayor][1]);
		System.out.println("Teléfono: "+datos[posVentaMayor][2]);
		System.out.println("Mes: "+datos[posVentaMayor][3]);
		System.out.println("Particulares: "+datos[posVentaMayor][4]);
		System.out.println("Colectivos: "+datos[posVentaMayor][5]);
		System.out.println("Motos: "+datos[posVentaMayor][6]);
		System.out.println("Total: $"+datos[posVentaMayor][7]);

		/*for(int i=0;i<8;i++){
			System.out.println(datos[posVentaMayor][i]);
		}*/
	}

	//4.
	public static void reporteMeses (String[][] datos){
		int mayor=0, mes=0;
		int[][] meses =new int [1000][5];
		int[] GananciaMeses = new int [12];
		for (int i=0;i<1000;i++){
			if (datos[i][3] != null) {
				meses[i][0]=Integer.parseInt(datos[i][3]);//mes
				meses[i][1]=Integer.parseInt(datos[i][4]);//part
				meses[i][2]=Integer.parseInt(datos[i][5]);//colect
				meses[i][3]=Integer.parseInt(datos[i][6]);//motos
				meses[i][4]=Integer.parseInt(datos[i][7]);//cotsto total
			}
		}

		for(int j=0;j<1000;j++){
			mes=meses[j][0];
			if(mes!=0){
				GananciaMeses[(mes-1)]+=meses[j][4];
			}
		}

		/*
		10 - mayor
		n  - GananciaMeses[i]
		*/

		//sacar mayoru
		for(int i=0;i<12;i++){
			if(GananciaMeses[i]>mayor){
				mayor=GananciaMeses[i];
			}
		}

		//regla de 3
		for(int i=0;i<12;i++){
			System.out.print("Mes "+(i+1)+": ");
			for(int j=0;j<(Math.ceil(GananciaMeses[i]*10.0/mayor));j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}