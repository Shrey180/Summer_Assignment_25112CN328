import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        int product = 1;
        
        if (n == 0) {
            product = 0;
        } else {
            while (n != 0) {
                product *= (n % 10);
                n /= 10;
            }
        }
        
        System.out.println("Product of the digits = "+product);
        
    }
}