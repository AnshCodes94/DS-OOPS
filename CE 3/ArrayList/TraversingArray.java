import java.util.*;

public class TraversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        sc.close();
    }
}
