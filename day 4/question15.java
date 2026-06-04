import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to be checked for Armstrong: ");
        int n = sc.nextInt();
        
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
        
        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        

    }
}