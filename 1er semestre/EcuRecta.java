public class EcuRecta{
	public static void main (String[] args){
		double x1, x2, y1, y2, m;
		System.out.println("Vamos a obtener la ecuación de la recta");
		System.out.print("Del primer punto, dame la x: ");
		x1=Double.parseDouble(System.console().readLine());
		System.out.print("Del primer punto, dame la y: ");
		y1=Double.parseDouble(System.console().readLine());
		System.out.print("Del segundo punto, dame la x: ");
		x2=Double.parseDouble(System.console().readLine());
		System.out.print("Del segundo punto, dame la y: ");
		y2=Double.parseDouble(System.console().readLine());

		m=(y2-y1)/(x2-x1);
		System.out.println("La ecuación de la recta es: ");
		System.out.println("y-"+y1+"="+m+"*(x-"+x1+")");
		System.out.println("y="+m+"x-("+(m*x1)+y1+")");
	}
}