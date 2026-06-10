import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();
        
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        
        long result = 1;
        
        // Multiply x by itself n times to calculate power without using Math.pow()
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        
        System.out.println(x + "^" + n + " = " + result);
        
    }
}