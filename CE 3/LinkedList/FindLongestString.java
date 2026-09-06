import java.util.*;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> a = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.next());
        }
        String b = "";
        for (String num : a) {
            if (num.length() > b.length()) {
                b = num;
            }
        }
        System.out.println(b);

        sc.close();
    }
}
