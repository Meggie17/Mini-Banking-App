package Model;

public class SavingAccount extends BankAccount{
    private double interest;
    private double interestRate = 0.03D;

    public SavingAccount(Owner owner, int nrAccount) {
        super(owner, nrAccount);
    }

    public double savingBalance() {
        this.interest = this.getBalance() * 365.0D * this.interestRate / 365.0D;
        return this.getBalance() + this.interest;
    }
}
