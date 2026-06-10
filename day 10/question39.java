import java.util.*;

public class question39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of lines you want the number pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = x; y < n; y ++)
                System.out.print(" ");

            for(int z = 1; z <= x ; z ++)
                System.out.print(z);

            for(int p = (x-1); p >= 1 ; p --)
                System.out.print(p);

            System.out.println();
        }
        
    }
}
