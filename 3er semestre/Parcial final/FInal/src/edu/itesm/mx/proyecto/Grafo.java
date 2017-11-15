package edu.itesm.mx.proyecto;

import java.util.*;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.*;

public class Grafo extends HashMap<String, CircularDoubleLinkedList<String>>{
	boolean[] rec;
	CircularDoubleLinkedList<Nodo> pila;
	int costo;

	public Grafo(){
		super();
	}
	
	public boolean BFS(Grafo g, CircularDoubleLinkedList<Nodo> c) {
		boolean recorrido = false;
		//linked list de test
		//Nuevo linked list utilizada como cola
		CircularDoubleLinkedList<Nodo> cola = new CircularDoubleLinkedList();
		rec = new boolean[c.size()];
		//recorrer c/nodo del grafo
		//mejor utilizar el tweet para agregar a sus nodos adyacentes
		//después se van a pedir los adyacentes de ese para recorrerlos
		int i=0;
		for(String nodo : g.keySet()){
			if(i==0){
		    	Nodo node = new Nodo(nodo);
				cola.addLast(node);
	    	}
	    	//No visitado
	    	//g.getNode(nodo).addAttribute("ui.style", "fill-color: rgb(128,128,128);size: "+(5*aristas)+";");
	    	rec[i]=false;
	    	i++;
		}
		//nodo 1 ya recorrido pero no se marca sino hasta el sig. for
		i=0;
		while(!cola.isEmpty()){
	        // extraer el nodo i de la cola y explorar todos sus nodos adyacentes
	        for(String nodo : g.keySet()){
	        	if(rec[i]==false){
	        	   //g.getNode(nodo).setAttribute("ui.style", "fill-color: rgb(255, 69, 0);size: "+(5*aristas)+";");
	        	   //pedir adyacentes de cola(i) --> falta
	        	   rec[i]=true;
	        	   Nodo adyacente;
	        	   //cola.addLast(adyacente);
	               cola.remove(i-1);
	               i++;
	        	}
	        }
		}
		recorrido=true;
		//chequeo de seguridad
		for(i=0;i<rec.length;i++){
			if(rec[i]==false){
				recorrido=false;
			}
		}
	    return recorrido;
	  }
	
	public boolean DFS(Grafo g, CircularDoubleLinkedList<Nodo> c){
		boolean recorrido = false;
		pila = new CircularDoubleLinkedList();
		rec = new boolean[c.size()];
		int i=0;
	    for(String nodo : g.keySet()){
	    	rec[i]=false;
	    	//g.getNode(nodo).addAttribute("ui.style", "fill-color: rgb(128,128,128);size: "+(5*aristas)+";");
	    	i++;
	    }
	    i=0;
	    costo=0;
	    //pila podría ser la sublista de los tweets adyacentes al que se envía
	    for(String nodo : g.keySet()){
	    	Nodo node = new Nodo(nodo);
	    	pila.addLast(node);
	    	if(rec[i]==false){
	    		DFS(costo, i, pila);
	    	}
	    	i++;
	    }
	    recorrido=true;
		return recorrido;
	}
	private void DFS(int costo, int i, CircularDoubleLinkedList<Nodo> pila){
		costo+=1;
		//Agregar el costo a la arista
		
		//se va a checar para cada tweet vecino
		//cambiar for para que haga eso
		while(!pila.isEmpty()){
			//ver si nodos adyacentes al nodo enviado han sido recorridos
			if(rec[i]==false){
				//g.getNode(nodo).setAttribute("ui.style", "fill-color: rgb(255, 69, 0);size: "+(5*aristas)+";");
				rec[i]=true;
				pila.removeLast();
				DFS(costo, i, pila);
			}
			i++;
		}
	}
}