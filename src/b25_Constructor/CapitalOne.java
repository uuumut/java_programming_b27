package b25_Constructor;

import b25_Constructor.BankAccount;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet",123456789,0.0);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();
        System.out.println(account1);

        System.out.println("=========================");

        BankAccount account2 = new BankAccount();
        account2.setInfo("aygul",42352635,2000);
        account2.deposit(54343);
        System.out.println(account2.balance);


    }
}
