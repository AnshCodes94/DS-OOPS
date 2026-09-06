import java.util.*;

public class FilterByStartingChar {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      LinkedList<String> a = new LinkedList<>();
      LinkedList<String> b = new LinkedList<>();
      for (int i = 0; i < n; i++) {
         a.add(sc.next());
      }
      char w = sc.next().charAt(0);
      for (String num : a) {
         if (num.charAt(0) == w) {
            b.add(num);
         }
      }
      if (b.isEmpty()) {
         System.out.println("Empty");
      }
      for (String num : b) {
         System.out.print(num + " ");
      }
      sc.close();

   }

}
