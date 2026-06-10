import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factors: ");
        int n = sc.nextInt();
        
        System.out.print("Factors of " + n + " are: ");
        
        // Loop from 1 up to the number itself to find all divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
    }
}