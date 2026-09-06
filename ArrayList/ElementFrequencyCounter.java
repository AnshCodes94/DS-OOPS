import java.util.*;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int num = a.get(i);
            if (!b.contains(num)) {
                int f = Collections.frequency(a, num);
                System.out.println(num + ": " + f);
                b.add(num);

            }
        }

        sc.close();
    }

}
