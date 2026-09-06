import java.util.*;

public class MinElementOfMatrix {
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

        int min = a[0][0];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        System.out.println(min);

        sc.close();
    }
}