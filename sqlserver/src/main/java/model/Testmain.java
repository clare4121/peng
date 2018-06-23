package model;

import servlet.UserServices;

import java.util.Scanner;

public class Testmain {
    public static void main(String[] args) {
        User peng=new User();
        //新建一个名为peng 的user用户。
        peng.setAge(20);
        //peng可以调用user里面定义的构造函数
        peng.name="cyy";
        peng.passid="7768";
        peng.setId("1234");
        peng.setMail("36984@qq.com");
        // name声明为public可以直接用此方法而age为private因此只能用setAge
       // System.out.println(peng.toString());
        //系统输出user里的定义的构造函数
        peng.setId("678");
        //user里定义的构造函数
        UserServices userServices=new UserServices();
        //新建一个名为userservices的UsersServices 与行6类似
       userServices.addUser(peng);
//        String id="";
//        Scanner scanner =new Scanner(System.in);
//        id = scanner.nextLine();
////        userServices.getUser(id);
//        userServices.getUser(id);
    }
}
