import java.util.*;
 
public class DiagonalDifference {
 
    public static int diagonalDifference(int[][] matrix) {
        int n = matrix.length;
        int primarySum = 0;
        int secSum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secSum += matrix[i][n - i - 1];
        }
        return primarySum - secSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        System.out.println(diagonalDifference(matrix));
        sc.close();
    }
}