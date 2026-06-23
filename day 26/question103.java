import java.util.Scanner;

public class question103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 5000.00; // Starting baseline account balance
        int choice;
        
        System.out.println("--- Core Bank ATM Simulation ---");
        
        do {
            System.out.println("\n*** ATM Main Menu ***");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit Terminal");
            System.out.print("Select an option (1-4): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Current Available Balance: INR " + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: INR ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("INR " + deposit + " successfully deposited.");
                        System.out.println("Updated Balance: INR " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter withdrawal amount: INR ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0) {
                        if (withdrawal <= balance) {
                            balance -= withdrawal;
                            System.out.println("Please collect your cash.");
                            System.out.println("Updated Balance: INR " + balance);
                        } else {
                            System.out.println("Transaction Failed: Insufficient funds.");
                        }
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our ATM service. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid option selected. Please pick a number from 1 to 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}