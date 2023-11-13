package Model;

public class SavingAccount extends BankAccount{

    private double annualInterestRate = 0.03;
    private double monthlyInterest;

    public SavingAccount(Owner owner) {
        super(owner);
    }

    public double savingBalance(){
        monthlyInterest=getBalance()*annualInterestRate/12;
        return monthlyInterest + getBalance();
    }
    public String toString() {
        return "Account fund: " + savingBalance() + "zł";
    }
}


