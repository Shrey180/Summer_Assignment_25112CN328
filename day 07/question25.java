import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        long result = factorial(n);
        
        System.out.println("Factorial of " + n + " is: " + result);
        
    }
    
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive assumption and step
        return n * factorial(n - 1);
    }
}