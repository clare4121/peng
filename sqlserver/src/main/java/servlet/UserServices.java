package servlet;

import jdbc.Jdbc;
import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserServices {

    public boolean addUser(User user){
      // String SQL ="insert into tb_user values("+user.getId()+","+user.getName()+","+user.getAge()+","+user.getMail();
        String SQL = "insert into tb_user values ('"+user.getId()+"','"+user.getPassid()+"','"+user.getName()+"','"+user.getMail()+"',"+user.getAge()+",'地球人') ";
     return Jdbc.executInsert(SQL);
     }

     ///////////////////
    public User updateUser(User user){


        String SQL ="UPDATE tb_user SET name = '小ming',mail= '6325@bncom',age='18' WHERE id = '002'";
         Jdbc.executeUpdate(SQL);
        return null;
    }
/////////////////////////
public User getUser(String id)   {

    String SQL= "SELECT * FROM tb_user WHERE id='"+id+"'";
    List<User> userList = new ArrayList<User>();
    Connection con =Jdbc.getCoonection();
    ResultSet rs =null;
    Statement stm=null;
    try {
        stm= con.createStatement();
       rs = stm.executeQuery(SQL);
        while (rs.next())
        {
            User user = new User();
            user.setId(rs.getString("id"));
            user.setName(rs.getString("name"));
            user.setMail(rs.getString("mail"));
            user.setAge(rs.getInt("age"));
            user.setPassid(rs.getString("passid"));
            userList.add(user);
        //    System.out.println(rs.getString("id") + ", " + rs.getString("name") + ", " + rs.getString("mail")+ ", " + rs.getInt("age")+ ", " +rs.getString("type"));
        }
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        try{
            rs.close();
            stm.close();
            con.close();
    }catch (Exception e){
            e.printStackTrace();
        }


    }


    return userList.get(0);
}
/////////////////////////
    public boolean deleteUser(String id){
        String SQL="DELETE FROM tb_user WHERE id ='"+id+"'";
       return Jdbc.execuDelete(SQL);

    }

    public static void main(String[] args) {
        UserServices userServices= new UserServices();
      User user =userServices.getUser("007");

      System.out.println(user.toString());
    }

}
