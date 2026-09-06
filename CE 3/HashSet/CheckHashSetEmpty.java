import java.util.*;

public class CheckHashSetEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (set.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
        sc.close();
    }
}