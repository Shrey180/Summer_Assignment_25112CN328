import java.util.*;

public class question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines you want the reverse half pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = n; y >= x; y --)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
