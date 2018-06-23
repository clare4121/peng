package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String args[]) {
        Map map = new HashMap();
        map.put("f",3);
        map.put("b",3);
        map.put("g",3);
        map.put("d",3);
        map.put("e",3);
        String a=new String();
        Integer ONE = new Integer(1);
        for (int i=0, n=args.length; i<n; i++) {
            String key = args[i];
            Integer frequency = (Integer)map.get(key);
            if (frequency == null) {
                frequency = ONE;
            } else {
                int value = frequency.intValue();
                frequency = new Integer(value + 1);
            }
            map.put(key, frequency);
        }
        System.out.println(map);
        Map sortedMap = new TreeMap(map);
        System.out.println(sortedMap);
    }
}
