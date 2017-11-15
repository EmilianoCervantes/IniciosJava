import java.util.Scanner;
public class BruteForce {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ana = sc.nextLine();
		//anagrama(ana);
	}
	
	public String anagrama(String ana){
		String temp="",an="", temp2;
		
		for(int i=0;i<ana.length()-1;i++){
			temp += ""+ ana.charAt(i+1);
		}
		
		if(ana.length() <=1){
			return ana;
		}else{
			temp2 = anagrama(temp);
			for(int i=0;i<temp.length();i++){
				for(int j=0;j<temp.length();j++){
					an += ""+ana.charAt(i) +ana.charAt(0) +ana.charAt(i);
				}
			}
		}
		return an;
	}
}
