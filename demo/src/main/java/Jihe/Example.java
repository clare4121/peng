package Jihe;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Example<T> {
    public void get1(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Example<String> s= new Example<String>();
        Example<User>  t= new Example<User>();
        s.get1("ssss");
        t.get1(new User());
    }
}

