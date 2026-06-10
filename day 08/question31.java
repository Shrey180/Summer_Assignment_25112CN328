import java.util.*;

public class question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines you want the half character pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = 1; y <= x; y ++)
                System.out.print((char)(64+y));
            System.out.println();
        }
        
    }
}
