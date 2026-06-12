import java.util.Scanner;

public class question52 {
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
        
        int evenCount = 0;
        int oddCount = 0;
        
        // Check every element to see if it is divisible by 2
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("\nTotal number of Even elements: " + evenCount);
        System.out.println("Total number of Odd elements: " + oddCount);
        
        scanner.close();
    }
}