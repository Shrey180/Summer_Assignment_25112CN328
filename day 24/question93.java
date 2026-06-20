import java.util.Scanner;

public class question93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter original string (str1): ");
        String str1 = scanner.nextLine();
        System.out.print("Enter rotated string candidate (str2): ");
        String str2 = scanner.nextLine();
        
        // Step 1: Check if lengths match and are not empty
        if (str1.length() == str2.length() && str1.length() > 0) {
            
            // Step 2: Concatenate str1 with itself
            String concatenated = str1 + str1;
            
            // Step 3: Check if str2 is contained within the concatenated string
            if (concatenated.contains(str2)) {
                System.out.println("Yes, \"" + str2 + "\" is a valid rotation of \"" + str1 + "\".");
            } else {
                System.out.println("No, \"" + str2 + "\" is NOT a rotation of \"" + str1 + "\".");
            }
            
        } else {
            System.out.println("No, strings must have the identical non-zero length.");
        }
        
        scanner.close();
    }
}