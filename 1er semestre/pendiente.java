/* Primero se piden las coordenadas por separado (tanto en x como en y) de cada punto de la recta,
después se escribe la ecuación de la pendiente para así ya nada más al final escribir la ecuación de la recta
intercalando los datos que se requieren para escribir dicha recta.
*/
public class pendiente{
	public static void main(String [] args){

	int X1, Y1, X2, Y2;
	String texto;
	double m;
	//En las variables primero pon letra y luego número.
	System.out.print("Dame la coordenada y del primer punto");
	texto = System.console().readLine();
	Y1= Integer.parseInt(texto);
	System.out.print("Dame la coordenada x del primer punto");
	texto = System.console().readLine();
	X1= Integer.parseInt(texto);
	System.out.print("Dame la coordenada y del segundo punto");
	texto = System.console().readLine();
	Y2= Integer.parseInt(texto);
	System.out.print("Dame la coordenada x del segundo punto");
	texto = System.console().readLine();
	X2= Integer.parseInt(texto);

	m = (Y2-Y1)/(X2-X1);

	System.out.println("Tu ecuación de la recta es: y-" +Y1 +"=" +m +"*(x-" +X1 +")");
	//Se pone un + antes de cada cosa que se le quera agregar a la impresión.
	}
}