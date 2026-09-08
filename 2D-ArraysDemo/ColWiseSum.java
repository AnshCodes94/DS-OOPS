import java.util.*;

public class ColWiseSum {
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

        for (int i = 0; i < r; i++){
            int colsum = 0;
            for (int j = 0; j < c; j++){
                colsum += a[j][i]; 
            }
            System.out.println(colsum);
        }

        sc.close();
    }
}