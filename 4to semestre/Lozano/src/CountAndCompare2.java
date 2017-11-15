import java.util.*;
public class CountAndCompare2 {
	public static void main(String[] args){
		int pos;
		boolean ok=true;
		Scanner sc = new Scanner(System.in);
		String pal1= sc.next();
		String pal2= sc.next();
		
		int[] fra1 = new int[pal1.length()];
		int[] fra2 = new int[pal2.length()];
		
		for(int i=0;i<pal1.length();i++){
			pos = (int)pal1.charAt(i);
			pos = pos - ((int)'a');
			fra1[pos]= 1;
		}
		for(int i=0;i<pal2.length();i++){
			pos = (int)pal2.charAt(i);
			pos = pos - ((int)'a');
			fra2[pos]= 1;
		}
		
		int i=0;
		while((i<pal1.length())&&ok){
			if(fra1[i]==fra2[i]){
				i++;
			}else{
				ok=false;
			}
		}
	}
}
