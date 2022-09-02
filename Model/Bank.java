package Model;

import Model.Exception.NoMoneyEx;
import Model.ObserverPattern.Observable;
import Model.ObserverPattern.ObserverOffice;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank implements BankingOperations, Observable {
    private BankAccount bankAccount;
    private SavingAccount savingAccount;
    private ArrayList<BankAccount> accounts ;
    private ArrayList<ObserverOffice> observers;

   public Bank(){
       this.accounts=new ArrayList<BankAccount>();
       this.observers=new ArrayList<ObserverOffice>();
   }
    public int getNumOfAccounts(){
        return accounts.size();
    }
    public void addAccount(BankAccount account){
       this.accounts.add(account);
   }

   public void addSavingAccount(SavingAccount savingAccount){
       this.accounts.add(savingAccount);
   }

   public BankAccount getBankAccount(){
       return bankAccount;
   }

    @Override
    public void deposit(int nrAccount, double amount) {
        this.accounts.get(nrAccount).deposit(amount);
    }

    @Override
    public void withdraw(int nrAccount, double amount) {
        try {this.accounts.get(nrAccount).withdraw(amount);
        } catch (NoMoneyEx e){
            System.out.println(e.getInfoMo());
        }
    }

    @Override
    public void transfer(int nrAccountFrom, int nrAccountTo, double amount) {
        try {
            this.accounts.get(nrAccountFrom).withdraw(amount);
            this.accounts.get(nrAccountTo).deposit(amount);
            if (amount > 10000) {
                this.notifyObserverOffice(bankAccount, amount);
                System.out.println("Wire transfer over 10k!");
            }
        } catch (NoMoneyEx e){
            System.out.println(e.getInfoMo());
        }
    }


    @Override
    public void addObserverOffice(ObserverOffice observer) {
       observers.add(observer);

    }

    @Override
    public void deleteObserverOffice(ObserverOffice observer) {
       observers.remove(observer);

    }

    @Override
    public void notifyObserverOffice(BankAccount bankAccount, double amount) {
       for (int i=0;i< observers.size();i++){
           this.observers.get(i).update(bankAccount,amount);
       }

    }
}
