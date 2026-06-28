import java.util.Scanner;

public class question116 {
    static int[] itemIds = new int[100];
    static String[] itemNames = new String[100];
    static int[] quantities = new int[100];
    static double[] prices = new double[100];
    static int itemCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Warehouse Inventory System ---");
        do {
            System.out.println("\n1. Add New Item");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. View Full Inventory");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addItem(scanner); break;
                case 2: updateQuantity(scanner); break;
                case 3: displayInventory(); break;
                case 4: System.out.println("Closing inventory software."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void addItem(Scanner scanner) {
        if (itemCount >= 100) {
            System.out.println("Warehouse storage arrays are full.");
            return;
        }
        System.out.print("Enter Item ID: ");
        itemIds[itemCount] = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter Item Name: ");
        itemNames[itemCount] = scanner.nextLine();

        System.out.print("Enter Initial Quantity: ");
        quantities[itemCount] = scanner.nextInt();

        System.out.print("Enter Price per unit (INR): ");
        prices[itemCount] = scanner.nextDouble();

        itemCount++;
        System.out.println("Item added to catalog.");
    }

    public static void updateQuantity(Scanner scanner) {
        System.out.print("Enter Item ID to update: ");
        int searchId = scanner.nextInt();
        
        for (int i = 0; i < itemCount; i++) {
            if (itemIds[i] == searchId) {
                System.out.print("Enter amount to add/subtract (e.g., 5 or -2): ");
                int adjustment = scanner.nextInt();
                quantities[i] += adjustment;
                
                // Prevent negative stock
                if (quantities[i] < 0) quantities[i] = 0; 
                
                System.out.println("Stock updated. New Quantity: " + quantities[i]);
                return;
            }
        }
        System.out.println("Item ID not found in system.");
    }

    public static void displayInventory() {
        if (itemCount == 0) {
            System.out.println("Inventory is currently empty.");
            return;
        }
        System.out.println("\nID\tQuantity\tPrice(INR)\tName");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemIds[i] + "\t" + quantities[i] + "\t\t" + prices[i] + "\t\t" + itemNames[i]);
        }
    }
}