import java.util.*;
public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] words=line.split(" ");
        ArrayList<String> a=new ArrayList<>(Arrays.asList(words));
        System.out.println("Word Count: "+a.size());
        String longest=a.get(0),shortest=a.get(0);
        for(String s:a){
            if(s.length()>longest.length()) longest=s;
            if(s.length()<shortest.length()) shortest=s;
        }
        System.out.println("Longest: "+longest);
        System.out.println("Shortest: "+shortest);
        System.out.print("Vowel Words: ");
        for(String s:a){
            char c=Character.toLowerCase(s.charAt(0));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("Reversed: ");
        for(String s:a){
            System.out.print(new StringBuilder(s).reverse().toString()+" ");
        }

        sc.close();
    }
}
