import java.util.Scanner;

public class question41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Call the function to find the sum
        int result = findSum(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        
        scanner.close();
    }
    
    // Function to calculate the sum of two numbers
    public static int findSum(int a, int b) {
        return a + b;
    }
}