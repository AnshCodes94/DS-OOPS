import java.util.*;

public class St {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //! 2D Array questions
        // int row1 = sc.nextInt();
        // int col1 = sc.nextInt();
        // int row2 = sc.nextInt();
        // int col2 = sc.nextInt();

        // int[][] arr1 = new int[row1][col1];
        // int[][] arr2 = new int[row2][col2];
        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;

        // int odd = 0;
        // int even = 0;

        // int sum[][] = new int[row1][col1];
        // int product[][]=new int[row1][col2];

        // for (int i = 0; i < row1; i++) {
        //     for (int j = 0; j < col1; j++) {
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < row2; i++) {
        //     for (int j = 0; j < col2; j++) {
        //         arr2[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i= 0; i<rows ; i++){
        //     for(int j = 0; j<cols; j++){
        //         if(arr[i][j]>max){
        //             smax = max;
        //             max = arr[i][j];
        //         }
        //     }
        // }if (smax!=Integer.MIN_VALUE){
        //         System.out.println(smax);
        // } 

        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //         if(arr[i][j]%2==0){
        //             even++;
        //         }else
        //             odd++;
        //     }
        // }

        // for(int i=0;i<row1;i++){
        //     for(int j=0;j<col1;j++){
        //         sum[i][j] = arr1[i][j] + arr2[i][j];
        //     }
        // }

        // for(int i=0;i<row1;i++){
        //     for(int j=0;j<col1;j++){
        //         System.out.print(sum[i][j]+" ");
        //     }
        //     System.out.println();
        // }

//         if(col1 != row2){
//             System.out.println("not possible");
//         }
//         else {
//         for(int i=0;i<row1;i++){
//             for(int j = 0; j < col2 ;j++){
//                 for(int k=0; k<col1; k++){
//                     product [i][j] += arr1[i][k] * arr2[k][j]; 
//                 }
//             }
//         }
//     }

//         for (int i=0;i<row1;i++){
//             for(int j = 0; j<col2 ;j++){
//                 System.out.print(product[i][j]+" ");
//             }
//             System.out.println();
//         }
// System.out.println("transpose\n");
//         for (int i=0;i<row1;i++){
//             for(int j = 0; j<col2 ;j++){
//                 System.out.print(product[j][i]+" ");
//             }
//             System.out.println();
//         }
        
       

//! ends here

//? strings 
    // String s = sc.nextLine();
    // String[] a = s.split(" ");
    // String res = "";

    // for(int i=0;i<a.length;i++){
    //     String w = a[i];
    //     if(w.length()>0){
    //         String fc = w.substring(0,1).toUpperCase();
    //         String rc = w.substring(1,w.length()).toLowerCase();
    //         res += fc + rc + " ";
    //     } 
    // }
    //  System.out.println(res);

    // String s = sc.nextLine();
    // char ch = sc.next().charAt(0);
    // int count = 0;
    // for(int i = 0;i<s.length();i++){
    //     if(s.charAt(i) == ch){
    //         count++;
    //     }
    // }
    // System.out.println(count);

    String s = sc.nextLine().toLowerCase();

    StringBuilder sb = new StringBuilder(s);
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i'|| sb.charAt(i)=='o'|| sb.charAt(i)=='u'){
            sb.deleteCharAt(i);
            i--;
        }
    }
    System.out.println(sb.toString());


    //String str = sc.nextLine();
    StringBuilder sbstr = new StringBuilder(s);
    sbstr.reverse();
    System.out.println(sbstr.toString());

       sc.close();
    }
}



