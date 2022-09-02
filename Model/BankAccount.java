package Model;

import Model.Exception.NoMoneyEx;

public class BankAccount implements Account {
    private double balance;
    private Owner owner;
    private int nrAccount;


    public BankAccount(Owner owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public BankAccount(Owner owner, int nrAccount) {
        this.setNrAccount(nrAccount);
        this.owner = owner;
        this.balance = 0.0;
    }


    public void setNrAccount(int nrAccount) {
        this.nrAccount = nrAccount;
    }

    public int getNrAccount() {
        return this.nrAccount;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Funds have been deposited into the account" + " " + nrAccount);
    }

    @Override
    public void withdraw(double amount) throws NoMoneyEx{
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Funds have been withdrawn from the account" + " " + nrAccount);

        } else {
            NoMoneyEx nme = new NoMoneyEx();
            nme.setInfoMo("Does not have sufficient funds");
            throw nme;
        }

    }

}
