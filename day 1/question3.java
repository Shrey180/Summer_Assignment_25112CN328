import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) 
            factorial *= i;
        
        
        System.out.println(factorial);
        
    }
}