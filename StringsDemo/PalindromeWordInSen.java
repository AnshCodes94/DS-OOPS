import java.util.*;

public class PalindromeWordInSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            if (word.equalsIgnoreCase(rev) && word.length() > 0) {
                System.out.print(word + " ");
            }
        }
        sc.close();
    }
}