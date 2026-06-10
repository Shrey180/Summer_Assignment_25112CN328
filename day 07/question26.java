import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the position (n) to find the Fibonacci number: ");
        int n = sc.nextInt();
        
        int result = fibonacci(n);
        
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        
    }
    
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: 1st term is 0, 2nd term is 1
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        // Recursive step
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}