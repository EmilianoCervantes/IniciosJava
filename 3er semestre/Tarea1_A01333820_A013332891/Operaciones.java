public interface Operaciones{

	/**
	Valida si el número es palíndromo, puede ser de n dígitos... los que soporta un entero.
	**/
	public boolean esPalindromo(int numero );

	/**
	Suma dos enteros y valida si la suma genera un número palíndromo, Ejemplo:
	36 +  63 = 99, 99 es un número palíndromo
	**/
	public boolean laSumaEsPalindromo(int a, int b);

	/**
	Genera un número palíndromo aleatorio PERO depende del número de dígitos, ejemplo:
	numeroDeDigitos = 3, salida: 111
	numeroDeDigitos = 3, salida: 121
	numeroDeDigitos = 4, salida: 3333
	numeroDeDigitos = 4, salida: 6666
	numeroDeDigitos = 4, salida: 1661
	Cada corrida debe de ser un número diferente
	**/
	public String generaPalindromo(int numeroDeDigitos ); 

	/**
	Genera un número palíndromo aleatorio PERO depende del número de dígitos, ejemplo:
	numeroDeDigitos = 3, salida: 111
	numeroDeDigitos = 3, salida: 101
	numeroDeDigitos = 4, salida: 1001
	numeroDeDigitos = 4, salida: 1111
	numeroDeDigitos = 5, salida: 10001
	Cada corrida debe de ser un número diferente
	**/
	public String generaPalindromoBinario(int numeroDeDigitos);

}