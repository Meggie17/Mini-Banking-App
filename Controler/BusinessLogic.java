package Controler;

import Model.Bank;
import Model.BankAccount;
import Model.Owner;

public class BusinessLogic {
    private Bank bank;


    public BusinessLogic(Bank bank){
        this.bank=bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    public BankAccount addNewAccount(Owner owner){
        BankAccount account = new BankAccount(owner);
        this.bank.addAccount(account);
        return account;
    }

    public void deposit (double amount, int nrAccount){
        this.bank.deposit(nrAccount, amount);
    }

    public void withdraw (double amount, int nrAccount){
        this.bank.withdraw(nrAccount,amount);
    }

    public void transfer (int nrAccountFrom, int nrAccountTo,double amount){
        this.bank.transfer(nrAccountFrom, nrAccountTo, amount);
    }
}
