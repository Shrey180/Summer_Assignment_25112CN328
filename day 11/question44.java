import java.util.Scanner;

public class question44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        
        // Call the function to find the factorial
        long result = findFactorial(num);
        
        System.out.println("The factorial of " + num + " is: " + result);
        
        scanner.close();
    }
    
    // Function to calculate the factorial of a number iteratively
    public static long findFactorial(int n) {
        long fact = 1;
        
        // Loop from 1 up to the number to calculate the cumulative product
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
}