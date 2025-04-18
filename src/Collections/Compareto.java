package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Compareto {
    public static void main(String[] args) {
        // Comparator
        TreeSet<Integer> t = new TreeSet<>();
        emp2 e1 = new emp2(1,"Shubham", 23000);
        emp2 e2 = new emp2(2,"Shubha", 23);
        emp2 e3 = new emp2(3,"Shubh", 230);
        emp2 e4 = new emp2(4,"Shub", 2);
        emp2 e5= new emp2(5,"Shu", 2356);
        TreeSet<emp2> ts= new TreeSet<>(new emp2());
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        System.out.println(ts);



    }
}
class emp2 implements Comparator {
    int id;
    String name;
    int sal;

    public emp2(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public emp2() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "emp2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }


    @Override
    public int compare(Object o1, Object o2) {
        emp2 e1 = (emp2) o1;
        emp2 e2 = (emp2) o2;
        if(e1.getSal()>e2.getSal()){
            return 1;
        } else if ((e1.getSal()<e2.getSal())) {
            return -1;

        }
        else {
            return 0;
        }


    }
}
