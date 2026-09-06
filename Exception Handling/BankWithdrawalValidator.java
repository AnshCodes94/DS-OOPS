import java.util.*;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
public class BankWithdrawalValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            if(a<b){
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            System.out.println(a-b);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}
