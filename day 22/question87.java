import java.util.Scanner;

public class question87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("\nCharacter frequencies:");
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean alreadyCounted = false;
            
            // Check if this character appeared earlier in the string
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            
            // If it's the first time seeing this character, count its occurrences
            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println("'" + ch + "' -> " + count);
            }
        }
        
        scanner.close();
    }
}