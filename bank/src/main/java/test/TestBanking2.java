package test;
import bank.Account;
import bank.Customer;
public class TestBanking2 {
    public static void main(String[] args) {

        Customer customer=null;
        Account account=null;

        account =new Account(500.00);
        customer=new Customer("Jane","Smith");
        //customer.getAcount().withdraw(150.00);

        // creat an account that can has 500.00 banlance
        System.out.println("Creating an account with a 500.00 banlance.");
        customer.addAcount(account);
//设置一个账户名字为account也就是上面创建的 account =new Account(500.00);账户这个账户中有500元
        //code
        System.out.println("Withdraw 150.00"+account.withdraw(150.00));

        System.out.println("Deposit 22.50"+account.deposit(22.50));

        System.out.println("Withdraw 47.62"+account.withdraw(47.62));
        //account.withdraw(47.62);
        //System.out.println("The account has a banlance of "+account.getBalance());
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a banlance of "+account.getBalance());
    }
}
