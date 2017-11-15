/*
Primero se ponen variables para las partes reales y para las imaginarias de los números complejos.
Le pedimos al usuario que divida sus números complejos entre la parte real y la parte imaginaria.
Después se imprime la ecuacíón de la suma de los números complejos.
Y así va luego con la resta multiplicación y la división.
En cada una va mostrando la ecuación, como se ordenan y al final el resultado.
*/
public class OperacionesComplejos {
	public static void main (String [] args) {
		String texto;
		double real1, imag1, real2, imag2;

		System.out.println("Bienvenido a operaciones sencillas con complejos");
		System.out.println("Cuando metas los complejos vas a meter primero:");
		System.out.println("1) su parte real	" + "2) la parte imaginaria");
		System.out.println("De la imaginaria sólo mete el número, NO pongas la 'i'");
		System.out.print("Dame tu primer número real ");
		texto = System.console().readLine();
		real1= Double.parseDouble(texto);
		System.out.print("Dame su parte imaginaria ");
		texto = System.console().readLine();
		imag1= Double.parseDouble(texto);
		System.out.print("Dame el segundo número real ");
		texto = System.console().readLine();
		real2= Double.parseDouble(texto);
		System.out.print("Y su parte imaginaria ");
		texto = System.console().readLine();
		imag2= Double.parseDouble(texto);

		System.out.println("Tu ecuación es: (("+real1+")+("+imag1+")i) + (("+real2+")+("+imag2+"i))");
	//Vamos a poner la ecuacuión de manera ordenada, como el usuario se supone la quiso.
		System.out.println("Al hacer la suma se expresa como: (("+real1+"+"+real2+")) + (("+imag1+")+("+imag2+"))i");
		System.out.println("Y su resultado es: ("+ (real1+real2)+")+("+(imag1+imag2) +")i");
		//Primero suma

		System.out.println("Si es una resta tu ecuación es: (("+real1+")+("+imag1+")i) - (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: (("+real1+")-("+real2+")) + (("+imag1+")-("+imag2+"))i");
		System.out.println("Y su resultado es: ("+ (real1-real2)+")+("+(imag1-imag2) +")i");
		//Ahora la resta

		System.out.println("Si es una multiplicación tu ecuación es: (("+real1+")+("+imag1+")i) * (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: (("+real1+")*("+real2+")) + ((("+real1+")*("+imag2+"))+(("+real2+"*"+imag1+")))i + (("+imag1+")*("+imag2+"))(i*i)");
		System.out.println("Hay que recordar que al multiplcicar imaginarios, i*i=-1 y ese -1 se multiplica con el resto del número");
		System.out.println("Y su resultado es: ("+ (real1*real2)+")+("+((real1*imag2)+(real2*imag1))+")i +("+(imag1*imag2)*(-1)+")");
		//Multiplicación

		System.out.println("Si es una multiplicación tu ecuación es: (("+real1+")+("+imag1+")i) / (("+real2+")+("+imag2+")i)");
		System.out.println("Al hacer la resta se expresa como: ((("+real1+")+("+imag1+")i)*((("+real2+")-("+imag2+")i)) / ((("+real2+")+("+imag2+")i))*(("+real2+")-("+imag2+")i))");
		System.out.println("Hay que recordar que al dividir complejos, se multiplica tanto el numerador y como eldenominador, por el conjugado del denominador");
		System.out.println("Y su resultado es: (("+ ((real1*real2)+(imag1*imag2))+")+("+((imag1*real2)-(real1*imag2))+")i) / ("+((real2*real2)+(imag2*imag2))+")");
		//División
	}
}