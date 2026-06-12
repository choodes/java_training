import java.util.Scanner;
public class count {
    public static void main(String[] args) {
       int redpen=0;
       int bluepen=0;
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the array size");
       int n=sc.nextInt();
       
       System.out.println("Enter the array values");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<n-1;i++){
        if(arr[i]%2==0 &&arr[i+1]%2!=0)
        redpen++;

       }
       
       for(int i=0;i<n-1;i++){
        if(arr[i]%2!=0 &&arr[i+1]%2==0)
        bluepen++;

       }
       System.out.println("red pen(even to odd)"+redpen);
       System.out.println("blue pen(odd to even)"+bluepen);
       sc.close();

    }
}
