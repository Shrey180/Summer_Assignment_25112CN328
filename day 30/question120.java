/* This mini project is a Mini E-Commerce Store. It combines hardcoded inventory arrays, user input strings,
functional logic for cart management, and mathematical calculation for a final checkout receipt. */

import java.util.Scanner;

public class question120 {
    // Store Inventory (Pre-loaded data)
    static String[] storeItems = {"Laptop", "Smartphone", "Headphones", "Mechanical Keyboard", "Monitor"};
    static double[] storePrices = {55000.0, 25000.0, 2000.0, 4500.0, 12000.0};
    
    // User Shopping Cart
    static String[] cartItems = new String[20];
    static double[] cartPrices = new double[20];
    static int cartSize = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to ShreyMart E-Commerce ===");
        do {
            System.out.println("\n1. Browse Store");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout & Pay");
            System.out.println("5. Leave Store");
            System.out.print("What would you like to do? ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: displayStore(); break;
                case 2: addToCart(scanner); break;
                case 3: viewCart(); break;
                case 4: checkout(); choice = 5; break; // Auto-exit after checkout
                case 5: System.out.println("Thank you for visiting ShreyMart!"); break;
                default: System.out.println("Invalid input.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    public static void displayStore() {
        System.out.println("\n--- Today's Available Products ---");
        System.out.println("ID\tPrice(INR)\tProduct");
        System.out.println("---------------------------------------");
        for (int i = 0; i < storeItems.length; i++) {
            System.out.println(i + "\t" + storePrices[i] + "\t\t" + storeItems[i]);
        }
    }

    public static void addToCart(Scanner scanner) {
        System.out.print("Enter the ID of the product to buy: ");
        int id = scanner.nextInt();

        if (id >= 0 && id < storeItems.length) {
            cartItems[cartSize] = storeItems[id];
            cartPrices[cartSize] = storePrices[id];
            cartSize++;
            System.out.println("=> '" + storeItems[id] + "' added to your cart!");
        } else {
            System.out.println("Invalid Product ID.");
        }
    }

    public static void viewCart() {
        if (cartSize == 0) {
            System.out.println("\nYour cart is currently empty.");
            return;
        }
        System.out.println("\n--- Your Shopping Cart ---");
        for (int i = 0; i < cartSize; i++) {
            System.out.println((i + 1) + ". " + cartItems[i] + " - INR " + cartPrices[i]);
        }
    }

    public static void checkout() {
        if (cartSize == 0) {
            System.out.println("\nYou cannot checkout with an empty cart!");
            return;
        }
        
        double total = 0;
        System.out.println("\n=================================");
        System.out.println("         FINAL RECEIPT           ");
        System.out.println("=================================");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(cartItems[i] + "\t\tINR " + cartPrices[i]);
            total += cartPrices[i];
        }
        
        double tax = total * 0.18; // 18% GST
        double grandTotal = total + tax;
        
        System.out.println("---------------------------------");
        System.out.println("Subtotal: \t\tINR " + total);
        System.out.println("GST (18%): \t\tINR " + tax);
        System.out.println("GRAND TOTAL: \t\tINR " + grandTotal);
        System.out.println("=================================");
        System.out.println("Payment processed successfully. Your items will be shipped soon.");
    }
}