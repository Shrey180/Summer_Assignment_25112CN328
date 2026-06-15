import java.util.Scanner;

public class question58 {
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
            // Store the first element
            int first = arr[0];
            
            // Shift all elements to the left by 1 index
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            // Place the first element at the end
            arr[n - 1] = first;
        }
        
        System.out.println("\nArray after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}