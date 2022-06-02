package secao14.Aula143.application;

import secao14.Aula143.entities.Account;
import secao14.Aula143.entities.BussinessAccount;
import secao14.Aula143.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1000, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0,500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

        //BussinessAccount acc5 = (BussinessAccount) acc3;
        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
