// public class Patterns {
//     public static void main(String args[]){
//1.    
        // pattern 1 to 5
        // for(int i=1;i<=5;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
//2.
        // pattern 5 to 1
        // for(int i=5;i>=1;i--){
        //     for (int j=5;j>=i;j--){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
//3.
        // pattern from right to left 5 to 1
        // for(int i=5;i>=1;i--){
        //     for (int j=1;j<=i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=5;k>=i;k--){
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }

//4.       
        // pattern from A to E
        // for(char i='A';i<='E';i++){
        //     for(char j='A';j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
//5.
        // pattern from right to left 1 to 5
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }
//    }
//}


// import java.util.Scanner;
// public class Patterns{
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(j+" ");
//                         }
//                         for(int k=1;k<=2*(n-i);k++){
//                                 System.out.print("  ");
//                         }
//                         for(int s=i;s>=1;s--){
//                                 System.out.print(s+" ");
//                         }
//                         System.out.println();
//                 }
//                 sc.close();
//         }
// }


public class Patterns{
        public static void main(String[] args) {
                //print pattern 
                // 1
                // 2 2
                // 3 3 3
                // 4 4 4 4
                // 5 5 5 5 5
                // for(int i=1;i<=5;i++){
                //         for(int j=1;j<=i;j++){
                //                 System.out.print(i+" ");
                //         }
                //         System.out.println();
                // }

        // print pattern
        //1
        //2  3
        //4  5  6
        //7  8  9  10
        //11 12 13 14 15
                // int n=1;
                // for(int i=1;i<=5;i++){
                //         for(int j=1;j<=i;j++){
                //                 System.out.print(n+" ");
                //                 if(n<10){
                //                         System.out.print(" ");
                //                 }
                //                 n++;
                //         }
                //         System.out.println();
                // }

//print pattern - Diamond
        //    *
        //  * * *
        //* * * * *      
        //  * * *
        //    *
       
        // int n = 5; 

        // // 1. Top half (including middle row)
        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // 2. Bottom half
        // for (int i = n - 1; i >= 1; i--) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// print pattern - hollow diamond
        //    

        // int n = 3; // Height of the top half

        // // 1. Top half (including middle row)
        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print hollow stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         if (j == 1 || j == (2 * i - 1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // // 2. Bottom half
        // for (int i = n - 1; i >= 1; i--) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print hollow stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         if (j == 1 || j == (2 * i - 1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

// number triangle
//      1
//    1 2 3
//  1 2 3 4 5
//1 2 3 4 5 6 7
        // int n =4;
        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     // Print stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // } 

// triangle 
//    1
//  1 2 1
//1 2 3 2 1

        int n = 4;
        for(int i = 1; i <= n; i++) {
            // Print leading spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print ascending numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print descending numbers
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

