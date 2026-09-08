import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line=sc.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] numbers=line.split("\\s+");
            int total=0;
            for (String num:numbers) {
                if (!num.isEmpty()) {
                    total+=Integer.parseInt(num);
                }
            }
            System.out.println(total);

            sc.close();
        }
    }
}
