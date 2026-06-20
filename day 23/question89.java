import java.util.Scanner;

public class question89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            
            // Scan the entire string to see how many times 'ch' appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            
            // If count is exactly 1, it is non-repeating
            if (count == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                found = true;
                break; // Stop immediately at the first instance
            }
        }
        
        if (!found) {
            System.out.println("All characters are repeating or the string is empty.");
        }
        
        scanner.close();
    }
}