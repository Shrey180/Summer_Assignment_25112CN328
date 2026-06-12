import java.util.Scanner;

public class question47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        printFibonacciSeries(terms);
        
        scanner.close();
    }
    
    // Function to generate and print the Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Compute the next term in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}