public class Hola{
	public static void main(String[] args){
		int[] datos=llenar();
		int[] cantidad=contabilizar(datos);
		moda(datos,cantidad);
	}
	
	private static int [] llenar() {
		System.out.print("¿Cuántos números vas a ingresar? ");
		 int [] datos = new int[Integer.parseInt(System.console().readLine())];

		for(int i=0;i<datos.length;i++){
			System.out.print("Dame el "+(i+1)+"° número: ");
			datos[i]=Integer.parseInt(System.console().readLine());
		}
		return datos;
	}
	
	private static int [] contabilizar(int [] datos) {
		int [] cantidad=new int [datos.length];
		for(int i=0;i<datos.length;i++){
			int cant=0;
			boolean encontrado=false;
			for(int r=i;r>0;r--){
				if(datos[r-1]==datos[i]){
					encontrado=true;
				}
			}
			if(encontrado==true){
			}else{
				for(int j=0;j<datos.length;j++){
					if(datos[i]==datos[j]){
						cant++;
					}
				}
				cantidad[i]=cant;
			}
		}	
		return cantidad;
	}
	private static void moda(int [] datos, int [] cantidad ) {
		
		int iguales=1, pos=0, ca=0,s=0;
		for(int i=0;i<cantidad.length;i++){
			if(cantidad[i]!=0){
				ca++;
			}
		}
		int [] supercantidad=new int [ca],marcador =new int [ca];
		for(int i=0;i<cantidad.length;i++){
			if(cantidad[i]!=0){
			marcador[s]=datos[i];
			supercantidad[s]=cantidad[i];
			s++;
			}
		}
		int mayor=0;
		for(int i=0;i<supercantidad.length;i++){
			//mayor es para el número de veces que se repite

			if(supercantidad[i]>mayor){
				mayor=supercantidad[i];
				pos=i;
				
			}
			else if(supercantidad[i]==mayor){
				//si el número se repite la misma cantidad de veces, comparar el número para ver si es diferente
				iguales++;
			}
		}
		if(iguales==1){
			System.out.println("El número que más se repite es: "+marcador[pos]);
		}
		else{
			System.out.println("Hay "+iguales+" números que se repiten la misma cantidad de veces.");
		}
		
	}
}
