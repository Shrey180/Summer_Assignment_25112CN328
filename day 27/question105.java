import java.util.Scanner;

public class question105 {
    // Making arrays global static so all functions can access them easily
    static int[] rollNumbers = new int[100];
    static String[] names = new String[100];
    static double[] gpas = new double[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Student Record Management System ---");
        do {
            System.out.println("\n1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit System");
            System.out.print("Select an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(scanner); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(scanner); break;
                case 4: System.out.println("Shutting down management console. Goodbye!"); break;
                default: System.out.println("Invalid option. Choose a value from 1 to 4.");
            }
        } while (choice != 4);
        scanner.close();
    }

    // Function to add a student
    public static void addStudent(Scanner scanner) {
        if (studentCount >= 100) {
            System.out.println("Database full! Cannot add more students.");
            return;
        }
        System.out.print("Enter Roll Number: ");
        rollNumbers[studentCount] = scanner.nextInt();
        scanner.nextLine(); // Clear newline buffer

        System.out.print("Enter Student Name: ");
        names[studentCount] = scanner.nextLine();

        System.out.print("Enter GPA: ");
        gpas[studentCount] = scanner.nextDouble();

        studentCount++;
        System.out.println("Record successfully saved.");
    }

    // Function to display all students
    public static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No records found in the system.");
            return;
        }
        System.out.println("\n--- All Student Records ---");
        System.out.println("Roll No\tName\t\tGPA");
        System.out.println("---------------------------------");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(rollNumbers[i] + "\t" + names[i] + "\t\t" + gpas[i]);
        }
    }

    // Function to search a student
    public static void searchStudent(Scanner scanner) {
        System.out.print("Enter Roll Number to search: ");
        int searchRoll = scanner.nextInt();
        
        for (int i = 0; i < studentCount; i++) {
            if (rollNumbers[i] == searchRoll) {
                System.out.println("\n--- Record Discovered ---");
                System.out.println("Roll Number: " + rollNumbers[i]);
                System.out.println("Name:        " + names[i]);
                System.out.println("GPA:         " + gpas[i]);
                return;
            }
        }
        System.out.println("No student found with Roll Number " + searchRoll);
    }
}