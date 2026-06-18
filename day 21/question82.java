import java.util.Scanner;

public class question82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        
        char[] chars = str.toCharArray();
        
        System.out.print("Reversed string: ");
        // Loop backwards from the last character to the first
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}