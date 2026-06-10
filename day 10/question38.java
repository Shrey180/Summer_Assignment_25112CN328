import java.util.*;

public class question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of lines you want the reverse pyramid for : ");
        int n=sc.nextInt();

        for(int x = n; x >= 1; x --)
        {
            for(int y = n; y > x; y --)
                System.out.print(" ");

            for(int z = 1; z <= (2*x-1) ; z++)
                System.out.print("*");

            System.out.println();
        }
        
    }
}
