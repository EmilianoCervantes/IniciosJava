public class Test<T>{
	public static void main(String[] args){
		SimpleList<String> lista = new SimpleList<String>();
		lista.addFirst("A");
		System.out.println(lista);
		lista.addLast("B");
		System.out.println(lista);
		lista.add("C");
		System.out.println(lista);
		lista.add(lista.size(),"D");
		System.out.println(lista);
	}
}