package LinkedList2;

import java.util.*;

public class FindDuplicateElements {
    public static LinkedList<Integer> findFrequentSites(LinkedList<Integer> history) {
        LinkedList<Integer> result = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Identify which elements appear more than once
        for (int id : history) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }

        // Maintain original first-appearance order
        for (int id : history) {
            if (duplicates.contains(id) && !result.contains(id)) {
                result.add(id);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> history = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            history.add(sc.nextInt());
        }

        LinkedList<Integer> result = findFrequentSites(history);

        if (result.isEmpty()) {
            System.out.print("No Frequently Visited Sites");
        } else {
            for (int id : result) {
                System.out.print(id + " ");
            }
        }

        sc.close();
    }
}