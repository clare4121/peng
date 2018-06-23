package bank;

public class Customer {
     private String firstName;
     private String lastName;
    //last name和 first name 为名字和姓氏
     private Account[] accounts;
     private  int numberOfAccount;



    public  Customer(String f,String l) {
        firstName = f;
        lastName = l;
        accounts= new Account[2];
        //一个Customer有两个账户就够了
    }
    /////
    public Customer(){}
    ///
    public Account getAcount(int index) {
        return accounts[index] ;
    }
    ////
    public void addAcount(Account account) {
      accounts[numberOfAccount++]=account;
    }
   //////
    public  int getNumberOfAccount(){
        return numberOfAccount;
     }
     /////
    public String getFirstName() {
        return firstName;
    }
////////////
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/////////
     public String getLastName() {
        return lastName;
    }
/////////////
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }


 }



