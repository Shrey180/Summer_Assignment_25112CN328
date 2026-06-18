import java.util.Scanner;

public class question76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int principalSum = 0;
        int secondarySum = 0;
        
        for (int i = 0; i < n; i++) {
            // Primary diagonal condition: row index == column index (i == j)
            principalSum += matrix[i][i];
            
            // Secondary diagonal condition: row index + column index == N - 1
            secondarySum += matrix[i][n - 1 - i];
        }
        
        System.out.println("\nSum of Principal (Primary) Diagonal: " + principalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        
        scanner.close();
    }
}