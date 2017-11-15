public class AdminMaterial{
	private Material[] materiales;
	private int noMaterial;

	public AdminMaterial(){
		materiales=new Material[200];
		noMaterial=0;
	}

	/*public AdminMaterial(maxMateriales){
		materiales=new Material[maxMateriales];
	}*/

	public void agregar(Material m){
		materiales[noMaterial]= m;
		noMaterial++;
	}

	public void borrar(Material m){
		boolean exist = false;
		Material ult = materiales[noMaterial-1];
		for(int i=0;i<noMaterial;i++){
			if(materiales[i].nombre==m.nombre){
				materiales[i]=ult;
				exist=true;
				break;
			}
		}
	}

	public void cambiar(Material m){

	}

	public void desplegar(){

	}
}