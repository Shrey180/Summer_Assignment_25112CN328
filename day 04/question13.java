import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();
        
        int first = 0, second = 1;
        
        // Print the terms based on user input
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println();
    }
}