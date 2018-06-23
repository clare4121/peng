package thread;

import com.sun.corba.se.impl.orb.ParserTable;

import java.util.Date;

public class ThreadDemo {

    public static void main(String[] args) {

       ThreadDemo td=new ThreadDemo();
       td.Test("a");

       new Thread(){
           public void run(){
               ThreadDemo td= new ThreadDemo();
               td.Test("b");
           }
       }.start();
    }

    public  void  Test(String a){
        for (int i=0;i<20;i++){
            System.out.println(new Date()+"i:"+i+a);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
