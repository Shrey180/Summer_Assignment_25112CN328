import java.util.Scanner;

public class question101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        int targetNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I have selected a secret number between 1 and 100.");
        
        // Loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess > targetNumber) {
                System.out.println("Too high! Try a smaller number.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try a larger number.");
            } else {
                System.out.println("\nCongratulations! You've guessed the secret number!");
                System.out.println("Total attempts taken: " + attempts);
            }
        }
        
        scanner.close();
    }
}