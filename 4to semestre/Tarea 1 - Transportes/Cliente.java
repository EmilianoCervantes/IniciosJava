import java.io.*;
import javax.swing.DefaultListModel;

public class Cliente{
	
	private String nombre;
	private boolean mayor;
	public String[] archivo = {"clientes.txt"};
	
	public DefaultListModel mostrar(DefaultListModel dlm){
		BufferedReader lector = null;
		try{
			lector = new BufferedReader(new FileReader(archivo[0]));
			while(lector.ready()){
				dlm.addElement(lector.readLine());
			}              
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return dlm;
	}
	public void agregar(String palabra) throws IOException{
		BufferedReader lector = new BufferedReader(new FileReader(archivo[0]));
		CircularDoubleLinkedList<String> cl = new CircularDoubleLinkedList();
		while(lector.ready()){
			cl.addLast(lector.readLine());	
		}  
		cl.addLast(palabra);
		File f = new File(archivo[0]);
		FileWriter fw = new FileWriter(f,false);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(cl.toString());
		fw.close();
	}
	
	public void borrar(String palabra) throws IOException{
		BufferedReader lector = new BufferedReader(new FileReader(archivo[0]));
		CircularDoubleLinkedList<String> cl = new CircularDoubleLinkedList();
		while(lector.ready()){
			if(!lector.readLine().equals(palabra)){
				cl.addLast(lector.readLine());
			}	
		}
		File f = new File(archivo[0]);
		FileWriter bw = new FileWriter(f,false);
		PrintWriter out = new PrintWriter(bw);
		out.write(cl.toString());
		bw.close();
	}
	
	public void setNombre(String nom){
		this.nombre=nom;
	}
	public String getNombre(){
		return this.nombre;
	}
	
	public void setMayor(boolean mayor){
		this.mayor=mayor;
	}
	public boolean getMayor(){
		return this.mayor;
	}
}
