import java.util.Scanner;

public class question107 {
    static int[] staffIds = new int[50];
    static String[] staffNames = new String[50];
    static double[] baseSalaries = new double[50];
    static double[] netSalaries = new double[50];
    static int staffCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Payroll & Salary Processing Terminal ---");
        do {
            System.out.println("\n1. Process Employee Payroll");
            System.out.println("2. View Payroll Ledger");
            System.out.println("3. Exit Terminal");
            System.out.print("Select menu item: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: processPayroll(scanner); break;
                case 2: viewLedger(); break;
                case 3: System.out.println("Closing secure payroll tunnel."); break;
                default: System.out.println("Action unavailable.");
            }
        } while (choice != 3);
        scanner.close();
    }

    public static void processPayroll(Scanner scanner) {
        if (staffCount >= 50) {
            System.out.println("Payroll processing batch limit exceeded.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        staffIds[staffCount] = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name: ");
        staffNames[staffCount] = scanner.nextLine();

        System.out.print("Enter Monthly Base Salary (INR): ");
        double base = scanner.nextDouble();
        baseSalaries[staffCount] = base;

        // Clean calculation separation using small formulas
        netSalaries[staffCount] = calculateNetSalary(base);

        System.out.println("Payroll parsed. Net Salary: INR " + netSalaries[staffCount]);
        staffCount++;
    }

    // A tiny helper function just to do the math cleanly
    public static double calculateNetSalary(double base) {
        double bonus = base * 0.15; // 15% Bonus
        double tax = base * 0.12;   // 12% Tax
        return base + bonus - tax;
    }

    public static void viewLedger() {
        if (staffCount == 0) {
            System.out.println("Ledger empty. No processed payroll information available.");
            return;
        }
        System.out.println("\n--- Monthly Payroll Ledger Summary ---");
        System.out.println("ID\tName\t\tBase Salary\tNet Take-Home");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < staffCount; i++) {
            System.out.println(staffIds[i] + "\t" + staffNames[i] + "\t\t" + baseSalaries[i] + "\t\t" + netSalaries[i]);
        }
    }
}