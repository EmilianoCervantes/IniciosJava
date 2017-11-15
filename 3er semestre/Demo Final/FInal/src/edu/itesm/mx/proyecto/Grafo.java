package edu.itesm.mx.proyecto;


import java.util.*;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.*;

public class Grafo extends HashMap<String, CircularDoubleLinkedList<Personaje>>{

	public Grafo(){
		super();
	}

	public static void main(String e[]){

		Grafo  g = new Grafo();

		CircularDoubleLinkedList<Personaje> lista
		= new CircularDoubleLinkedList();

		lista.addLast(new Personaje("Bob", 20));
		lista.addLast(new Personaje("Charlie", 5));
		g.put(  "Alice", lista  );

		lista
		= new CircularDoubleLinkedList();
		lista.addLast(new Personaje("Charlie", 10));
		g.put(  "Bob", lista  );
		lista
		= new CircularDoubleLinkedList();
		g.put(   "Charlie", lista );

		System.out.println(g);
		Graph grafo=new SingleGraph("Demo Grafo");
		for(String nodo:g.keySet()){
				Node n=grafo.addNode(nodo);
				n.addAttribute("ui.label",nodo);
				n.setAttribute("ui.style", "fill-color: rgb(255,90,57); size: 50px,50px;");

		}
		for(String nodo:g.keySet()){
			for(int i=0;i<g.get(nodo).size();i++){
				Personaje personaje=g.get(nodo).get(i);
				Edge arista=grafo.addEdge(nodo+personaje.nombre, nodo, personaje.nombre,true);
				arista.addAttribute("ui.label",personaje.edad);
			}
	}
		grafo.display();
	}
}