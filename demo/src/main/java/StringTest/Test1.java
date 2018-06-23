package StringTest;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
//        String str="abc";
//        System.out.println(str);
//        str=str+"de";
//        System.out.println(str);
        String str="abc"+"de";
         StringBuilder stringBuilder=new StringBuilder().append("abc").append("de");
         System.out.println(new Date()+str+"====111");
         System.out.println(new Date()+stringBuilder.toString()+"======222");
    }

}
