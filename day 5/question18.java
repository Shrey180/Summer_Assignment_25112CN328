import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to be checked for Strong Number: ");
        int n = sc.nextInt();
        
        int original = n;
        int sum = 0;
        
        // Process each digit to calculate the sum of factorials
        while (n > 0) {
            int digit = n % 10;
            
            // Calculate factorial of the current digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            
            sum += fact;
            n /= 10;
        }
        
        // If the sum of factorials equals the original number, it's a strong number
        if (sum == original && original != 0) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }
        
    }
}