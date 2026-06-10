import java.util.*;

public class question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of lines you want the pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = x; y <= (n-1); y ++)
                System.out.print(" ");

            for(int z = 1; z <= (2*x-1) ; z++)
                System.out.print("*");

            System.out.println();
        }
        
    }
}
