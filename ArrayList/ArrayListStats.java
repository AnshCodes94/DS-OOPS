import java.util.*;

public class ArrayListStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(a);
        sc.close();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (Integer num : a) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double avg = sum / a.size();
        System.out.println("HIGHEST : " + max);
        System.out.println("LOWEST : " + min);
        System.out.printf("AVERAGE : %.2f ", avg);
    }

}
