import java.util.*;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) < 0 || a.get(i) > 100) {
                a.remove(i);
                i--;
            }
        } 
        if(a.isEmpty()) {
            System.out.println("No Valid Marks");
            sc.close();
            return;
        }
        int h = Integer.MIN_VALUE;
        int l = Integer.MAX_VALUE;
        double sum = 0;
        int p = 0;
        for(int i = 0; i < a.size(); i++) {
            int num = a.get(i);
            sum += num;
            if(num > h) {
                h = num;
            }
            if(num < l) {
                l = num;
            }
            if(num >= 40) {
                p++;
            }
        }
        double avg = sum / a.size();
        System.out.print("Valid Marks: ");
        for(int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Highest: " + h);
        System.out.println("Lowest: " + l);
        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Pass Count: " + p);
        sc.close();
    }
}
