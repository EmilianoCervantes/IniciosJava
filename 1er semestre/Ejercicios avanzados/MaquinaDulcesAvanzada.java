/*
La máquina muestra los productos, luego se pide insertar el dinero.
Dependiendo del producto pide más dinero o da cambio.
*/
public class MaquinaDulcesAvanzada {
	public static void main (String[] args){
		int seleccion, dinero, cambio=0;
		boolean seguir;
		System.out.println("Bienvenido a la máquina de dulces");
		System.out.println();
		do{
			System.out.println("Nuestros productos son: ");
			System.out.println("1. Papas= $8 \n2. Chocolate= $12 \n3. Refrescos= $9 \n4. Dulces= $6 \n5. Chicles= $4");
			System.out.println();
			System.out.println("Se aceptan monedas de $1, $2, $5 y $10");
			System.out.println();
			System.out.print("Elige el número de producto que quieras ");
			seleccion=Integer.parseInt(System.console().readLine());
			producto(seleccion);
			System.out.println();
			if(seleccion>0 & seleccion<6){
				System.out.println("Inseta tus monedas");
				cambio=cambio(seleccion, cambio);
				System.out.println();
			}
			System.out.print("¿Quieres comprar otra cosa?(si/no) ");
			seguir=System.console().readLine().equals("si");
			System.out.println();
		}while(seguir);
		System.out.println("Tu cambio es de $"+cambio);
		System.out.println("Hasta Luego =)");

	}

	public static void producto(int producto){
		if(producto>5 | producto<1){
			System.out.println("El producto no existe");
		}
		switch (producto){
			case 1:
				System.out.println("Tu prodcuto cuesta $8");
				break;
			case 2:
				System.out.println("Tu prodcuto cuesta $12");
				break;
			case 3:
				System.out.println("Tu prodcuto cuesta $9");
				break;
			case 4:
				System.out.println("Tu prodcuto cuesta $6");
				break;
			case 5:
				System.out.println("Tu prodcuto cuesta $4");
				break;
		}
	}

	public static int cambio(int producto, int cambio){
		int papas=8, chocolate=12, refresco=9, dulces=6, chicles=4;
		int uno, dos, cinco, diez, total;
		System.out.print("¿Cuántas monedas de $1 vas a insertar? ");
		uno=Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántas monedas de $2 vas a insertar? ");
		dos=Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántas monedas de $5 vas a insertar? ");
		cinco=Integer.parseInt(System.console().readLine());
		System.out.print("¿Cuántas monedas de $10 vas a insertar? ");
		diez=Integer.parseInt(System.console().readLine());
		System.out.println();
		total=(uno*1)+(2*dos)+(5*cinco)+(10*diez)+cambio;
		switch (producto) {
			case 1:
				cambio=total-papas;
				if(cambio>0 | cambio==0){
					System.out.println("Te sobran $"+ cambio);
				}
				if (cambio<0){
					System.out.println("El dinero es insuficiente");
					cambio+=papas;
				}
				break;
			case 2:
				cambio=total-chocolate;
				if(cambio>0 | cambio==0){
					System.out.println("Te sobraron $"+ cambio);

				}
				if (cambio<0){
					System.out.println("El dinero es insuficiente");
					cambio+=chocolate;
				}
				break;
			case 3:
				cambio=total-refresco;
				if(cambio>0 | cambio==0){
					System.out.println("Te sobraron $"+ cambio);
				}
				if (cambio<0){
					System.out.println("El dinero es insuficiente");
					cambio+=refresco;
				}
				break;
			case 4:
				cambio=total-dulces;
				if(cambio>0 | cambio==0){
					System.out.println("Te sobraron $"+ cambio);
				}
				if (cambio<0){
					System.out.println("El dinero es insuficiente");
					cambio+=dulces;
				}
				break;
			case 5:
				cambio=total-chicles;
				if(cambio>0 | cambio==0){
					System.out.println("Te sobraron $"+ cambio);
				}
				if (cambio<0){
					System.out.println("El dinero es insuficiente");
					cambio+=chicles;
				}
				break;
		}
		return cambio;
	}
}