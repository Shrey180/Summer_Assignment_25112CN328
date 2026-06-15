import java.util.Scanner;

public class question55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Edge case handling if array has less than 2 elements
        if (n < 2) {
            System.out.println("Array must contain at least 2 elements.");
            scanner.close();
            return;
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Initialize largest and secondLargest to the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find the second largest element in a single pass
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Old largest becomes second largest
                largest = arr[i];        // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];   // Update second largest if it's smaller than largest
            }
        }
        
        // Output result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        
        scanner.close();
    }
}