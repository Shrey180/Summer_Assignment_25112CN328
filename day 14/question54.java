import java.util.Scanner;

public class question54 {
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
        
        System.out.print("\nEnter the element to find its frequency: ");
        int target = scanner.nextInt();
        
        int count = 0;
        
        // Count occurrences directly inside main
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        
        System.out.println("The frequency of " + target + " in the array is: " + count);
        
        scanner.close();
    }
}