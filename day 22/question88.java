import java.util.Scanner;

public class question88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with spaces: ");
        String str = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        // Loop through the string and append only non-space characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t') {
                result.append(ch);
            }
        }
        
        System.out.println("String after removing spaces: " + result.toString());
        
        scanner.close();
    }
}