import java.io.*;

public class Test{

	public static void main(String []args){


		Arreglo<Alumno> arreglo = new Arreglo(33044);
		int i=0;
		try{

        	BufferedReader lector= new BufferedReader(new FileReader("nombres.txt"));

        	while(lector.ready()){

        		String data[]= lector.readLine().split(",");
        		arreglo.agrega(i, new Alumno(data[0],(int)Math.random()*100));
        		i++;
       		}

        } catch (Exception ex){

        		ex.printStackTrace();

        }
		arreglo.ordenarBurbuja();
		System.out.println(arreglo.toString());
		System.out.println(arreglo.buscaSecuencial(new Alumno("hola",19)));
		System.out.println(arreglo.buscaSecuencial(new Alumno("Zyrin",20)));
	}
}