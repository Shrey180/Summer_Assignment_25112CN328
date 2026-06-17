import java.util.Scanner;

public class question66 {
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
        
        int[] unionTemp = new int[n1 + n2];
        int count = 0;
        
        // Process first array: add elements while stripping internal duplicates
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < count; k++) {
                if (arr1[i] == unionTemp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unionTemp[count] = arr1[i];
                count++;
            }
        }
        
        // Process second array: add elements only if not already present in unionTemp
        for (int i = 0; i < n2; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < count; k++) {
                if (arr2[i] == unionTemp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unionTemp[count] = arr2[i];
                count++;
            }
        }
        
        System.out.println("\nUnion of the two arrays:");
        for (int i = 0; i < count; i++) {
            System.out.print(unionTemp[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}