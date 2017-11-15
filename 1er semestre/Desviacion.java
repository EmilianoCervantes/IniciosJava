/*
Primero se ponen las variables como doubles pues las calificaciones usualmente tienen
puntos decimales, por lo cual se establecen como doubles. Después se le pide al usuario
cada una de sus cinco calificaciones, una por una, para después pedirle su promedio.
Una vez que obtuvimos los datos sacamos la desviación estándar y se la mostramos
al usuario.
*/
public class Desviacion{
	public static void main(String [] args){
	String texto;
	double calif1, calif2, calif3, calif4, calif5, califFinal, desviacion;

	System.out.print("¿Cuál es tu primera calificación?");
	texto = System.console().readLine();
	calif1= Double.parseDouble(texto);
	System.out.print("¿Cuál es tu segunda calificación?");
	texto = System.console().readLine();
	calif2= Double.parseDouble(texto);
	System.out.print("¿Cuál es tu tercer calificación?");
	texto = System.console().readLine();
	calif3= Double.parseDouble(texto);
	System.out.print("¿Cuál es tu cuarta calificación?");
	texto = System.console().readLine();
	calif4= Double.parseDouble(texto);
	System.out.print("¿Cuál es tu quinta calificación?");
	texto = System.console().readLine();
	calif5= Double.parseDouble(texto);
	System.out.print("¿Cuál es fue calificación final?");
	texto = System.console().readLine();
	califFinal= Double.parseDouble(texto);

	/* califFinal = (calif1+calif2+calif3+calif4+calif5)/5 */
	// Esto ya no se puso porque nos pareció mejor que el usuario pusiera su promedio

	desviacion = (1/5)*(((calif1 - califFinal)*(calif1 - califFinal))+((calif2 - califFinal)*(calif2 - califFinal))+((calif3 - califFinal)*(calif3 - califFinal))+((calif4 - califFinal)*(calif4 - califFinal))+((calif5 - califFinal)*(calif5 - califFinal)));

	System.out.print("La desviacion estándar de tus calificaciones es: ");
	System.out.println(desviacion);


	}
}