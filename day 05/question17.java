import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to be checked for Perfect Number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // Find all proper divisors (excluding the number itself)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        // If the sum of divisors equals the original number, it's perfect
        if (sum == n && n != 0) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
        
    }
}