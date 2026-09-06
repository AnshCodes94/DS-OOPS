import java.util.*;

public class ShiftZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int zeroCount = 0;

        // Read input: separate non-zero values from zero counts directly
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                zeroCount++;
            } else {
                list.add(val);
            }
        }

        // Add zeros to the end of the ArrayList
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        System.out.println(list);
        sc.close();
    }
}