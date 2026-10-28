package abstraction;

abstract class BankAccount {
    
    protected double balance;

    public void Deposit(double amount){
        balance = balance + amount;
    }

    public void Withdraw(double amount){
        balance = balance - amount;
    }

    abstract double calculateInterest();
}