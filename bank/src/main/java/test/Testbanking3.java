package test;

import bank.Bank;
import bank.Customer;
import bank.Account;

public class Testbanking3 {
    public static void main(String[] args) {
        Bank bank =new Bank();
        bank.addCustomer("Jane","Simms");
        bank.addCustomer("Owen","Bryant");
        bank.addCustomer("Tim","Soley");
        bank.addCustomer("Maria","Soley");
        for(int i=0;i<bank.getNumOfCustomers();i++){
            Customer customer=bank.getCustomers(i);
            System.out.println("Customer["+(i+1)+"] is "+customer.getLastName()+","+customer.getFirstName());
        }
    }


}
