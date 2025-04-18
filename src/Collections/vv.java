package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class vv {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(23);
        v.add(45);
        v.add(67);
        Enumeration env = v.elements();
        while (env.hasMoreElements()){
             Integer a = (Integer) env.nextElement();
            System.out.println(a);
        }
    }



}
