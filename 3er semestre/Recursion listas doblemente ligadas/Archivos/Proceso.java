/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author david_escarcega
 */
public class Proceso implements Comparable<Proceso>{

    private int  x, y, ancho, alto;
    private int prioridad;
    public static int xtemp = 10;
    public Proceso(int c){
    		 int z = (c * 300) /100;
    		 prioridad = c;
         y = 300-z;
         ancho = 8;
         alto = 300 - y;
         x = xtemp += 12;
    }


	public void setX(int x) {
		this.x = x;
	}


	@Override
    public String toString() {
        return "("+ x + " : " + y + " a " + ancho + " al " + alto + " p " + prioridad + ")";
    }



    public void update(Graphics g) {
    		System.out.println("xy " +toString() );
        g.setColor(this.getRandomColor());
        g.fillRect(x, y, ancho, alto);
        g.drawString(prioridad + "",x, y);

    }


    public Color getRandomColor() {
        int r, g, b;
        Random numGen = new Random();

        r = numGen.nextInt(255);
        g = numGen.nextInt(255);
        b = numGen.nextInt(255);
        Color cl = new Color(r, g, b);
        return cl;
    }

	@Override
	public int compareTo(Proceso o) {
		// TODO Auto-generated method stub
		return Integer.compare(prioridad, o.prioridad);
	}
}
