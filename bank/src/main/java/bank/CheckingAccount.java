package bank;

public class CheckingAccount extends Account{
    private  double overdraftProtection;

    public CheckingAccount(double banlance){
        super(banlance);
    }



    public CheckingAccount(double banlance,double overdraftProtection){
        super(banlance);
        this.overdraftProtection=overdraftProtection;
    }



public boolean withdraw(double amt) {
//余额不足
        if(balance>=amt){
            balance-=amt;
        }else {
            //透支保护不够
            if(overdraftProtection>=(amt-balance)){
                overdraftProtection-=(amt-balance);
            }
            //余额不足且透支保护也不足
            else {
                return false;
            }
        }
   return true;
}
}
