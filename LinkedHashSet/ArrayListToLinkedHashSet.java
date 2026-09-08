import java.util.*;

public class ArrayListToLinkedHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);

        sc.close();
    }
}