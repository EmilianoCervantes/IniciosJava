import java.io.*;

public class Test{
	
	public static void main(String []ar){


		//Arreglo<Alumno> arreglo = new Arreglo(33044);	
		try{

        	BufferedReader lector= new BufferedReader(new FileReader("nombres.txt"));

        	while(lector.ready()){

        		String data[]= lector.readLine().split(",");
        		// el nombre se encuentra en la posición 0 de data[0]	
        		System.out.println(data[0]);
        		// Llena el arreglo con los nombres y las edad aleatorias menores a 100


       		}

        } catch (Exception ex){

        		ex.printStackTrace();

        }

        //Ejecuta el método de ordenaBurbuja de la clase Arreglo
        //Ejecuta el método de toString de la clase Arreglo
        //Ejecuta el método de buscaSecuencial de la clase Arreglo con un nombre que si existe y otro que no.

	}
}