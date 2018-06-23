package bank;
//创建一个SavingAccount继承 Account
public class SavingAccount extends Account {
private double interestRate;
public SavingAccount(double banlance,double interestRate){
    super(banlance);
    //调用父类中的protect的方法
    //super另外作用调用父类protected函数通"super"魔咒我才能操作父类protected员别
    this.interestRate=interestRate;
}

}
