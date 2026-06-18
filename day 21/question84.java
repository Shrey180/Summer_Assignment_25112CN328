import java.util.Scanner;

public class question84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string in lowercase: ");
        String str = scanner.nextLine();
        
        char[] chars = str.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if character is currently lowercase
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                // Subtract 32 from ASCII value to convert to uppercase
                chars[i] = (char) (chars[i] - 32);
            }
        }
        
        // Convert the modified character array back into a printable String
        String result = new String(chars);
        
        System.out.println("String in Uppercase: " + result);
        
        scanner.close();
    }
}