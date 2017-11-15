public class DemoRes {
	public static void main(String[] args){
		Restaurante cafeJava;
		cafeJava = new Restaurante();
		cafeJava.nombre="Cafetería de Java";
		cafeJava.noMesas=20;
		//Porque tengo los dos constructores:
		cafeJava.platillos[0]=new Platillo(2);
		cafeJava.platillos[0].nombre="Enchiladas";
		cafeJava.platillos[0].costo= 50;
		cafeJava.platillos[0].ingredientes[0]= new Ingredientes();
		cafeJava.platillos[0].ingredientes[0].nombre = "Pollo";
		cafeJava.platillos[0].ingredientes[0].tipoAlimento="Carne";
		cafeJava.platillos[0].ingredientes[0].noCalorias=200;
		cafeJava.platillos[0].ingredientes[1] = new Ingredientes();
		cafeJava.platillos[0].ingredientes[1].nombre = "Tortillas";
		cafeJava.platillos[0].ingredientes[1].tipoAlimento="Cerales";
		cafeJava.platillos[0].ingredientes[1].noCalorias=50;

		System.out.println("Restaurante: "+cafeJava);
		System.out.println();

	}
}