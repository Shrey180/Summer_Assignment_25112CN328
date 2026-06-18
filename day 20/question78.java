import java.util.Scanner;

public class question78 {
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
        
        boolean isSymmetric = true;
        
        // Compare elements with their transposed mirror image
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }
        
        if (isSymmetric) {
            System.out.println("\nThe matrix is a Symmetric Matrix.");
        } else {
            System.out.println("\nThe matrix is NOT a Symmetric Matrix.");
        }
        
        scanner.close();
    }
}