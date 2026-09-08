class Account{
    private static int nextAcno=1101;
    private int acno;
    private double balance;

    public int getAcno(){
        return acno;
    }
    public double getBalance(){
        return balance;
    }
    public Account(){
        this.acno = nextAcno;
        nextAcno++;
        this.balance = 0;
        System.out.println("account created succesfully");
    }
    public void deposit(double amt){
        System.out.println(amt + " deposited to account no "+ acno);
        balance = balance + amt;
    }
    public void withdrawal(double amt){
        if(balance<amt){
            System.out.println("account balance not sufficient");
        }
        System.out.println(amt+" withdrawed from account no "+ acno);
        balance = balance - amt;
    }
    public void show(){
        System.out.println("Ac no "+acno+" with balance "+balance);
    }
}
class SavingAc extends Account{
    private String debitCard;
    public SavingAc(String debitCard){
    super();                                  //! must be the first statement define in the subclass constructor
    this.debitCard = debitCard;
    System.out.println("Saving ac created successfully");
    }
    public String getDebitCard(){
        return debitCard;
    }
    public void show(){
        System.out.println("Saving acc with acc no " + getAcno() + " balance " + getBalance() + " debitCard " + debitCard);
    }
}

public class Inheritancewithstatic {
        public static void main(String[] args) {
            Account account1 = new Account();
            account1.show();
            account1.deposit(10000);
            account1.show();
            account1.withdrawal(5000);
            account1.show();


            SavingAc savingAc1 = new SavingAc("1014e");
            savingAc1.show();
        }
}
