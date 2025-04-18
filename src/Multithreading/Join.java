package Multithreading;
class spd implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0; i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }


    }
}

public class Join {
    //Join Types
    // Join(Full wait)
    //Join(Kuch miliseconds)
    //Join(Kuch mili and nano seconds)
    public static void main(String[] args) {
        spd s1 = new spd();
        Thread t1 = new Thread(s1);
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");



    }
}
