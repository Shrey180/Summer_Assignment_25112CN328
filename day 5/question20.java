import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its largest prime factor: ");
        int n = sc.nextInt();
        
        int original = n;
        int largestPrimeFactor = -1;
        
        // Divide out all the 2s first
        while (n % 2 == 0) {
            largestPrimeFactor = 2;
            n /= 2;
        }
        
        // Check odd numbers starting from 3 up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            }
        }
        
        // If n is still greater than 2, then the remaining n itself must be prime
        if (n > 2) {
            largestPrimeFactor = n;
        }
        
        System.out.println("The largest prime factor of " + original + " is: " + largestPrimeFactor);
        
    }
}