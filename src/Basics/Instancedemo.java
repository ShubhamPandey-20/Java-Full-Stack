package Basics;

public class Instancedemo {
       static String name = "Shubham";

    public static void main(String[] args) {
        Instancedemo i = new Instancedemo();
        Instancedemo i2 = new Instancedemo();
        System.out.println(Instancedemo.name);

        i.name = "SP";

        System.out.println(i.name);
        System.out.println(i2.name);


    }




}
