import java.util.Scanner;

public class question112 {
    static String[] contactNames = new String[100];
    static String[] phoneNumbers = new String[100];
    static int contactCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Personal Contact Directory ---");
        do {
            System.out.println("\n1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer for upcoming string inputs

            switch (choice) {
                case 1: addContact(scanner); break;
                case 2: displayContacts(); break;
                case 3: searchContact(scanner); break;
                case 4: System.out.println("Closing directory."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void addContact(Scanner scanner) {
        if (contactCount >= 100) {
            System.out.println("Storage full.");
            return;
        }
        System.out.print("Enter Name: ");
        contactNames[contactCount] = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        phoneNumbers[contactCount] = scanner.nextLine();

        contactCount++;
        System.out.println("Contact saved successfully.");
    }

    public static void displayContacts() {
        if (contactCount == 0) {
            System.out.println("Phonebook is empty.");
            return;
        }
        System.out.println("\nName\t\tPhone Number");
        System.out.println("---------------------------------");
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contactNames[i] + "\t\t" + phoneNumbers[i]);
        }
    }

    public static void searchContact(Scanner scanner) {
        System.out.print("Enter Name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        
        for (int i = 0; i < contactCount; i++) {
            // .equalsIgnoreCase makes the search insensitive to capital letters
            if (contactNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("\n--- Contact Found ---");
                System.out.println("Name:   " + contactNames[i]);
                System.out.println("Number: " + phoneNumbers[i]);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No contact found for '" + searchName + "'.");
        }
    }
}