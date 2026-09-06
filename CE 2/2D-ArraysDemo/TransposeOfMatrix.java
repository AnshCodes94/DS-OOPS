import java.util.*;

public class TransposeOfMatrix {
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

        System.out.println("Original Matrix: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}