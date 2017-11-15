public class SimRef{
	public static void main(String[] args){
		Refaccion ref;
		ref=new Refaccion();

		ref.nombre="Clutch";
		ref.SKU="957395";
		ref.cantExist=17;
		ref.cantMin=15;
		ref.marc.nombre="Champion";
		ref.marc.RFC="PT9512";
		ref.marc.dir.calle="Juárez";
		ref.marc.dir.num=204;
		ref.marc.dir.ciudad="Puebla";
		ref.marc.dir.col="Fresno";
		ref.marc.dir.deleg="Zacatlán";

		if(ref.cantExist - ref.cantMin>=0){
			ref.requiereOrd=false;
		}
		else{
			ref.requiereOrd=true;
		}

		System.out.println(ref);
	}
}