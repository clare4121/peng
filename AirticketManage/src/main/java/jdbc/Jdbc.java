package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
    private static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=AirTicket";
    private static String userName="sa";
    private static String userPwd="123";
    public static Connection getCoonection()
    { try
    {
        Class.forName(driverName);
       Connection conn =  DriverManager.getConnection(dbURL,userName,userPwd);
//        Class.forName(driverName);
//        Connection conn= DriverManager.getConnection(dbURL,userName,userPwd);
        return conn;
    }
        catch(Exception e)
    {
        e.printStackTrace();
        System.out.print("----------------连接失败");
    }
        return null;
    }
////////////////////////////////上部分为jdbc链接部分

///////////////数据库插入部分
    public static Boolean executInsert(String SQL)
    {
     boolean result =false;
        try
        {
            Connection conn=getCoonection();
            System.out.println("---------------连接数据库成功");
//首先测试显示数据库链接成功，与更新 ，查询部分类似。确认链接成功后再进行下面的操作。
            Statement stmt = conn.createStatement();
            result= stmt.execute(SQL);
            stmt.close();
            conn.close();
//关闭操作
            return  result;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("----------------查询失败");
        }
        return result;
    }
    /////////////////////////////////////////为数据库更新部分。
    public static int  executeUpdate(String SQL)
    {
        int result=0;
        try
        {
            Connection conn=getCoonection();
            System.out.println("---------------连接数据库成功");
//首先测试显示数据库链接成功，与查询，插入部分类似。确认链接成功后再进行下面的操作。
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(SQL);
            stmt.close();
            conn.close();

        }

        catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("----------------更新失败");
        }
        return result;
    }
//////////////////////////////部分为查询数据库部分
    public static ResultSet executeQuery(String SQL)
    {
        try
        {
            Connection conn=getCoonection();
            System.out.println("---------------连接数据库成功");
//首先测试显示数据库链接成功，与更新，插入部分类似。确认链接成功后再进行下面的操作。
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next())
        {
            System.out.println(rs.getString("id") + ", " + rs.getString("name") + ", " + rs.getString("mail")+ ", " + rs.getInt("age")+ ", " +rs.getString("type"));
        }
             rs.close();
            stmt.close();
            //关闭操作
            return  rs;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("----------------查询失败");
        }
        return null;
    }

///////////////数据库删除部分
    public static Boolean execuDelete(String SQL){
        boolean result =false;

        try
        {
            Connection conn=getCoonection();
            System.out.println("---------------连接数据库成功");
//首先测试显示数据库链接成功，与更新 ，查询部分类似。确认链接成功后再进行下面的操作。
            Statement stmt = conn.createStatement();
            result=stmt.execute(SQL);
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("----------------查询失败");
        }
        return result;
    }


}
