import java.util.Scanner;

public class question94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to compress: ");
        String str = scanner.nextLine();
        
        StringBuilder compressed = new StringBuilder();
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            
            // Look ahead and count consecutive identical characters
            while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // Advance outer index forward
            }
            
            compressed.append(str.charAt(i));
            compressed.append(count);
        }
        
        System.out.println("Compressed string: " + compressed.toString());
        
        scanner.close();
    }
}