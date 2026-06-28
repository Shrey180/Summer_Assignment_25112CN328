import java.util.Scanner;

public class question119 {
    static int[] empIds = new int[50];
    static String[] empNames = new String[50];
    static String[] roles = new String[50];
    static int empCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Mini Employee Management ---");
        do {
            System.out.println("\n1. Hire Employee");
            System.out.println("2. Employee Roster");
            System.out.println("3. Exit");
            System.out.print("Select: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: hireEmployee(scanner); break;
                case 2: viewRoster(); break;
                case 3: System.out.println("System offline."); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 3);
        scanner.close();
    }

    public static void hireEmployee(Scanner scanner) {
        System.out.print("Enter ID: ");
        empIds[empCount] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        empNames[empCount] = scanner.nextLine();

        System.out.print("Enter Job Role: ");
        roles[empCount] = scanner.nextLine();

        empCount++;
        System.out.println("Employee hired and onboarded.");
    }

    public static void viewRoster() {
        if (empCount == 0) {
            System.out.println("No employees in roster.");
            return;
        }
        System.out.println("\nID\tName\t\tRole");
        System.out.println("---------------------------------");
        for (int i = 0; i < empCount; i++) {
            System.out.println(empIds[i] + "\t" + empNames[i] + "\t\t" + roles[i]);
        }
    }
}