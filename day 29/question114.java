import java.util.Scanner;

public class question114 {
    static int[] arr = new int[100];
    static int size = 0; // Tracks how many elements are currently in the array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Array Operations System ---");
        do {
            System.out.println("\n1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: insertElement(scanner); break;
                case 2: deleteElement(scanner); break;
                case 3: searchElement(scanner); break;
                case 4: displayArray(); break;
                case 5: System.out.println("Exiting array system."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void insertElement(Scanner scanner) {
        if (size >= 100) {
            System.out.println("Array is full.");
            return;
        }
        System.out.print("Enter value to insert: ");
        arr[size] = scanner.nextInt();
        size++;
        System.out.println("Element inserted successfully.");
    }

    public static void deleteElement(Scanner scanner) {
        System.out.print("Enter value to delete: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                // Shift elements left to overwrite the deleted item
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                found = true;
                System.out.println("Element deleted.");
                break; // Stop after deleting the first occurrence
            }
        }
        if (!found) System.out.println("Element not found in array.");
    }

    public static void searchElement(Scanner scanner) {
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    public static void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Current Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}