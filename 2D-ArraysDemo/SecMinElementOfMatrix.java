import java.util.*;

public class SecMinElementOfMatrix {
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
        int smin = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (a[i][j] < min){
                    smin = min;
                    min = a[i][j];
                }
                else if (a[i][j] < smin && a[i][j] != min) {
                    smin = a[i][j];
                }
            }
        }
        System.out.println(smin);

        sc.close();
    }
}