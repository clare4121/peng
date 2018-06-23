package test;

import bank.Bank;
import bank.CheckingAccount;
import bank.Customer;
import bank.SavingAccount;

public class Test6 {
    public static void main(String[] args) {
        Bank bank =new Bank();
        Customer customer;
        bank.addCustomer("Jane","Simms");
        customer=bank.getCustomers(0);
        customer.addAcount(new SavingAccount(500.00,0.05));
        customer.addAcount(new CheckingAccount(200,400));



    }
}
