import java.util.*;

public class question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines you want the half number repeated pyramid for : ");
        int n=sc.nextInt();

        for(int x = 1; x <= n; x ++)
        {
            for(int y = 1; y <= x; y ++)
                System.out.print(x);
            System.out.println();
        }
        
    }
}
