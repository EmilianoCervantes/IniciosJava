/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


/**
 *
 * @author david_escarcega
 */
public class Tablero extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean estado = false; //Boolean que indica cuando se debe incrementar el radio
    CircularDoubleLinkedList<Proceso> procesos = null;

    public Tablero() {
        setPreferredSize(new Dimension(1250, 400)); // tama��o del JPanel
        setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Borde del JPanel
        setBackground(Color.WHITE);// fondo obscuro
        procesos = new CircularDoubleLinkedList<Proceso>();



    }

    public void paintComponent(Graphics g) {        
        super.paintComponent(g);  // Paint background, border
    
     g.clearRect(0, 0, 800, 600);
        
        for(int i = 0; i < procesos.size(); i++){
        		procesos.getTemporal(i).update(g);
        }

    }

    /*
     * EXAMEN
     */
    public void newData() {

                        		
        	Random numGen = new Random();
        	procesos.clear();
        	for (int i = 0; i < 100; i++) {
       			procesos.addLast( new Proceso(numGen.nextInt(100)));       			
       		}   

                          /*
                * NO MODIFICAR
                * */
               Proceso.xtemp = 10;
               if(procesos.size() > 0){
                   for (int i = 0; i < 100; i++) {
                       Proceso p = procesos.get(i);
                       if(p != null){
                        p.setX(Proceso.xtemp+=15);
                       }
                   }
               } 
     
        repaint(); //NO BORRAR
        
    }


        public void selectionSort() {
 
                
                procesos.selectionSort();
                           
               /*
                * NO MODIFICAR
                * */
               Proceso.xtemp = 10;
               if(procesos.size() > 0){
                   for (int i = 0; i < 100; i++) {
                       Proceso p = procesos.get(i);
                       if(p != null){
                        p.setX(Proceso.xtemp+=15);
                       }
                   }
               }  
          
        repaint(); //NO BORRAR
        
    }

        public void insertionSort() {
                
                procesos.insertionSort();
                           
               /*
                * NO MODIFICAR
                * */
               Proceso.xtemp = 10;
               if(procesos.size() > 0){
                   for (int i = 0; i < 100; i++) {
                       Proceso p = procesos.get(i);
                       if(p != null){
                        p.setX(Proceso.xtemp+=15);
                       }
                   }
               }   
       
        repaint(); //NO BORRAR
        
    }    
}
