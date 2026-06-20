import java.util.Scanner;

public class question86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int wordCount = 0;
        boolean insideWord = false;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // If character is not a space and we weren't already inside a word, we found a new word
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!insideWord) {
                    wordCount++;
                    insideWord = true;
                }
            } else {
                // If it is a space, we are no longer inside a word
                insideWord = false;
            }
        }
        
        System.out.println("Total word count: " + wordCount);
        
        scanner.close();
    }
}