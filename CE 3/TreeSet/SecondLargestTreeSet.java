import java.util.*;

public class SecondLargestTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println(set.lower(set.last()));

        sc.close();
    }
}