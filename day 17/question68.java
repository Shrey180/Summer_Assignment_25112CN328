import java.util.Scanner;

public class question68 {
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
        
        System.out.println("\nCommon elements are:");
        boolean foundAny = false;
        
        int[] trackingDuplicates = new int[n1];
        int trackCount = 0;
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Filter out duplicate logs
                    boolean alreadySeen = false;
                    for (int k = 0; k < trackCount; k++) {
                        if (arr1[i] == trackingDuplicates[k]) {
                            alreadySeen = true;
                            break;
                        }
                    }
                    if (!alreadySeen) {
                        System.out.print(arr1[i] + " ");
                        trackingDuplicates[trackCount] = arr1[i];
                        trackCount++;
                        foundAny = true;
                    }
                    break;
                }
            }
        }
        
        if (!foundAny) {
            System.out.print("No common elements discovered.");
        }
        System.out.println();
        
        scanner.close();
    }
}