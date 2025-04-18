package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {
    public static void main(String[] args) {
        ArrayList<Integer> ab = new ArrayList<>();
        ab.add(12);
        ab.add(23);
        ab.add(45);

        ListIterator<Integer> aa =  ab.listIterator();
        while(aa.hasNext()){
            Integer bn = (Integer) aa.next();
            if(bn==23){
                aa.remove();

            }
            System.out.println(bn);




        }

    }





}
