package Collections;

public class Abstractclass {
    //half knowlege ke sath class usse abstract class bolenge
    public static void main(String[] args) {
        sp b1 = new sp();
        b1.eat();

    }
}

abstract class Bird{
     abstract  public void sound();

     public void eat(){
         System.out.println("Hello");
     }


}
class sp extends Bird{

    @Override
    public void sound() {

    }
    

}




