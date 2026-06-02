import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();      
        int sum = 0;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        System.out.println("The sum of digits = "+sum);
        
    }
}