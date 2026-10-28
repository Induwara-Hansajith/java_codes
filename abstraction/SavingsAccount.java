package abstraction;

public class SavingsAccount extends BankAccount {
    
    @Override 
    double calculateInterest(){
        return balance * 0.05;
    }
}
