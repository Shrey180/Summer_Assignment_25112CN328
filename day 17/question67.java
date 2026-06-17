import java.util.Scanner;

public class question67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        System.out.println("\nIntersection of the two arrays:");
        int[] printed = new int[Math.min(n1, n2)];
        int printedCount = 0;
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if we've already displayed this value to avoid repeating it
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < printedCount; k++) {
                        if (arr1[i] == printed[k]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr1[i] + " ");
                        printed[printedCount] = arr1[i];
                        printedCount++;
                    }
                    break; // Move to next element in arr1
                }
            }
        }
        System.out.println();
        
        scanner.close();
    }
}