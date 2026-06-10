import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        
        int original = binary;
        int decimal = 0;
        int base = 1; // Represents 2^0 initially
        
        // Process each binary digit from right to left
        while (binary > 0) {
            int lastDigit = binary % 10;
            binary /= 10;
            
            decimal += lastDigit * base;
            base *= 2; // Move to the next power of 2 (2^1, 2^2, etc.)
        }
        
        System.out.println("Decimal representation of " + original + " is: " + decimal);
        
    }
}