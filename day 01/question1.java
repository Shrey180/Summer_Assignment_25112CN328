import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of N ");
        int n = sc.nextInt();
        int sum=0; 

        for (int x=1;x<=n;x++) 
            sum +=x;

        System.out.println("Sum of N natural numbers =" +sum);
    }
}