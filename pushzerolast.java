import java.util.Scanner;
public class pushzerolast {
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
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                arr[j]=arr[j+1];
                arr[j+1]=0;
            }}
        }
        System.out.println("The array after pushing zeros to the end is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    
}
}