import java.util.Scanner;

public class question81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int length = 0;
        
        // Convert string to character array and count manually
        for (char ch : str.toCharArray()) {
            length++;
        }
        
        System.out.println("Length of the string is: " + length);
        
        scanner.close();
    }
}