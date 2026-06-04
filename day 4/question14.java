import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the position (n) of the Fibonacci term: ");
        int n = sc.nextInt();
        
        int first = 0, second = 1;
        int nthTerm = 0;
        
        if (n == 1) {
            nthTerm = first;
        } else if (n == 2) {
            nthTerm = second;
        } else {
            // Loop runs up to n to find the specific term
            for (int i = 3; i <= n; i++) {
                nthTerm = first + second;
                first = second;
                second = nthTerm;
            }
        }
        
        System.out.println("The " + n + "th Fibonacci term is: " + nthTerm);
        
    }
}