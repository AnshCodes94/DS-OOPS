import java.util.*;

public class MaxElementOfMatrix {
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
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);


        sc.close();
    }
}