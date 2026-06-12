import java.util.*;
public class freq
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String w=sc.nextLine();
		char c[]=w.toCharArray();
		int l=c.length;
		int r[]=new int[l];
		for(int i=0;i<l;i++){
		    int co=0;
		    boolean alreadycountted=false;
		    for(int j=0;j<i;j++){
		        if(c[i]==c[j]){
		            alreadycountted=true;
		            break;
		        }
		    }
		    if(alreadycountted) continue;
		    for(int j=0;j<l;j++){
		        if(c[i]==c[j]){
		            
		            co++;
		            }
		        }
		        r[i]=co;
		        
		    
		    System.out.println(" letter "+c[i]+" = "+r[i]);
		}
	
      } 
		   
	}

