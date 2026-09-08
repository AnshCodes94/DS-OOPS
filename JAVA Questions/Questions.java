// Hello World program in Java
// public class Hello {
//     public static void main(String args[]){
//         System.out.println("Hello Ansh! Welcome to Java programming.");
//     }
// }

// Maximum of three numbers
// public class Hello {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int max = a;
//         if(b > max){
//             max = b;
//         }
//         if(c > max){
//             max = c;
//         }
//         System.out.println(max);
//     }
// }

// use of makedouble with variables to do addtion and multiplication
// public class Hello{
//     public static void main(String args[]   ){
//         double a = 10.5;
//         double b = 20.5;
//         double c = 30.5;
//         double sum = a + b + c;
//         double product = a * b * c;
//         System.out.println("Sum: " + sum);
//         System.out.println("Product: " + product);
//     }
// }

// find the number is even or not
// public class Hello{
//     public static void main(String args[]){
//         int num = 10;
//         if(num % 2 == 0){
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }

// read three variable input from user and print it
// import java.util.Scanner;
// public class Hello{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = scanner.nextInt();
//         System.out.print("Enter the third number: ");
//         int c = scanner.nextInt();
//         System.out.println("The three numbers are: " + a + ", " + b + ", " + c);
//     }
// }

// using return statement in a method to find the the  um is even or odd
// public class Hello{
//     public static void main(String args[]){
//         int num = 10;
//         boolean result = isEvenOrOdd(num);
//         System.out.println(result);
//     }
//     public static boolean isEvenOrOdd(int n){
//         if(n % 2 == 0){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// import java.util.Scanner;
// public class Questions{
//     public static void main(String args[]){
//         Scanner inputs = new Scanner(System.in);
//         System.out.println("enter inputs:");
//         int x = inputs.nextInt();
//         int y = inputs.nextInt();
//         if(x>y){
//             System.out.println("x");
//         }
//         else{
//             System.out.println("y");
//         }
//         inputs.close();  
//     } 
// }

// max by function
// import java.util.Scanner;
// public class Questions{
//     public static void main(String[] args) {
//         Scanner inputs = new Scanner(System.in);
//         int x = inputs.nextInt();
//         int y = inputs.nextInt();
//         int z = inputs.nextInt();
//         int res = maxvalue(x, y, z);
//         System.out.println(res);
//         inputs.close();

//     }
//     public static int maxvalue(int a,int b,int c){
//     if(a>b&&a>c){
//         return a;
//     }
//     else if(b>a&&b>c){
//         return b;
//     }
//     else{
//         return c;
//     }
// } 
// }

// function to print from 1 to 10 in one line
// public class Questions{
//     public static void main(String[] args) {
//         int x = 10;
//         printNumbers(x);
//     }
//     public static int printNumbers(int n){ {
//         for(int i=1;i<=n;i++){
//             System.out.print(i + " ");
//         }
//         return 0;
//     }
// }
// }

//function to print table of 7
// public class Questions{
//     public static void main(String[] args) {
//         int x = 7;
//         printTable(x);
//     }
//     public static void printTable(int n) {
//         for(int i=1;i<=10;i++){
//             System.out.println(n + " * " + i + " = " + (n*i));
//         }
//     }
// }

// function to print table of any number
// import java.util.Scanner;
// public class Questions{
//     public static void main(String[] args) {
//         Scanner inputs = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int x = inputs.nextInt();
//         printTable(x);
//         inputs.close();
//     }
//     public static void printTable(int n) {
//         for(int i=1;i<=10;i++){
//             System.out.println(n + " * " + i + " = " + (n*i));
//         }
//     }
// }
    
// function to print table in which if the count multiple is a odd print table of 3 and if even print table of 5
// import java.util.Scanner;
// public class Questions {
//     public static void main(String[] args) {
//         Scanner inputs = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int terms = inputs.nextInt();
//         int count3 = 1; // Tracks the multiplier for the 3 table
//         int count5 = 1; // Tracks the multiplier for the 5 table
//         inputs.close();

//         for (int i = 1; i <= terms; i++) {
//             // If the position in the print sequence is odd
//             if (i % 2 != 0) {
//                 System.out.print(3 * count3);
//                 count3++; // Move to the next multiple of 3
//             } 
//             // If the position in the print sequence is even
//             else {
//                 System.out.print(5 * count5);
//                 count5++; // Move to the next multiple of 5
//             }
//             System.out.println(); // New line at the end
//     }
// }
// }



// public class Questions {
//     public static void main(String[] args) {
//       int x=1;
//       int diff=1;
//       for(int i=1;i<=10;i++){
//         System.out.println(x);
//         x=x+diff;
//         diff++;
//       } 
// }
// }

