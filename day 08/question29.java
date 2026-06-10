import java.util.*;

public class question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines you want the half pyramid for : ");
        int n=sc.nextInt();

        for(int x = 0; x <= n; x ++)
        {
            for(int y = 0; y < x; y ++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
