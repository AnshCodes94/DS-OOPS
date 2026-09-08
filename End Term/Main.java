import java.util.*;

public class Main {

    static ArrayList<Integer> frequencyRank(ArrayList<Integer> list) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int num : list) {
            if (!distinct.contains(num)) {
                distinct.add(num);
            }
        }

        ArrayList<Integer> counts = new ArrayList<>();
        for (int num : distinct) {
            counts.add(frequencyMap(list, num));
        }

        for (int i = 0; i < distinct.size() - 1; i++) {
            for (int j = 0; j < distinct.size() - 1 - i; j++) {
                if (counts.get(j) < counts.get(j + 1)) {
                    int tempCount = counts.get(j);
                    counts.set(j, counts.get(j + 1));
                    counts.set(j + 1, tempCount);

                    // Swap corresponding numbers
                    int tempNum = distinct.get(j);
                    distinct.set(j, distinct.get(j + 1));
                    distinct.set(j + 1, tempNum);
                }
            }
        }

        return distinct;
    }

    static int frequencyMap(ArrayList<Integer> list, int value) {
        int count = 0;
        for (int num : list) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        int value = sc.nextInt();

        System.out.println(frequencyRank(list));
        System.out.println(frequencyMap(list, value));

        sc.close();
    }
}