import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            int original = i;
            int temp = i;
            int digits = 0;
            int sum = 0;
            
            // Count digits for the current number
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            
            temp = i;
            // Calculate Armstrong sum
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }
            
            // If the sum matches the original number, it's an Armstrong number
            if (original == sum) {
                System.out.print(original + " ");
            }
        }
        
        System.out.println();
    }
}