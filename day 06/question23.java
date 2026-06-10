import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer to count set bits: ");
        int n = sc.nextInt();
        
        int original = n;
        int count = 0;
        
        // Loop runs until all bits are shifted out
        while (n > 0) {
            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift by 1 bit to check the next position
            n = n >> 1;
        }
        
        System.out.println("Number of set bits (1s) in " + original + " is: " + count);
        
    }
}