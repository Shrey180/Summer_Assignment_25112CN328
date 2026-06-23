import java.util.Scanner;

public class question104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define questions, multiple choice options, and answers using parallel arrays
        String[] questions = {
            "Which data type is used to create a variable that should store text in Java?",
            "Which method is used to find the length of a string variable in Java?",
            "How do you insert single-line comments in Java code?"
        };
        
        String[][] options = {
            {"A. txt", "B. String", "C. char", "D. text"},
            {"A. len()", "B. getSize()", "C. length()", "D. elements()"},
            {"A. #", "B. /*", "C. --", "D. //"}
        };
        
        char[] correctAnswers = {'B', 'C', 'D'};
        int score = 0;
        
        System.out.println("--- Welcome to the Core Java Terminal Quiz! ---");
        System.out.println("Please respond using capital letters (A, B, C, or D).\n");
        
        // Loop through the quiz questions sequentially
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i][0]);
            System.out.println(options[i][1]);
            System.out.println(options[i][2]);
            System.out.println(options[i][3]);
            
            System.out.print("Your Answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            
            // Score tracking validation
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Result: Correct!");
                score++;
            } else {
                System.out.println("Result: Incorrect. The correct option was " + correctAnswers[i] + ".");
            }
            System.out.println(); // Line spacing separator
        }
        
        // Final Scoreboard calculations
        System.out.println("--- Quiz Finished! ---");
        System.out.println("Your Final Score: " + score + " out of " + questions.length);
        
        scanner.close();
    }
}