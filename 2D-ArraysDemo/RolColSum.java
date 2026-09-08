import java.util.*;

public class RolColSum {
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
        int rowsum[] = new int[r];
        int colsum[] = new int[c];

        for (int i = 0; i < r; i++){
            
            for (int j = 0; j < c; j++){
                rowsum[i] += a[i][j];
                colsum[j] += a[i][j]; 
            }
        }
        
        // Row sum + corresponding column sum
        for (int i = 0; i < r && i < c; i++) {
            System.out.println(rowsum[i] + colsum[i]);
        }
    

        sc.close();
    }
}


    