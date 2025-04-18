package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class it {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(23);
        a.add(45);
        a.add(56);
        Iterator<Integer> aa = a.iterator();
        while (aa.hasNext()){
             Integer bc =(Integer) aa.next();
             if(bc==45){
                 aa.remove();
             }

        }
        System.out.println(a);

    }
}
