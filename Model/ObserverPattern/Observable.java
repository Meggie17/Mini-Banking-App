package Model.ObserverPattern;

import Model.BankAccount;

public interface Observable {

    public void addObserverOffice (ObserverOffice observer);

    public void deleteObserverOffice(ObserverOffice observer);

    public void notifyObserverOffice (BankAccount bankAccount, double amount);

}
