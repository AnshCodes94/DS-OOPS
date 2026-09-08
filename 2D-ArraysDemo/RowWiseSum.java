import java.util.*;

public class RowWiseSum {
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
            int rowsum = 0;
            for (int j = 0; j < c; j++){
                rowsum += a[i][j]; 
            }
            System.out.println(rowsum);
        }

        sc.close();
    }
}