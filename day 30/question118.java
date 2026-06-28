import java.util.Scanner;

public class question118 {
    static String[] titles = new String[50];
    static String[] authors = new String[50];
    static boolean[] isAvailable = new boolean[50];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Mini Library System ---");
        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Select action: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: addBook(scanner); break;
                case 2: viewBooks(); break;
                case 3: borrowBook(scanner); break;
                case 4: returnBook(scanner); break;
                case 5: System.out.println("Closing library."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void addBook(Scanner scanner) {
        System.out.print("Enter Book Title: ");
        titles[bookCount] = scanner.nextLine();
        System.out.print("Enter Author: ");
        authors[bookCount] = scanner.nextLine();
        
        isAvailable[bookCount] = true;
        bookCount++;
        System.out.println("Book added to catalog.");
    }

    public static void viewBooks() {
        System.out.println("\nID\tStatus\t\tTitle (Author)");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < bookCount; i++) {
            String status = isAvailable[i] ? "Available" : "Borrowed";
            System.out.println(i + "\t" + status + "\t" + titles[i] + " (" + authors[i] + ")");
        }
    }

    public static void borrowBook(Scanner scanner) {
        System.out.print("Enter Book ID (0 to " + (bookCount - 1) + "): ");
        int id = scanner.nextInt();
        if (id >= 0 && id < bookCount && isAvailable[id]) {
            isAvailable[id] = false;
            System.out.println("You borrowed: " + titles[id]);
        } else {
            System.out.println("Invalid ID or Book already borrowed.");
        }
    }

    public static void returnBook(Scanner scanner) {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        if (id >= 0 && id < bookCount && !isAvailable[id]) {
            isAvailable[id] = true;
            System.out.println("You returned: " + titles[id]);
        } else {
            System.out.println("Invalid ID or Book was not borrowed.");
        }
    }
}