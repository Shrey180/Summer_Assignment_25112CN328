import java.util.Scanner;

public class question42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Call the function to find the maximum
        int maximum = findMaximum(num1, num2);
        
        System.out.println("The maximum value between " + num1 + " and " + num2 + " is: " + maximum);
        
        scanner.close();
    }
    
    // Function to find the maximum of two numbers
    public static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}