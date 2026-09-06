import java.util.*;
public class TargetSearchAndFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int target = sc.nextInt();
        int firstIndex = -1;
        int frequency = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                frequency++;
            }
        }
        if (firstIndex != -1) {
            System.out.println("Found");
            System.out.println(firstIndex);
            System.out.println(frequency);
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
