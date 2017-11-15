public class SimuladorMoviles{
	public static void main (String[] args){
		/* En vez de los tipos de variable conocidos (int, String, etc)
			Ahora podemos crear nuestras variables dependiendo de las clases creadas*/

		//dm es una variable de tipo DispositivoMovil
		DispositivoMovil dm;
		dm = new DispositivoMovil();
		dm.marca= "HuaWei";
		dm.sistemaOperativo = "Handroid";
		dm.largo = 30;
		dm.ancho = 10;
		dm.bateria = 6;
		dm.peso = 80;
		//creamos un objeto de tipo dispositivo móvil
		/*por cada característica del dm agregamos un dm."cosa" y esa cosa en
			la clase de la cual lo mandamos llamar*/

		System.out.println("Datos: "+dm);

		Celular c;
		c = new Celular();
		c.numero = "5552-5432-10";
		c.operadora = "Iusacell";
		c.marca = "Alcacel";
		c.sistemaOperativo = "Android";
		c.largo = 40;
		c.ancho = 5;
		c.peso = 30;
		/*como Celular es "extends" de DispositivoMovil, ya trae las características
			que traía DispositivoMovil y ya sólo le agregamos las propias*/

		System.out.println("Datos: "+c);



	}
}