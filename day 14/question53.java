import java.util.Scanner;

public class question53 {
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
        
        System.out.print("\nEnter the target element to search for: ");
        int target = scanner.nextInt();
        
        int foundIndex = -1; // Initialize with -1 (not found)
        
        // Direct Linear Search logic inside main
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break; // Exit loop once found
            }
        }
        
        // Output the result
        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
        
        scanner.close();
    }
}