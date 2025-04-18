package Collections;

import Oops.In;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ma {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"Two");
        Set<Map.Entry<Integer, String>> h = hm.entrySet();
         Iterator<Map.Entry<Integer, String>> ab =  h.iterator();
         while (ab.hasNext()){
             Map.Entry<Integer, String> bm = ab.next();
             System.out.println(bm);
         }

         for(String a : hm.values()){
             System.out.println(a);
         }

         hm.forEach((k,v)->System.out.println("Key"+k +"Value" +v));



    }
}
