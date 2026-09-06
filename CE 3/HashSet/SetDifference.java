import java.util.*;

public class SetDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int m = sc.nextInt();
        HashSet<Integer> b = new HashSet<>();

        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        a.removeAll(b);

        System.out.println(a);

        sc.close();
    }
}