import java.util.*;
public class letterpattern2
{      public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        if(n%2==0){System.out.println("enetr odd number only");}
	    else{int c=n/2+1;
         for(int i=1;i<=c;i++){
             for(int j=1;j<=n;j++){
                if(j<=c){
	            if((j==c)||(j>=c+(i-1))||(j>=c-(i-1))){
	           
	            System.out.print("*");}
	            else{
	                System.out.print("b");}
	        }
        else{
               if((j==c)||(j<=c+(i-1))||(j<=c-(i-1))){
	           System.out.print("*");}
	            else{
	                System.out.print("b");
	            }}
	        }
        System.out.println();
    }
		
	}}
}
