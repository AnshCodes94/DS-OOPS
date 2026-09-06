import java.util.*;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

              
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int[][] b = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        

        sc.close();
    }
}