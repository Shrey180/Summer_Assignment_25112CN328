import java.util.Scanner;

public class question98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        // Boolean array to keep track of matched characters in the second string
        boolean[] visited2 = new boolean[arr2.length];
        
        System.out.print("Common characters are: ");
        boolean found = false;
        
        for (int i = 0; i < arr1.length; i++) {
            // Avoid evaluating duplicate characters from the first string multiple times
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyChecked = true;
                    break;
                }
            }
            
            if (!alreadyChecked) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j] && !visited2[j]) {
                        System.out.print(arr1[i] + " ");
                        visited2[j] = true; // Mark as visited so it isn't matched again
                        found = true;
                        break; 
                    }
                }
            }
        }
        
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        
        scanner.close();
    }
}