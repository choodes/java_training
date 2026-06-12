import java.util.Scanner;
public class maximumelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maximum=0;
        
        for (int i = 0; i < n; i++) {
            if(maximum < arr[i]){
                maximum=arr[i];
            }
            
        }

        System.out.println("Maximum element in array:"+maximum);
    }
    
}
