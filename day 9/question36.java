import java.util.*;

public class question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines you want the hollow pyramid for : ");
        int n=sc.nextInt();
        
        for(int x = 0; x <= n; x ++)
        {
            if(x == 0 || x == n )
            for(int y = 0; y < n; y ++)
                System.out.print("*");
           
            else
                for(int y = 0; y < n; y++)
                    if(y == 0 || y == n-1)
                        System.out.print("*");
                    else 
                        System.out.print(" ");  

            System.out.println();
        }  
    }
}
