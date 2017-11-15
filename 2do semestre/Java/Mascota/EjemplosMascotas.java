//Este es el main
public class EjemplosMascotas{
	public static void main(String[] args){

		Perro dog;
		dog= new Perro();
		dog.edad=3;
		dog.tamaño=1.30;
		dog.peso=35;
		dog.patas=4;
		dog.costo=200;
		dog.raza="Pastor alemán";
		dog.pelo=true;
		dog.parasitos=false;
		dog.dientes=true;
		dog.vacunas=true;
		dog.pedigree=true;

		System.out.println("Perro :"+dog);

		Pez p;
		p = new Pez();
		p.edad=3;
		p.tamaño=0.2;
		p.peso=0.9;
		p.patas=3;
		p.costo=50;
		p.raza="payaso";
		p.parasitos=false;
		p.dientes=false;
		p.tipo= "catilaginoso";

		System.out.println("Pez :"+p);
	}
}