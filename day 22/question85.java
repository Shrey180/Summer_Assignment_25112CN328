import java.util.Scanner;

public class question85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check for palindrome: ");
        String str = scanner.nextLine();
        
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        
        // Compare characters from both ends moving inward
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome string.");
        }
        
        scanner.close();
    }
}