import java.util.*;

public class SecMaxElementOfMatrix {
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

        int max = a[0][0];
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (a[i][j] > max){
                    smax = max;
                    max = a[i][j];
                }
                else if (a[i][j] > smax && a[i][j] != max) {
                    smax = a[i][j];
                }
            }
        }
        System.out.println(smax);

        sc.close();
    }
}