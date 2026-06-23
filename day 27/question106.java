import java.util.Scanner;

public class question106 {
    static int[] empIds = new int[100];
    static String[] empNames = new String[100];
    static String[] departments = new String[100];
    static int empCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Corporate Employee Registry Console ---");
        do {
            System.out.println("\n1. Register New Employee");
            System.out.println("2. Display Employee Directory");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit Console");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: registerEmployee(scanner); break;
                case 2: displayDirectory(); break;
                case 3: searchEmployee(scanner); break;
                case 4: System.out.println("Exiting registry console."); break;
                default: System.out.println("Invalid entry. Try again.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void registerEmployee(Scanner scanner) {
        if (empCount >= 100) {
            System.out.println("Registry limit reached.");
            return;
        }
        System.out.print("Assign Employee ID: ");
        empIds[empCount] = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter Employee Full Name: ");
        empNames[empCount] = scanner.nextLine();

        System.out.print("Enter Department: ");
        departments[empCount] = scanner.nextLine();

        empCount++;
        System.out.println("Employee registered successfully.");
    }

    public static void displayDirectory() {
        if (empCount == 0) {
            System.out.println("No employees currently registered.");
            return;
        }
        System.out.println("\n--- Active Employee Directory ---");
        System.out.println("ID\tName\t\tDepartment");
        System.out.println("------------------------------------------");
        for (int i = 0; i < empCount; i++) {
            System.out.println(empIds[i] + "\t" + empNames[i] + "\t\t" + departments[i]);
        }
    }

    public static void searchEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to verify: ");
        int searchId = scanner.nextInt();

        for (int i = 0; i < empCount; i++) {
            if (empIds[i] == searchId) {
                System.out.println("\nProfile Found:");
                System.out.println("ID:         " + empIds[i]);
                System.out.println("Name:       " + empNames[i]);
                System.out.println("Department: " + departments[i]);
                return;
            }
        }
        System.out.println("Employee ID " + searchId + " matches no record.");
    }
}