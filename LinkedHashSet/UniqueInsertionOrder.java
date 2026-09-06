import java.util.*;

public class UniqueInsertionOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println(set);

        sc.close();
    }
}