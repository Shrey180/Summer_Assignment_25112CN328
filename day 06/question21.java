import java.util.*;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a decimal number to convert it to binary");
        int decimal = sc.nextInt();

        String binary= "";

        while(decimal > 0)
        {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }
        
        System.out.println("The binary equivalent =" +binary);
    }
}
