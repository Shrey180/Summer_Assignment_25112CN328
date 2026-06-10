import java.util.*;

public class question40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of lines you want the character pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = x; y < n; y ++)
                System.out.print(" ");

            for(int z = 1; z <= x ; z ++)
                System.out.print((char)(64+z));

            for(int p = (x-1); p >= 1 ; p --)
                System.out.print((char)(64+p));

            System.out.println();
        }
        
    }
}
