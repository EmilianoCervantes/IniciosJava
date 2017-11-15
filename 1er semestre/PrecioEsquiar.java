/* Con base en si es adulto o no, se va a calcular el precio del paquete
tomando en cuenta número de días, temporada y alimentos. */
public class PrecioEsquiar {
	public static void main (String[] args){
		boolean alimentos;
		int temporada, adulto, dias;
		double costo;

		System.out.println("Bienvenido a la zona de esqui");

		System.out.print("¿Qué edad tienes?");
		adulto=Integer.parseInt(System.console().readLine());

		System.out.println("El costo es $250 por adulto, $150 por niño");
		System.out.print("¿Cuántos días te vas a quedar?");
		dias=Integer.parseInt(System.console().readLine());

		System.out.println("En temporada alta el costo se duplica, en media el costo es 50% más caro y en baja el costo es regular");
		System.out.println("¿Qué reservación quieres hacer?");
		System.out.print("Pon 1 si es alta, 2 si es media o 3 si es baja");
		temporada = Integer.parseInt(System.console().readLine());

		System.out.println("Con alimentos incluidos el costo adicional es de $150 más caro por persona");
		System.out.print("¿Vas a consumir alimentos? true/false");
		alimentos = Boolean.parseBoolean(System.console().readLine());

		//Caso 1
		if(adulto>=18 & temporada==1){
			if(alimentos==true){
				costo=(dias*250)*2+150;
				System.out.println("El costo final es de: "+costo);
			}
			else{
				costo=(dias*250)*2;
				System.out.println("El costo final es de: "+costo);
			}
		}

		//Caso 2
		if(adulto>=18 & temporada==2){
			if(alimentos==true){
			costo=(dias*250)*1.5+150;
			System.out.println("El costo final es de: "+costo);
			}
			else{
				costo=(dias*250)*1.5;
				System.out.println("El costo final es de: "+costo);
		}

		//Caso 3
		if(adulto>=18 & temporada==3){
			if(alimentos==true){
				costo=(dias*250)+150;
				System.out.println("El costo final es de: "+costo);
			}
			else{
				costo=(dias*250);
				System.out.println("El costo final es de: "+costo);
			}
		}
		//Caso 4
		if(adulto<18 & temporada==1){
			if(alimentos==true){
				costo=(dias*150)*2+150;
				System.out.println("El costo final es de: "+costo);
			}
			else {
				costo=(dias*150)*2;
				System.out.println("El costo final es de: "+costo);
			}
		}

		//Caso 5
		if(adulto<18 & temporada==2){
			if(alimentos==true){
				costo=(dias*150)*1.5+150;
				System.out.println("El costo final es de: "+costo);
			}
			else {
				costo=(dias*150)*1.5;
				System.out.println("El costo final es de: "+costo);
			}
		}

		//Caso 6
		if(adulto<18 & temporada==3){
			if(alimentos==true){
				costo=(dias*150)+150;
				System.out.println("El costo final es de: "+costo);
			}
			else {
				costo=(dias*150);
				System.out.println("El costo final es de: "+costo);
			}
		}
	}
}
}
