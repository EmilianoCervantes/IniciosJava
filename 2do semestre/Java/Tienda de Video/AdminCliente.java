public class AdminCliente{
	private Cliente[] clientes;
	private int noCliente, id;

	public AdminCliente(){
		clientes = new Cliente[100];
		noCliente=0;
	}

	public void agregar(Cliente c){
		clientes[noCliente]=c;
		noCliente++;
	}

	public void borrar(Cliente c){
		boolean encontrado=false;
	/*	1. Obtengo el último
		2. Encuentro el cliente a borrar
		3. Lo reemplazo por el último
		4. Elimino el último
		5. Disminuir contador */
		Cliente ultimo=clientes[noCliente-1];
		for (int i=0;i<noCliente;i++){
			if(clientes[i].id==c.id){
				clientes[i]=ultimo;
				encontrado=true;
				break;
			}
		}
		if (encontrado) {
			//Elimino el último
			clientes[noCliente-1] = null;
			//Disminuyo el contador
			noCliente--;
		}
	}
	public void cambiar(Cliente c) {
		//Buscamos cliente con el mismo id en clientes
		for (int i=0; i<noCliente; i++) {
			if (clientes[i].id == c.id) {
				//Cambiamos el elemento de la lista
				clientes[i] = c;
				break;
			}
		}
	}
	public String desplegar() {
		String texto = "Clientes\n";
		for (int i=0; i<noCliente; i++) {
			texto += "\t" + clientes[i] + "\n";
		}
		return texto;
	}
}