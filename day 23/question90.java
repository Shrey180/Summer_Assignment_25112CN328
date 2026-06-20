import java.util.Scanner;

public class question90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check all subsequent characters for a match
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    System.out.println("The first repeating character is: " + ch);
                    found = true;
                    break;
                }
            }
            
            if (found) {
                break; // Exit the outer loop once found
            }
        }
        
        if (!found) {
            System.out.println("There are no repeating characters in the string.");
        }
        
        scanner.close();
    }
}