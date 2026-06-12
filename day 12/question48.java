import java.util.Scanner;

public class question48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is a perfect number: ");
        int num = scanner.nextInt();
        
        // Call the function to check if it is a perfect number
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is a perfect number
    public static boolean isPerfect(int n) {
        // Perfect numbers are positive integers greater than 1
        if (n <= 1) {
            return false;
        }
        
        int sum = 1; // 1 is always a proper divisor
        
        // Find proper divisors up to the square root of n for efficiency
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                
                // If the divisors are different, add the matching quotient factor
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        
        // If the sum of all proper divisors equals the original number, it's perfect
        return sum == n;
    }
}