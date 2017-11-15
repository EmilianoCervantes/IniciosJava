package edu.itesm.mx.proyecto;

public class Anotaciones {
	/*public void crearGrafo(){
	int tamano= 10; //
	String sent = "positivo";
	Grafo  g = new Grafo();
	
	CircularDoubleLinkedList<Nodo> lista = new CircularDoubleLinkedList();
	
	lista.addLast(new Personaje("Bob", 20));
	lista.addLast(new Personaje("Charlie", 5));
	g.put(  "Alice", lista  );
	lista = new CircularDoubleLinkedList();
	
	lista.addLast(new Personaje("Charlie", 10));
	g.put(  "Bob", lista  );
	lista = new CircularDoubleLinkedList();
	g.put(   "Charlie", lista );
	
	System.out.println(g);
	Graph grafo=new SingleGraph("Demo Grafo");
	
	//tweet : tweets 
	for(int j=0; j<tamano ;j++){
		//tweet2 : tweets
		for(int k=0;k<tamano;k++){
			//tweet.split : tweets
			for(int l=0;l<tamano;l++){
				//tweet2.split : tweets
				for(int m=0;m<tamano;m++){
					
				}
			}
		}
	}
	
	int contSentPos = 0 ;
	int contSentNeg = 0 ;
	int contSentNeu = 0 ;
	if(sent=="neutro"){
		for(String nodo:g.keySet()){
			contSentNeu++;
				Node n=grafo.addNode(nodo);
				n.addAttribute("ui.label",nodo);
				//n.addAttribute("ui.style", "shape: box; fill-color: rgb(0, 180, 22); size: 15px, 20px;");
				n.setAttribute("ui.style", "fill-color: rgb(255,90,57); size: (1*tamano)px, (1*tamano)px;");
		}
		for(String nodo:g.keySet()){
			for(int i=0;i<g.get(nodo).size();i++){
				Nodo personaje=g.get(nodo).get(i);
				Edge arista=grafo.addEdge(nodo+personaje.nombre, nodo, personaje.nombre,true);
				arista.addAttribute("ui.label",personaje.edad);
			}
		}
	}
	grafo.display();
	//D
	int suma = 0, sumat = 0, aristas=0;
	for(String nodo : g.keySet()){
		// Recorrer  de nuevo la lista de tweets para comparar la lista del nodo con la del nodo 2
		for(String nodo2 : g.keySet()){
			// Recorrer Palabras de la lista de cada nodo
			Edge arista = null;
			// Recorrer  de la lista de palabras del nodo 1
			suma += (g.get(nodo)).countEquivalences(g.get(nodo2));

			try{
				if(nodo.compareTo(nodo2) != 0 && suma != 0){
					// Agregar aristas de nodo a nodo con peso de suma
					arista = g.addEdge(nodo + nodo2, nodo, nodo2, false);
					arista.addAttribute("ui.label", suma);
					sumat += suma;
					aristas++;
				}	
			}catch(Exception ex){
				
			}
			suma = 0;
		}
		g.getNode(nodo).addAttribute("ui.label", nodo);
		g.getNode(nodo).addAttribute("ui.style", "fill-color: " + Text.getMoodHex(nodo) + ";size: "+(aristas*2)+";");
		//g.setAttribute("ui.style", "fill-color: rgb(255,90,57); size: (5*aristas)px, (5*int aristas)px;");
		sumat = 0;
		aristas = 0;
	}
}*/
}
