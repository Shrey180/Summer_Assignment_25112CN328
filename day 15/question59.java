import java.util.Scanner;

public class question59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        
        if (n > 1) {
            // Store the last element
            int last = arr[n - 1];
            
            // Shift elements to the right by 1 index (looping backwards)
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            
            // Place the last element at the front
            arr[0] = last;
        }
        
        System.out.println("\nArray after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}