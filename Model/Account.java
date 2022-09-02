package Model;

import Model.Exception.NoMoneyEx;

public interface Account {
    void deposit(double amount);

    void withdraw(double amount) throws NoMoneyEx;
}
