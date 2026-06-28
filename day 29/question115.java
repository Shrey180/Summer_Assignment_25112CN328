import java.util.Scanner;

public class question115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- String Operations System ---");
        do {
            System.out.println("\n1. Find String Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Concatenate Two Strings");
            System.out.println("4. Compare Two Strings");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: findLength(scanner); break;
                case 2: reverseString(scanner); break;
                case 3: concatenateStrings(scanner); break;
                case 4: compareStrings(scanner); break;
                case 5: System.out.println("Exiting string system."); break;
                default: System.out.println("Invalid selection.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void findLength(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Length of the string is: " + str.length());
    }

    public static void reverseString(Scanner scanner) {
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        String reversed = "";
        
        // Manual loop to build the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }

    public static void concatenateStrings(Scanner scanner) {
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println("Concatenated Result: " + (str1 + str2));
    }

    public static void compareStrings(Scanner scanner) {
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Result: The strings are exactly identical.");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Result: The strings match, but have different cases (capitalization).");
        } else {
            System.out.println("Result: The strings are completely different.");
        }
    }
}