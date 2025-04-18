package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class cop  {
    // sort emp object based on emp id
    // sort emp object based on emp name
    public static void main(String[] args) {
        emp e1 = new emp(1 , "Shubham");
        emp e2 = new emp(2 , "Shubham1");
        emp e3 = new emp(3 , "Shubham2");
        emp e4 = new emp(4 , "Shubham3");
        TreeSet<emp> ts = new TreeSet<>(new emp());
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        System.out.println(ts);



    }


}

class emp implements Comparator {
     private int id;

    public emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    emp(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        emp ee1 = (emp) o1;
        emp ee2 = (emp) o2;
        if(ee1.getId()>ee2.getId()){
            return 1;
        } else if (ee1.getId()<ee2.getId()) {
            return -1;

        }
        else{
            return 0;
        }

    }
}


