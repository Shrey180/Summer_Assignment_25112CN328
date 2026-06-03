import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        
        // Store original values for the LCM formula calculation
        int a = n1;
        int b = n2;
        
        // First find GCD 
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        
        // Formula: LCM = (n1 * n2) / GCD
        int lcm = (n1 * n2) / gcd;
        
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
        
    }
}