public class ClienteGUI{
	private AdminCliente admin;

	public ClienteGUI(){
		admin = new AdminCliente();
	}

	public void ejecutar(){
		int opcion;
		do{
			mostrarMenu();
			opcion=seleccionarOpcion();
			ejecutarOpcion(opcion);
		}while(opcion !=5);
	}

	public void mostrarMenu(){
		System.out.println("1. Agregar Cliente");
		System.out.println("2. Borrar cliente");
		System.out.println("3. Cambiar datos de cliente");
		System.out.println("4. Desplegar cambios");
		System.out.println("5. Salir");
	}

	public int seleccionarOpcion(){
		int opcion;
		do{
			System.out.print("\nOpción: ");
			opcion=Integer.parseInt(System.console().readLine());
		}while(opcion<1 || opcion >5);
		return opcion;
	}

	public void ejecutarOpcion(int opcion){
		char c;
		switch(opcion){
			case 1: //Agregar Cliente / Pedir datos
				String tipoCliente;
				System.out.print("¿Eres persona (p) o institución (i)? ");
				tipoCliente=System.console().readLine();
				if(tipoCliente.equals("p")){
					Persona p = leerPersona();
					//Agregar cliente al administrador
					admin.agregar(p);
				}
				else if(tipoCliente.equals("i")) {
					Institucion i = leerInstitucion();
					admin.agregar(i);
				}
				break;
			case 2: //Borrar cliente
				System.out.print("Eliminar institución 'i' o perosna 'p' (pon 'p' o 'i'): ");
				c=System.console().readLine().charAt(0);
				if(c == 'p'){
					Persona p = leerPersona();
					admin.borrar(p);
				}
				break;
			case 3: //Cambiar datos de cliente
				System.out.print("Cambiar institución 'i' o perosna 'p' (pon 'p' o 'i'): ");
				c=System.console().readLine().charAt(0);
				if(c == 'p'){
					Persona p = leerPersona();
					admin.cambiar(p);
				}
				break;
			case 4: //Desplegar clientes
				String contenido = admin.desplegar();
				System.out.println(contenido);
				break;
			default:
		}
	}

	private Persona leerPersona() {
		Persona p = new Persona();
		System.out.print("Nombre: ");
		p.nombre = System.console().readLine();
		System.out.print("Direccion: ");
		p.dir = System.console().readLine();
		System.out.print("Email: ");
		p.correo = System.console().readLine();
		System.out.print("ID: ");
		p.id = Integer.parseInt(System.console().readLine());

		return p;
	}

	private Institucion leerInstitucion() {
		Institucion i = new Institucion();
		System.out.print("Nombre de la institución: ");
		i.nombre = System.console().readLine();
		System.out.print("Direccion de la institución: ");
		i.dir = System.console().readLine();
		System.out.print("ID de la institución: ");
		i.id = Integer.parseInt(System.console().readLine());
		i.encargado = leerPersona();

		return i;
	}
}