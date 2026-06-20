import java.util.Scanner;

public class question92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int maxCount = 0;
        char maxChar = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int currentCount = 0;
            
            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    currentCount++;
                }
            }
            
            // If it occurs more than our previous record, update trackers
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = ch;
            }
        }
        
        if (str.length() > 0) {
            System.out.println("Maximum occurring character is: '" + maxChar + "' (Appears " + maxCount + " times)");
        } else {
            System.out.println("String is empty.");
        }
        
        scanner.close();
    }
}