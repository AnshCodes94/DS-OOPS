import java.util.*;

public class FindPalindromeStrings


 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> a = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.next());
        }
        LinkedList<String> b = new LinkedList<>();
        for (String num : a) {
            String word = num.toLowerCase();
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equals(rev)) {
                b.add(num);
            }
        }
        if (b.isEmpty()) {
            System.out.println("No Palindrome");
        }
        for (String num : b) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
