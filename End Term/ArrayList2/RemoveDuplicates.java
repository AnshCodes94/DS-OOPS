package ArrayList2;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (list.get(i) == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = list.get(i);
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}