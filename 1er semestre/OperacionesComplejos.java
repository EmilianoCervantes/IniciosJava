/*
Primero se ponen variables para las partes reales y para las imaginarias de los n�meros complejos.
Le pedimos al usuario que divida sus n�meros complejos entre la parte real y la parte imaginaria.
Despu�s se imprime la ecuac��n de la suma de los n�meros complejos.
Y as� va luego con la resta multiplicaci�n y la divisi�n.
En cada una va mostrando la ecuaci�n, como se ordenan y al final el resultado.
*/
public class OperacionesComplejos {
	public static void main (String [] args) {
		String texto;
		double real1, imag1, real2, imag2;

		System.out.println("Bienvenido a operaciones sencillas con complejos");
		System.out.println("Cuando metas los complejos vas a meter primero:");
		System.out.println("1) su parte real	" + "2) la parte imaginaria");
		System.out.println("De la imaginaria s�lo mete el n�mero, NO pongas la 'i'");
		System.out.print("Dame tu primer n�mero real ");
		texto = System.console().readLine();
		real1= Double.parseDouble(texto);
		System.out.print("Dame su parte imaginaria ");
		texto = System.console().readLine();
		imag1= Double.parseDouble(texto);
		System.out.print("Dame el segundo n�mero real ");
		texto = System.console().readLine();
		real2= Double.parseDouble(texto);
		System.out.print("Y su parte imaginaria ");
		texto = System.console().readLine();
		imag2= Double.parseDouble(texto);

		System.out.println("Tu ecuaci�n es: (("+real1+")+("+imag1+")i) + (("+real2+")+("+imag2+"i))");
	//Vamos a poner la ecuacui�n de manera ordenada, como el usuario se supone la quiso.
		System.out.println("Al hacer la suma se expresa como: (("+real1+"+"+real2+")) + (("+imag1+")+("+imag2+"))i");
		System.out.println("Y su resultado es: ("+ (real1+real2)+")+("+(imag1+imag2) +")i");
		//Primero suma

		System.out.println("Si es una resta tu ecuaci�n es: (("+real1+")+("+imag1+")i) - (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: (("+real1+")-("+real2+")) + (("+imag1+")-("+imag2+"))i");
		System.out.println("Y su resultado es: ("+ (real1-real2)+")+("+(imag1-imag2) +")i");
		//Ahora la resta

		System.out.println("Si es una multiplicaci�n tu ecuaci�n es: (("+real1+")+("+imag1+")i) * (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: (("+real1+")*("+real2+")) + ((("+real1+")*("+imag2+"))+(("+real2+"*"+imag1+")))i + (("+imag1+")*("+imag2+"))(i*i)");
		System.out.println("Hay que recordar que al multiplcicar imaginarios, i*i=-1 y ese -1 se multiplica con el resto del n�mero");
		System.out.println("Y su resultado es: ("+ (real1*real2)+")+("+((real1*imag2)+(real2*imag1))+")i +("+(imag1*imag2)*(-1)+")");
		//Multiplicaci�n

		System.out.println("Si es una multiplicaci�n tu ecuaci�n es: (("+real1+")+("+imag1+")i) / (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: ((("+real1+")+("+imag1+")i)*((("+real2+")-("+imag2+")i)) / ((("+real2+")+("+imag2+")i))*(("+real2+")-("+imag2+")i))");
		System.out.println("Hay que recordar que al dividir complejos, se multiplica tanto el numerador y como eldenominador, por el conjugado del denominador");
		System.out.println("Y su resultado es: (("+ ((real1*real2)+(imag1*imag2))+")+("+((imag1*real2)-(real1*imag2))+")i) / ("+((real2*real2)+(imag2*imag2))+")");
		//Divisi�n
	}
}