package Accessmodifier;
import Basics.Typeofvar;

public class Acm extends Typeofvar {
    //public used for classes method variable and it can be accessed from anywhere
    //protected can be accessed in the same package + subclasses by extending the parent class , in diff package
    // we can use it by importing the package and exending the class

    // default only same package
    //private only in same classess

    public static void main(String[] args) {


       // System.out.println(a);

    }

    public   void fun(){
        System.out.println(a);
    }

}
