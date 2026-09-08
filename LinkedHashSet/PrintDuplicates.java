import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();
        LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (seen.contains(x)) {
                duplicate.add(x);
            } else {
                seen.add(x);
            }
        }
        for (int num : duplicate) {
            System.out.println(num);

        }

        sc.close();
    }
}