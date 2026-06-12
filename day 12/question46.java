import java.util.Scanner;

public class question46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check for Armstrong: ");
        int num = scanner.nextInt();
        
        // Call the function to check if it is an Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;
        
        // Count the total number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        temp = n;
        // Calculate the sum of digits raised to the power of total digits
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        return original == sum;
    }
}