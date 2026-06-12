
import java.util.Scanner;
public class find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter the element to find");
        int find_element=scanner.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==find_element){
                c=1;
                break;}
        }
        if(c==1){
            System.out.println(find_element+" is found");
        }
        else{
            System.out.println(find_element+" is not  found");
        }
    }
}
