import java.util.Scanner;

public class question109 {
    static int[] bookIds = new int[100];
    static String[] titles = new String[100];
    static boolean[] isAvailable = new boolean[100]; // true = available, false = issued
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Library Management System ---");
        do {
            System.out.println("\n1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addBook(scanner); break;
                case 2: displayBooks(); break;
                case 3: issueBook(scanner); break;
                case 4: returnBook(scanner); break;
                case 5: System.out.println("Closing library system."); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void addBook(Scanner scanner) {
        if (bookCount >= 100) {
            System.out.println("Library is full!");
            return;
        }
        System.out.print("Enter Book ID: ");
        bookIds[bookCount] = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter Book Title: ");
        titles[bookCount] = scanner.nextLine();
        
        isAvailable[bookCount] = true; // Initially available
        bookCount++;
        System.out.println("Book added successfully.");
    }

    public static void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nID\tStatus\t\tTitle");
        System.out.println("-----------------------------------");
        for (int i = 0; i < bookCount; i++) {
            String status = isAvailable[i] ? "Available" : "Issued";
            System.out.println(bookIds[i] + "\t" + status + "\t" + titles[i]);
        }
    }

    public static void issueBook(Scanner scanner) {
        System.out.print("Enter Book ID to issue: ");
        int searchId = scanner.nextInt();
        
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i] == searchId) {
                if (isAvailable[i]) {
                    isAvailable[i] = false;
                    System.out.println("Book '" + titles[i] + "' has been issued.");
                } else {
                    System.out.println("Sorry, this book is currently already issued.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    public static void returnBook(Scanner scanner) {
        System.out.print("Enter Book ID to return: ");
        int searchId = scanner.nextInt();
        
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i] == searchId) {
                if (!isAvailable[i]) {
                    isAvailable[i] = true;
                    System.out.println("Book '" + titles[i] + "' has been returned. Thank you.");
                } else {
                    System.out.println("This book was not issued out.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }
}