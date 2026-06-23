import java.util.Scanner;

public class question99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline buffer
        
        String[] names = new String[n];
        
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        
        // Bubble sort to arrange strings alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // compareTo returns a positive value if names[j] comes after names[j+1]
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nNames in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        
        scanner.close();
    }
}