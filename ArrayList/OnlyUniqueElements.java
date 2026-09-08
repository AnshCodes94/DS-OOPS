import java.util.*;

public class OnlyUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size(); i++) {
            if(Collections.frequency(list, list.get(i)) == 1) {
                System.out.print(list.get(i) + " ");
            }
        }

        sc.close();
    }
}