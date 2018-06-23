package mapdemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
Collection sd=new HashSet();
sd.add("a");
sd.add("b");
sd.add("a");
       System.out.println(sd);
//        Iterator it =sd.iterator();
//        while (it.hasNext()){
//            String s=(String)it.next();
//            System.out.println(s);
//        }
    }
}



