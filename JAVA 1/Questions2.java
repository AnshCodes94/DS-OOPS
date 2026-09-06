import java.util.Scanner;

public class Questions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start and end number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //isPrime(a);
        printPrime(a,b);
        sc.close();
    }
// check whether a number is prime or not
    public static boolean isPrime(int num) {
        for(int i=2;i<num;i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
// print prime numbers between a to b
    public static void printPrime(int a, int b) {
        System.out.print("Prime numbers are:");
        for (int i=a;i<=b;i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
