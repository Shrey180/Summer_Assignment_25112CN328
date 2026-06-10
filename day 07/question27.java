import java.util.Scanner;

public class question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find the sum of its digits: ");
        int n = sc.nextInt();
        
        int result = sumOfDigits(n);
        
        System.out.println("Sum of digits is: " + result);
        
    }
    
    // Recursive method to sum digits
    public static int sumOfDigits(int n) {
        // Base case: if single digit left, return the number itself
        if (n == 0) {
            return 0;
        }
        // Take the last digit and add it to the result of the remaining number
        return (n % 10) + sumOfDigits(n / 10);
    }
}