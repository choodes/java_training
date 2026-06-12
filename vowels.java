import java.util.*;
public class vowels
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String word=sc.nextLine();
		word=word.toLowerCase();
	
		char arr[]=word.toCharArray();
		int c=0;
		for(int i=0;i<word.length();i++){
		    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
		        c++;
		    }
		}
		System.out.println("vowel count:"+c);
		
	}
}
