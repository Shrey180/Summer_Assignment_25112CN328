import java.util.Scanner;

public class question56 {
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
        
        System.out.println("\nDuplicate elements in the given array: ");
        boolean defaultNoDuplicate = true;
        
        // Nested loop to compare each element with all other elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if we have already counted/printed this duplicate earlier
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If it wasn't seen before, check if it appears further down the array
            if (!isDuplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        defaultNoDuplicate = false;
                        break; // Print once and break to avoid repetitive printing
                    }
                }
            }
        }
        
        if (defaultNoDuplicate) {
            System.out.print("None");
        }
        System.out.println();
        
        scanner.close();
    }
}