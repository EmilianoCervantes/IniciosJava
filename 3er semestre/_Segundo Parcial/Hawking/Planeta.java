public class Planeta implements Comparable<Planeta>{
  private String nombre;
  private int edad;

  public Planeta(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return nombre;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }

  public int getEdad(){
    return edad;
  }

  public String toString(){
    return nombre + " " + edad;
  }

  public int compareTo(Planeta planeta){
    return ((Comparable)this.edad).compareTo(planeta.getEdad());
  }

}
