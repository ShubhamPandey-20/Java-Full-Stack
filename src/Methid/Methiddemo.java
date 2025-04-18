package Methid;

public class Methiddemo {

    public static void main(String[] args) {
        print();
        int a = samosa();
        System.out.println(a);
        //arguments
         name("Shubham" , 24);
          int c = add(12,13);
        System.out.println(c);
    }


    public static void  print(){
        System.out.println("Hello");
    }

    public static int samosa(){
        return 1;
    }
     //parameter
    public static void name(String name, int age){
        System.out.println(name+age);
    }
    public static int add(int a , int b){
        return a+b;
    }
}
