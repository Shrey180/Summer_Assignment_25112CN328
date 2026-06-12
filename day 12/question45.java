import java.util.Scanner;

public class question45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check for palindrome: ");
        int num = scanner.nextInt();
        
        // Call the function to check if it is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number reads the same backward as forward
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        
        // Reverse the number mathematical logic
        while (n > 0) {
            int digit = n % 10;
            reversed = (reversed * 10) + digit;
            n /= 10;
        }
        
        // If the reversed number matches the original, it's a palindrome
        return original == reversed;
    }
}