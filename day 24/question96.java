import java.util.Scanner;

public class question96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with duplicate characters: ");
        String str = scanner.nextLine();
        
        StringBuilder uniqueResult = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is already inside our result string
            // indexOf returns -1 if the character is not found
            if (uniqueResult.indexOf(String.valueOf(ch)) == -1) {
                uniqueResult.append(ch);
            }
        }
        
        System.out.println("String after removing duplicates: " + uniqueResult.toString());
        
        scanner.close();
    }
}