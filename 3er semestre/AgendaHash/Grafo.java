import java.util.*;

public class Grafo extends HashMap<String, CircularDoubleLinkedList<Contacto>>{
	public Grafo(){
		super();
	}

	public static void main(String e[]){
		Grafo g = new Grafo();

		CircularDoubleLinkedList<Contacto> lista = new CircularDoubleLinkedList();

		lista.addLast(new Contacto("Bob",20));
		lista.addLast(new Contacto("Charlie",5));
		g.put("Alice", lista);

		lista = new CircularDoubleLinkedList();
		g.put("Bob", lista);
		lista = new CircularDoubleLinkedList();
		g.put("Charlie", lista);

		System.out.println(g);
	}
}