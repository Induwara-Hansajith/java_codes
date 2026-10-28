package abstraction;

public class Main {
    
    public static void main(String arg[]){
        SavingsAccount save1 = new SavingsAccount();

        save1.Deposit(10000);
        save1.Withdraw(2000);

        System.out.println("Saving intereest is : " +save1.calculateInterest());

        CurrentAccount current1 = new CurrentAccount();
        current1.Deposit(5000);
        System.out.println("Saving intereest is : " +current1.calculateInterest());
    }
}
