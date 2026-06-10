import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked for prime");
        int n = sc.nextInt();
        
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            System.out.println("Not Prime");
            return ;
        }
        
        boolean isPrime = true;
        
        // Check divisors up to the square root of n
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        
    }
}