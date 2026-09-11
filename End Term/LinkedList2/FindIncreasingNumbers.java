package LinkedList2;
import java.util.*;

public class FindIncreasingNumbers {
    public static LinkedList<Integer> findIncreasingPrices(LinkedList<Integer> prices) {
        LinkedList<Integer> result = new LinkedList<>();
        
        // Compare each element with the element immediately before it
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) > prices.get(i - 1)) {
                result.add(prices.get(i));
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> prices = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        LinkedList<Integer> result = findIncreasingPrices(prices);

        if (result.isEmpty()) {
            System.out.print("No Price Increase");
        } else {
            for (int price : result) {
                System.out.print(price + " ");
            }
        }

        sc.close();
    }
}