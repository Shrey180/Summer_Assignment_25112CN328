import java.util.Scanner;

public class question102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Voting Eligibility Verification System ---");
        System.out.print("Enter the number of citizens to check: ");
        int total = scanner.nextInt();
        
        for (int i = 1; i <= total; i++) {
            System.out.println("\n--- Citizen #" + i + " ---");
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            
            // Age qualification handling
            if (age < 0) {
                System.out.println("Invalid input: Age cannot be negative.");
            } else if (age >= 18) {
                System.out.println("Status: Eligible to vote.");
            } else {
                int yearsLeft = 18 - age;
                System.out.println("Status: Not eligible to vote.");
                System.out.println("You will become eligible in " + yearsLeft + " year(s).");
            }
        }
        
        System.out.println("\nVerification task complete.");
        scanner.close();
    }
}