import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire line of input
        String s = sc.nextLine();
        
        // Split the sentence by spaces into an array of words
        String[] str = s.split(" ");
        
        // Print the words joined by hyphens
        for(int i = 0; i < str.length - 1; i++){
            System.out.print(str[i] + "-");
        }
        System.out.println(str[str.length - 1]);

        sc.close();
    }
}