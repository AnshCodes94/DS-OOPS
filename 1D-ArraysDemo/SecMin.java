import java.util.*;

public class SecMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int smin = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                smin = min;
                min = a[i];
            }
            else if (a[i] < smin && a[i] != min){
                smin = a[i];
            }
            
        }
        if (smin == Integer.MIN_VALUE) {
             System.out.println(0);;
             }
        else {
        System.out.println(smin);
        }
        sc.close();
    }
}