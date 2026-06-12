import java.util.Scanner;

public class question51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Initialize largest and smallest with the first element of the array
        int largest = arr[0];
        int smallest = arr[0];
        
        // Traverse the array to find extreme values
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
        scanner.close();
    }
}