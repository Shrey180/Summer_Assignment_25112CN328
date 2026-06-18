import java.util.Scanner;

public class question77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rows for Matrix 1: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter columns for Matrix 1: ");
        int c1 = scanner.nextInt();
        
        System.out.print("Enter rows for Matrix 2: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter columns for Matrix 2: ");
        int c2 = scanner.nextInt();
        
        // Matrix multiplication rule check
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible with these dimensions.");
            scanner.close();
            return;
        }
        
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] product = new int[r1][c2];
        
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }
        
        // Matrix Multiplication using 3 nested loops
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        System.out.println("\nResultant Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}