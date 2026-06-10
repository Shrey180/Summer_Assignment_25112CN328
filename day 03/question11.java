import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        
        // Store original values to print in the final output
        int a = n1;
        int b = n2;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        // After the loop ends, 'a' contains the GCD
        int gcd = a;
        
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);

        }
}