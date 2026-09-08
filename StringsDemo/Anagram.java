import java.util.*;

public class Anagram {
    public static boolean isAnagram(String w1, String w2) {
        
        if (w1.length() != w2.length()) 
            return false;

        char[] a1 = w1.toCharArray();
        char[] a2 = w2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // Clear newline buffer

        String result = ""; 

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] parts = line.split("-");

            String word1 = parts[0].trim().toLowerCase();
            String word2 = parts[1].trim().toLowerCase();

            if (isAnagram(word1, word2)) {
                result += "YES\n";
            } else {
                result += "NO\n";
            }
        }

        System.out.print(result);

        sc.close();
    }
}