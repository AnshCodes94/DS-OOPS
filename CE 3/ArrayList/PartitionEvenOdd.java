import java.util.*;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : a) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }
        System.out.print("Even: ");
        for (int num : even)
            System.out.print(num + " ");
        System.out.println();
        System.out.print("Odd: ");
        for (int num : odd)
            System.out.print(num + " ");
        sc.close();
    }
}
