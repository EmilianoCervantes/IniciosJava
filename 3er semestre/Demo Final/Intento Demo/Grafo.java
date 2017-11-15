

import java.util.*;

public class Grafo extends HashMap<String, CircularDoubleLinkedList<Personaje>>{

	public Grafo(){
		super();
	}

	public static void main(String e[]){

			Grafo  g = new Grafo();

			CircularDoubleLinkedList<Personaje> lista = new CircularDoubleLinkedList();
			lista.addLast(new Personaje("Bob", 20));
			lista.addLast(new Personaje("Charlie", 5));
			g.put(  "Alice", lista  );

			lista = new CircularDoubleLinkedList();
			lista.addLast(new Personaje("Charlie", 10));
			g.put(  "Bob", lista  );
			lista = new CircularDoubleLinkedList();
			g.put(   "Charlie", lista );

			System.out.println(g);

			Graph grafo = new SingleGraph("Demo Grafo!");

	}

}






