public class Aeropuerto{
	Filas<Pasajero> uno, dos, tres;
	public Aeropuerto(int size){
		Filas F1= new Filas(size);
		Filas F2= new Filas(size);
		Filas F3= new Filas(size);
		for(int i=0;i<size;i++){
			Pasajero pas = ((int)Math.ceil(Math.random()*100));
			F1.enqueue(pas);
			Pasajero pa = ((int)Math.ceil(Math.random()*100));
			F2.enqueue(pa);
			Pasajero p = ((int)Math.ceil(Math.random()*100));
			F3.enqueue(p);
		}
	}

	public String toString(){
		return"";
	}

	//vaciar filas
	public void panico(){
		//mostrar niños y adultos salvdos y edad promedio
		//F1
		int ninos=0, adultos=0, edades=0, edadP=0;
		for(int i=0;i<F1.length;i++){
			if(pas.F1<=15){
				ninos++;
			}else{
				adultos++;
			}
			edades+=F1[i];
		}
		edadP=(edades)/F1.length;
		//F2
		int n=0, a=0, ed=0, edP=0;
		for(int i=0;i<F1.length;i++){
			if(pas.F1<=15){
				n++;
			}else{
				a++;
			}
			ed+=F2[i];
		}
		edP=(edades)/F2.length;
		//F3
		int nin=0, ad=0, eds=0, eP=0;
		for(int i=0;i<F1.length;i++){
			if(pas.F1<=15){
				nin++;
			}else{
				ad++;
			}
			eds+=F3[i];
		}
		eP=(eds)/F3.length;
	}
}