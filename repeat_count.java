
import java.util.Scanner;
public class repeat_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int countarray[]=new int[n];
        
        System.out.println("the count of repeated element in array");
         for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
         countarray[i]=c;
        }
        for(int i=0;i<n;i++){
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println(arr[i] + " occurs " + countarray[i] + " time" + (countarray[i] > 1 ? "s" : ""));
            }
        }

        scanner.close();

    }


}
