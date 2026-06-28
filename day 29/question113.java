import java.util.Scanner;

public class question113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Menu-Driven Calculator ---");
        do {
            System.out.println("\n1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");
            System.out.print("Select an operation: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1: System.out.println("Result: " + add(num1, num2)); break;
                    case 2: System.out.println("Result: " + subtract(num1, num2)); break;
                    case 3: System.out.println("Result: " + multiply(num1, num2)); break;
                    case 4: divide(num1, num2); break; // Handled specially for division by zero
                    case 5: modulus(num1, num2); break;
                }
            } else if (choice == 6) {
                System.out.println("Calculator turned off.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
        
        scanner.close();
    }

    // Simple math functions
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    
    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
    
    public static void modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + (a % b));
        }
    }
}