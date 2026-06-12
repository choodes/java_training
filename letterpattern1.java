import java.util.*;
public class letterpattern1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    char ch='A';
	    ch+=n-1;
	    int k=n;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=k;j++){
	           
	            System.out.print(ch);
	        }
	        System.out.println();
	        ch--;
	        k--;
	        
	    }
		
	}
}
