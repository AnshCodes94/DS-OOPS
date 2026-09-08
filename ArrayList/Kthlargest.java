import java.util.*;

public class Kthlargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(k - 1));

        sc.close();
    }
}