import java.util.Scanner;

public class question62 {
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
        
        int maxFrequency = 0;
        int mostFrequentElement = arr[0];
        
        // Count frequencies using nested loops
        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    currentCount++;
                }
            }
            
            // If current element's frequency is higher than our previous record, update it
            if (currentCount > maxFrequency) {
                maxFrequency = currentCount;
                mostFrequentElement = arr[i];
            }
        }
        
        System.out.println("\nElement with maximum frequency: " + mostFrequentElement);
        System.out.println("Its frequency is: " + maxFrequency);
        
        scanner.close();
    }
}