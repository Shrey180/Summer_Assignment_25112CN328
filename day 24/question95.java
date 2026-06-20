import java.util.Scanner;

public class question95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String longestWord = "";
        String currentWord = "";
        
        // Add a space loop buffer at the end to force check the very last word
        String target = sentence + " ";
        
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            
            // Build word if character is not a space
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                currentWord += ch;
            } else {
                // Word complete, check if it breaks the length record
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // Reset for next word
            }
        }
        
        if (longestWord.length() > 0) {
            System.out.println("The longest word is: \"" + longestWord + "\"");
        } else {
            System.out.println("No words found.");
        }
        
        scanner.close();
    }
}