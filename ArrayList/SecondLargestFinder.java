import java.util.*;
public class SecondLargestFinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> a =new ArrayList<>();
        for (int i=0;i<n;i++) {
            a.add(sc.nextInt());
        }
        int max =Integer.MIN_VALUE;
        int secmax =Integer.MIN_VALUE;
        for (int num : a) {
            if (num> max) {
                secmax= max;
                max= num;
            } else if (num!= max && num> secmax) {
                secmax= num;
            }
        }
        if (secmax == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element");
        } else {
            System.out.println(secmax);
        }

        sc.close();
    }
}
