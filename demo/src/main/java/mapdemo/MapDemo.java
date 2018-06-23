package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String > mp=new HashMap<String,String>() ;
        mp.put("1","2");
        mp.put("3","4");
        mp.containsValue("as");
        //System.out.println(mp);
        ////////////////////////////
        //map遍历的三种方法
        for (String key : mp.keySet()) {

            System.out.println("第一种方法key= "+key+" and value= "+mp.get(key));

        }

        System.out.println("第二种方法通过Map.entrySet使用iterator遍历key和value：");

  Iterator<Map.Entry<String,String>> it=mp.entrySet().iterator();
  while (it.hasNext()){

      Map.Entry<String,String> s=it.next();
      System.out.println("key---"+s.getKey()+",value---"+s.getValue());
      //容量大的时候推荐这种
  }


        for(String v : mp.values()){

            System.out.println("第三种方法value = "+v);

        }
    }

}
