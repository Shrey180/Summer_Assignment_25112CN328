import java.util.Scanner;

public class question117 {
    static int[] rollNos = new int[50];
    static String[] names = new String[50];
    static String[] grades = new String[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Mini Student Record System ---");
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(scanner); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(scanner); break;
                case 4: System.out.println("Exiting system."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    public static void addStudent(Scanner scanner) {
        if (count >= 50) {
            System.out.println("System full!");
            return;
        }
        System.out.print("Enter Roll Number: ");
        rollNos[count] = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter Name: ");
        names[count] = scanner.nextLine();

        System.out.print("Enter Grade (e.g., A, B, C): ");
        grades[count] = scanner.nextLine();

        count++;
        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nRoll No\tName\t\tGrade");
        System.out.println("---------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNos[i] + "\t" + names[i] + "\t\t" + grades[i]);
        }
    }

    public static void searchStudent(Scanner scanner) {
        System.out.print("Enter Roll Number to search: ");
        int roll = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNos[i] == roll) {
                System.out.println("\nFound: " + names[i] + " | Grade: " + grades[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}