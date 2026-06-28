import java.util.Scanner;

public class question110 {
    static int[] accNumbers = new int[50];
    static String[] accNames = new String[50];
    static double[] balances = new double[50];
    static int accCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Core Banking System ---");
        do {
            System.out.println("\n1. Open New Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Withdraw Funds");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: openAccount(scanner); break;
                case 2: displayAccounts(); break;
                case 3: processTransaction(scanner, true); break;  // true for deposit
                case 4: processTransaction(scanner, false); break; // false for withdraw
                case 5: System.out.println("Shutting down banking server."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void openAccount(Scanner scanner) {
        if (accCount >= 50) {
            System.out.println("Bank database limit reached.");
            return;
        }
        System.out.print("Assign Account Number: ");
        accNumbers[accCount] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accNames[accCount] = scanner.nextLine();

        System.out.print("Enter Initial Deposit (INR): ");
        balances[accCount] = scanner.nextDouble();

        accCount++;
        System.out.println("Account created successfully.");
    }

    public static void displayAccounts() {
        if (accCount == 0) {
            System.out.println("No accounts registered.");
            return;
        }
        System.out.println("\nAcc No\tBalance\t\tHolder Name");
        System.out.println("---------------------------------------");
        for (int i = 0; i < accCount; i++) {
            System.out.println(accNumbers[i] + "\tINR " + balances[i] + "\t" + accNames[i]);
        }
    }

    // A shared function for both depositing and withdrawing
    public static void processTransaction(Scanner scanner, boolean isDeposit) {
        System.out.print("Enter Account Number: ");
        int searchAcc = scanner.nextInt();
        
        int index = findAccountIndex(searchAcc);
        
        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount (INR): ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (isDeposit) {
            balances[index] += amount;
            System.out.println("Deposit successful. New Balance: INR " + balances[index]);
        } else {
            if (balances[index] >= amount) {
                balances[index] -= amount;
                System.out.println("Withdrawal successful. New Balance: INR " + balances[index]);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    // Helper function to keep code clean
    public static int findAccountIndex(int accNum) {
        for (int i = 0; i < accCount; i++) {
            if (accNumbers[i] == accNum) {
                return i;
            }
        }
        return -1; // -1 means not found
    }
}