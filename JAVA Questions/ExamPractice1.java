import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExamPractice1 {

   public static void swapPairs(List<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            Collections.swap(list, i, i + 1);
        }
    }

    public static List<String> getRepeatedWords(List<String> list) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (String word : list) {
            if (!seen.add(word)) {
                repeated.add(word);
            }
        }

        if (repeated.isEmpty()) {
            throw new NullPointerException("No repeated Words");
        }

        return new ArrayList<>(repeated);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");

        // QUESTION 1
        swapPairs(list);
        // function swaps 1st element with 2nd, 3rd with 4th
        // and so on (for odd number of elements last element is as it is)
        // after the function if i print the list, answer must be :
        // two one four three six five seven

        for (String word : list)
            System.out.println(word + " ");

        list.add("two");
        list.add("three");
        list.add("four");

        List<String> repeatedList = getRepeatedWords(list);

        // Write a function that returns the repeated words
        // If no word found, returns NullPointerException with
        // message "No repeated Word"

        for (String word : repeatedList)
            System.out.println(word);

        // Test 2
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        try {
            List<String> repeats = getRepeatedWords(list2);

            for (String word : repeats)
                System.out.println(word);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}