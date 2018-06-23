package Service;

import Module.User;
import jdbc.Jdbc;

public class UserService {
    public boolean addUser(User user) {
        String SQL = "insert into tb_user values(" + user.getId() + ",'" + user.getName() + "'," + user.getAge() + ",'" + user.getSex() + "'," + user.getPhoneNum() + ",'" + user.getMail() + "','" + user.getAdress() + "' ,'" + user.getPassword() + "');";
        //  String SQL = "insert into tb_user values ('"+user.getId()+"','"+user.getPassid()+"','"+user.getName()+"','"+user.getMail()+"',"+user.getAge()+",'地球人') ";
        //  insert into tb_flightinfo values('哈尔滨','云南',246758,'2017-9-9','13:00','19:00',500,88);
        return Jdbc.executInsert(SQL);
    }

    public boolean addUser(int phoneNum, String password) {
        int AccountName;
        String Accountmima;
        // if (phoneNum=AccountName&&password=Accountmima){
        System.out.println("账户注册成功");

        // }
        return true;

    }
}


