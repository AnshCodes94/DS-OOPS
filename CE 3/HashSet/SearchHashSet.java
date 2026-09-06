import java.util.*;

public class SearchHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int x = sc.nextInt();

        if (set.contains(x)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}