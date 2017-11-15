/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author david_escarcega
 */
public class TableroFrame extends javax.swing.JFrame {

    private Tablero tablero;
    private JButton button, button2, button3;
    

    public TableroFrame() {
        super();
        tablero = new Tablero();
        JPanel jp=new JPanel();
        
        button = new JButton("New Data");

        //Boton de ordena
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                    tablero.newData();
            }
        });
        jp.add(button);


        button2 = new JButton("Selection Sort");
        //Boton de ordena
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                    tablero.selectionSort();
            }
        });
        jp.add(button2);


       button3 = new JButton("Insertion Sort");
        //Boton de ordena
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                    tablero.insertionSort();
            }
        });
        jp.add(button3);
        getContentPane().add(tablero, BorderLayout.CENTER);
        getContentPane().add(jp,BorderLayout.SOUTH);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

	

    public static void main(String args[]) {
    	
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TableroFrame().setVisible(true);
            }
        });
    }
}
