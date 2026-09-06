import java.util.*;
class InvalidNumberException extends Exception{
    InvalidNumberException(String message){
        super(message);
    }
}
public class SortedRangeValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> a=new TreeSet<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            try{
                if(val<0 || val>100){
                    throw new InvalidNumberException("Invalid Input: "+ val);
                }
                a.add(val);
            }
            catch(InvalidNumberException e){
            System.out.println(e.getMessage());
        }
        }
        for(Integer num:a){
            System.out.print(num +" ");
        }

        sc.close();
    }
    
}
