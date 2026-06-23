import java.util.Scanner;

public class question97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements (must be sorted):");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements (must be sorted):");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        // Compare elements from both arrays and merge them in order
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // Copy any remaining elements of the first array
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        
        // Copy any remaining elements of the second array
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        
        System.out.println("\nMerged Sorted Array:");
        for (k = 0; k < merged.length; k++) {
            System.out.print(merged[k] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}