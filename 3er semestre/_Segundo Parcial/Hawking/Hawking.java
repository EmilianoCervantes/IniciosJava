import javax.swing.*;

public class Hawking{
  public static void main(String[] args) {
    CircularDoubleLinkedList<ABB<Planeta>> universo = new CircularDoubleLinkedList<ABB<Planeta>>();

    for (int i = 0; i<100 ; i++) {
      ABB<Planeta> arbol = new ABB<Planeta>();
      int tamaño = (int) (Math.random()*100);
      for (int j = 0; j< tamaño ; j++) {
        int no = (int) (Math.random()*(10));
        int edad =  (int) (Math.random()*(90000)+1000);
        String nombre = "";
        for (int k = 0; k < no ; k++) {
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          int letra = (int) (Math.random()*(25));
          nombre += abc.charAt(letra);
        }
        Planeta planeta = new Planeta(nombre, edad);
        arbol.insert(planeta);
      }
      universo.addFirst(arbol);
    }

        System.out.println(universo);
        for (int i = 0; i< universo.size(); i++) {
          if(universo.get(i).isEmpty()){ 
       	 System.out.println(i);
          }
        }
        CircularDoubleLinkedList<ABB<Planeta>> multiverso = new CircularDoubleLinkedList<ABB<Planeta>>();
        for (int i = 0; i< universo.size() ; i++) {
          multiverso.addFirst(universo.get(i));
        }
        sistemasSolaresAux.selectionSort();
        for (int i= 0; i<20 ; i++ ) {
          
        System.out.println( universo.indexOf(multiverso.get(i)));
        }
        int pos = -1;
        boolean completo;
        do {
          pos++;
          try{
            completo = multiverso.get(pos).completo();
          }
          catch(NullPointerException e){
            System.out.println("No hay ningun Sistema Solar completo");
            completo = true;
          }
        } while (completo == false);
        if(pos < 100){
          System.out.println("Sistema Solar completo en posicion: " + pos + "\t" + multiverso.get(pos));
        }
  }
}
