import java.util.Scanner;

public class question64 {
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
        
        // Temporary array to store unique elements
        int[] temp = new int[n];
        int uniqueCount = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isAlreadyAdded = false;
            
            // Check if current element is already present in the temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isAlreadyAdded = true;
                    break;
                }
            }
            
            // If it's a brand new element, add it to our temp array
            if (!isAlreadyAdded) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}