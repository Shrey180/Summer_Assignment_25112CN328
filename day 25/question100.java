import java.util.Scanner;

public class question100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split sentence into words using spaces as the delimiter
        String[] words = sentence.split(" ");
        int n = words.length;
        
        // Sort words using Bubble Sort based on their individual length
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nWords sorted by length:");
        for (int i = 0; i < n; i++) {
            if (!words[i].isEmpty()) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}