import java.util.*;
public class anagram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String w1=sc.nextLine();
		String w2=sc.nextLine();
		char c1[]=w1.toCharArray();
		char c2[]=w2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)){
		    System.out.println("anagram");
		}
		else{
		    System.out.println("not aanagram");
		}
		
	}
}
