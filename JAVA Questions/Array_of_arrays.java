import java.util.Scanner;
public class Array_of_arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of r1: ");
        int r1=sc.nextInt();
        System.out.print("enter value of c1: ");
        int c1=sc.nextInt();
        System.out.print("enter value of r2: ");
        int r2=sc.nextInt();
        System.out.print("enter value of c2: ");
        int c2=sc.nextInt();
        if (c1 != r2) {
            System.out.println("column of matrix is not equal to row of matrix");
            sc.close();
            return; // Stops execution early if sizes don't match
        }
        // int mat1[][]=new int[3][4];
        // int mat2[][]=new int[3][4];
        
        // read first matrix
        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //     mat1[i][j]=sc.nextInt();
        //     }
        // }
        // read second matrix
        // for(int i=0;i<mat2.length;i++){
        //     for(int j=0;j<mat2[i].length;j++){
        //         mat2[i][j]=sc.nextInt();
        //     }
        // }
    // sum of two matrices
    //     // compute sum
    //     int sum[][]=new int[3][4];
    //     for(int i=0;i<mat1.length;i++){
    //         for(int j=0;j<mat1[i].length;j++){
    //             sum[i][j]=mat1[i][j]+mat2[i][j];
    //         }
    //     }

    //     // print result
    //     System.out.println("Sum:");
    //     printMatrix(sum);
    //     sc.close();
    // }

    // public static void printMatrix(int[][] sum){
    //     for(int i=0;i<sum.length;i++){
    //         for(int j=0;j<sum[i].length;j++){
    //             System.out.print(sum[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    
    // multiplication of two matrices
    System.out.println("enter matrix mat1:");
        int mat1[][]=new int[r1][c1];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
            mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter matrix mat2:");
        int mat2[][]=new int[r2][c2];
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        sc.close();

        // result
        int res[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
            
        }
        System.out.println("Multiplicated matrix:");
        for(int i=0;i<res.length;i++) {
            for (int j=0; j<res[i].length;j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        // transpose of a matrix (printed directly from res without a new array)
        System.out.println("transposed matrix:");
        for (int j = 0; j < c2; j++) {
            for (int i = 0; i < r1; i++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}




    