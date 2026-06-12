import java.util.*;
public class addingarrays{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array one size:");
	int l1=sc.nextInt();
	int arr1[]=new int[l1];
	for(int i=0;i<l1;i++){
	    arr1[i]=sc.nextInt();
	}
	for(int i=0;i<l1;i++){
	    System.out.println(" "+arr1[i]);
	}
    System.out.println("enter array two size:");
	int l2=sc.nextInt();
	int arr2[]=new int[l2];
	for(int i=0;i<l2;i++){
	    arr2[i]=sc.nextInt();
	}
		for(int i=0;i<l2;i++){
	    System.out.println(" "+arr2[i]);
	}
	for(int i=0;i<l1;i++){
	    arr1[i]=arr1[i]+arr2[i];
	}
	System.out.println("the sum of two arrays is:");
	for(int i=0;i<l1;i++){
	    System.out.println(" "+arr1[i]);
	}
    System.out.println("the sorted array is:");
	Arrays.sort(arr1);
		for(int i=0;i<l1;i++){
	    System.out.println(" "+arr1[i]);
	}
	
	}
}