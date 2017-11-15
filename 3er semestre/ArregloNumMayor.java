public class ArregloNumMayor{
	public static void main(String[] args){
		int total, iguales=1, pos=0;
		int[] datos;
		int[] cantidad;

		System.out.print("¿Cuántos números vas a ingresar? ");
		total=Integer.parseInt(System.console().readLine());

		datos = new int[total];
		cantidad = new int[total];

		for(int i=0;i<total;i++){
			System.out.print("Dame el "+(i+1)+"° número: ");
			datos[i]=Integer.parseInt(System.console().readLine());
		}
		for(int i=0;i<total;i++){
			int cant=0;
			for(int j=0;j<total;j++){
				if(datos[i]==datos[j]){
					cant++;
				}
			}
			cantidad[i]=cant;
		}
		for(int i=0;i<total;i++){
			//mayor es para el número de veces que se repite
			int mayor=0;
			if(cantidad[i]>mayor){
				pos=i;
			}
			else if(cantidad[i]==mayor){
				//si el número se repite la misma cantidad de veces, comparar el número para ver si es diferente
				if(datos[i]!=datos[pos]){
					iguales++;
				}
			}
		}

		if(iguales==1){
			System.out.println("El número que más se repite es: "+datos[pos]);
		}
		else{
			System.out.println("Hay "+iguales+" números que se repiten la misma cantidad de veces.");
		}
	}
}