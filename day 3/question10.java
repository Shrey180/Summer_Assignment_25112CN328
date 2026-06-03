import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }
            
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
    }
}