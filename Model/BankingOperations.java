package Model;

import Model.Exception.NoMoneyEx;

public interface BankingOperations {

    void deposit(int nrAccount,double amount);
    void withdraw(int nrAccount,double amount);
    void transfer(int nrAccountFrom,int nrAccountTo,double amount);
}
