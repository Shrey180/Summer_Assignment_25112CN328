import java.util.Scanner;

public class question61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements currently in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements (from a sequence of 1 to " + (n + 1) + "):");
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
            actualSum += arr[i]; // Add up elements as we take input
        }
        
        // Total expected elements in the complete sequence
        int totalElements = n + 1; 
        
        // Sum of first 'totalElements' natural numbers formula: (N * (N + 1)) / 2
        int expectedSum = (totalElements * (totalElements + 1)) / 2;
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("\nThe missing number is: " + missingNumber);
        
        scanner.close();
    }
}