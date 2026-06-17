import java.util.Scanner;

public class question71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements (MUST be sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("\nEnter the target element to search for: ");
        int target = scanner.nextInt();
        
        // Binary Search variables
        int low = 0;
        int high = n - 1;
        int foundIndex = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow
            
            if (arr[mid] == target) {
                foundIndex = mid;
                break; // Target found, exit loop
            } 
            else if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } 
            else {
                high = mid - 1; // Target is in the left half
            }
        }
        
        // Output result
        if (foundIndex != -1) {
            System.out.println("Element " + target + " found via Binary Search at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
        
        scanner.close();
    }
}