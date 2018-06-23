package bank;
public class Account {
     protected  double balance;
     //构造器



     public  Account(double balance){
         this.balance=balance;
     }

     //banance 余额
     public  double getBalance(){
         return balance;
}
//cun qian
     public boolean  deposit(double amt){
         balance+=amt;
         return true;
     }
     public boolean withdraw( double amt){

         if(balance<amt){
             return  false;
         }
         balance-=amt;
        return true;
     }
}
