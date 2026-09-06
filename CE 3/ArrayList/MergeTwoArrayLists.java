import java.util.*;

public class MergeTwoArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 =
                new ArrayList<>(Arrays.asList(10, 20, 30));

        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(30, 40, 50));

        ArrayList<Integer> result = new ArrayList<>(list1);

        for(int i = 0; i < list2.size(); i++) {

            if(!result.contains(list2.get(i))) {
                result.add(list2.get(i));
            }
        }

        System.out.println(result);
    }
}