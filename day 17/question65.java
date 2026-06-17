import java.util.Scanner;

public class question65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // Create a merged destination array
        int[] merged = new int[n1 + n2];
        int index = 0;
        
        // Copy elements from the first array
        for (int i = 0; i < n1; i++) {
            merged[index] = arr1[i];
            index++;
        }
        
        // Copy elements from the second array
        for (int i = 0; i < n2; i++) {
            merged[index] = arr2[i];
            index++;
        }
        
        System.out.println("\nMerged array elements:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}