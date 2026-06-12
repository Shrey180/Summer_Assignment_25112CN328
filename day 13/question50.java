import java.util.Scanner;

public class question50 {
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
        
        int sum = 0;
        
        // Calculate the sum of all elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        // Calculate the average (using a double cast to preserve decimal precision)
        double average = (double) sum / n;
        
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        scanner.close();
    }
}