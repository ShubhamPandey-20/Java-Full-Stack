package Multithreading;

class Ru implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<6; i++){
            System.out.println(i+"Child Thread");
        }

    }
}

public class Run {
    public static void main(String[] args) {

        Thread t = new Thread(new Ru());
        t.start();
        System.out.println(t.getName());
        t.setName("1st");
        System.out.println(t.getName());

        for(int i = 0; i<7; i++){
            System.out.println("Parent thread");

        }
    }
}
