package Model.Offices;

import Model.BankAccount;
import Model.ObserverPattern.ObserverOffice;

public class TaxOffice implements ObserverOffice {

    public void raport(BankAccount bankAccount, double amount){

    }
    @Override
    public void update(BankAccount bankAccount, double amount) {
        this.raport(bankAccount,amount);


    }
}
