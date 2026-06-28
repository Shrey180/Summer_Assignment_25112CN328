import java.util.Scanner;

public class question111 {
    // 10 seats total. false = available, true = booked
    static boolean[] seats = new boolean[10]; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("--- Rapid Ticket Booking System ---");
        do {
            System.out.println("\n1. View Seat Map");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: displaySeats(); break;
                case 2: bookSeat(scanner); break;
                case 3: cancelSeat(scanner); break;
                case 4: System.out.println("Closing booking counter."); break;
                default: System.out.println("Invalid input.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void displaySeats() {
        System.out.println("\n[ Seat Map ]");
        for (int i = 0; i < seats.length; i++) {
            String status = seats[i] ? "[X]" : "[ ]"; // X for booked, empty for available
            System.out.print("Seat " + (i + 1) + ":" + status + "   ");
            
            // Break to new line after 5 seats for a clean visual layout
            if ((i + 1) % 5 == 0) {
                System.out.println(); 
            }
        }
    }

    public static void bookSeat(Scanner scanner) {
        System.out.print("Enter Seat Number to book (1-10): ");
        int seatNum = scanner.nextInt();
        
        if (seatNum < 1 || seatNum > 10) {
            System.out.println("Invalid seat number.");
            return;
        }
        
        // Arrays are 0-indexed, so we subtract 1
        int index = seatNum - 1; 
        
        if (seats[index]) {
            System.out.println("Seat " + seatNum + " is already booked!");
        } else {
            seats[index] = true;
            System.out.println("Success! Seat " + seatNum + " has been booked for you.");
        }
    }

    public static void cancelSeat(Scanner scanner) {
        System.out.print("Enter Seat Number to cancel (1-10): ");
        int seatNum = scanner.nextInt();
        
        if (seatNum < 1 || seatNum > 10) {
            System.out.println("Invalid seat number.");
            return;
        }
        
        int index = seatNum - 1;
        
        if (!seats[index]) {
            System.out.println("Seat " + seatNum + " is not currently booked.");
        } else {
            seats[index] = false;
            System.out.println("Cancellation successful. Seat " + seatNum + " is now available.");
        }
    }
}