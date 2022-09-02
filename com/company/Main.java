package com.company;

import Controler.BusinessLogic;
import Model.Bank;
import Model.BankAccount;
import Model.Offices.TaxOffice;
import Model.Owner;
import View.ViewInterface;

public class Main {

    public static void main(String[] args) {
        Bank model= new Bank();
        BusinessLogic controller=new BusinessLogic(model);
        ViewInterface view = new ViewInterface(controller);


        controller.setBank(model);
        view.setController(controller);

        controller=null;
        model=null;






    }

}
