import java.util.Scanner;

public class question63 {
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
        
        System.out.print("\nEnter the target sum: ");
        int targetSum = scanner.nextInt();
        
        boolean pairFound = false;
        System.out.println("Pairs with the given sum are:");
        
        // Compare every element with all subsequent elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }
        
        if (!pairFound) {
            System.out.println("No pairs found with the sum " + targetSum);
        }
        
        scanner.close();
    }
}