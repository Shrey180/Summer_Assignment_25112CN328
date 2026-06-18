import java.util.Scanner;

public class question83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        
        // Convert to lowercase to make checking simple
        String lowerStr = str.toLowerCase();
        
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if character falls within lowercase alphabetical letters a-z
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        scanner.close();
    }
}