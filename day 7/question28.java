import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int n = scanner.nextInt();
        
        System.out.print("Reversed number: ");
        if (n == 0) {
            System.out.println(0);
        } else {
            reverse(n);
            System.out.println();
        }
        
        scanner.close();
    }
    
    // Recursive method that prints the last digit and moves inward
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        // Print the last digit immediately
        System.out.print(n % 10);
        // Pass the remaining digits to the next recursive call
        reverse(n / 10);
    }
}