import java.util.Scanner;

public class question60 {
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
        
        int count = 0; // Tracks position for non-zero elements
        
        // Move all non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        
        // Fill the rest of the array positions with zeroes
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        
        System.out.println("\nArray after moving zeroes to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}